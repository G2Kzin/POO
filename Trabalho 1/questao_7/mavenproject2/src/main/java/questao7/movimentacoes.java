package questao7;

import java.util.ArrayList;
import java.util.List;

public class movimentacoes {
    private int numero;
    private double saldo;
    private boolean especial;
    private double limite;
    List<movimentacoes> movimentacoes;

    public movimentacoes(int numero, boolean especial, double limite) {
        this.numero = numero;
        this.saldo = 0.0;
        this.especial = especial;
        this.limite = limite;
        this.movimentacoes = new ArrayList<>();
    }

    movimentacoes(String descricao, double valor, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean especial() {
        return especial;
    }

    public double getLimite() {
        return limite;
    }

    public List<movimentacoes> getMovimentacoes() {
        return movimentacoes;
    }

    public void depositar(double valor, String descricao) {
        saldo += valor;
        movimentacoes.add(new movimentacoes(descricao, valor, true));
    }

    public boolean sacar(double valor, String descricao) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            movimentacoes.add(new movimentacoes(descricao, valor, false));
            return true;
        }
        return false;
    }

    public void transferir(ContaCorrente destino, double valor, String descricao) {
        if (this.sacar(valor, "\nTransferência para conta " + destino.getNumero() + " - " + descricao)) {
            destino.depositar(valor, "\nTransferência recebida de conta " + this.getNumero() + " - " + descricao);
        }
    }

    public void emitirExtrato() {
        System.out.println("\nExtrato da conta " + numero);
        for (movimentacoes m : movimentacoes) {
            System.out.println(m);
        }
        System.out.println("Saldo atual: " + saldo);
    }
}

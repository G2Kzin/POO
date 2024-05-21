package questao7;

public class Main{
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarConta(1, true, 100);
        banco.criarConta(2, false, 1000);

        banco.deposito(1, 700, "Depósito inicial");
        banco.saque(1, 300, "Saque para despesas");
        banco.transferir(2, 1, 100, "\nPagamento de serviço:\n");

        banco.emitirSaldo(1);
        banco.emitirExtrato(1);

        banco.deposito(2, 1000, "Depósito inicial");
        banco.saque(1, 500, "Saque para despesas");
        banco.transferir(2, 1, 100, "\nPagamento de serviço:\n");

        banco.emitirSaldo(2);
        banco.emitirExtrato(2);
    }
}

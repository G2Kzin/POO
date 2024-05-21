
package p.questao_4;

public class Veiculo {
    protected String cor;
    protected float potencia;
    protected int ano;
    protected float valor;

    public Veiculo(String cor, float potencia, int ano, float valor) {
        this.cor = cor;
        this.potencia = potencia;
        this.ano = ano;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    static class Motocicletas extends Veiculo {
        private int cilidrada;

        public Motocicletas(String cor, float potencia, int ano, float valor, int cilidrada) {
            super(cor, potencia, ano, valor); //super é usado para pegar as caracteristicas da herança
            this.cilidrada = cilidrada;
        }

        public int getCilidrada() {
            return cilidrada;
        }

        public void setCilidrada(int cilidrada) {
            this.cilidrada = cilidrada;
        }
    }
    static class Carro extends Veiculo {
        private int numPortas;

        public Carro(String cor, float potencia, int ano, float valor, int numPortas) {
            super(cor, potencia, ano, valor);
            this.numPortas = numPortas;
        }

        public int getNumPortas() {
            return numPortas;
        }

        public void setNumPortas(int numPortas) {
            this.numPortas = numPortas;
        }
    }
    static class Caminhao extends Veiculo {
        private float capCargas;

        public Caminhao(String cor, float potencia, int ano, float valor, float capCargas) {
            super(cor, potencia, ano, valor);
            this.capCargas = capCargas;
        }

        public float getCapCargas() {
            return capCargas;
        }

        public void setCapCargas(float capCargas) {
            this.capCargas = capCargas;
        }
    }
}

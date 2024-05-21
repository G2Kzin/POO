
package p.main;



public class Notas {
    private float primeirotrabalho;
    private float segundotrabalho;
    private float terceirotrabalho;
    private float quartotrabalho;
    private float prova1;
    private float prova2;

    public Notas(float primeirotrabalho, float segundotrabalho, float terceirotrabalho, float quartotrabalho, float prova1, float prova2) {
        this.primeirotrabalho = primeirotrabalho;
        this.segundotrabalho = segundotrabalho;
        this.terceirotrabalho = terceirotrabalho;
        this.quartotrabalho = quartotrabalho;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public float getprimeirotrabalho() {
        return primeirotrabalho;
    }

    public void setprimeirotrabalho(float primeirotrabalho) {
        this.primeirotrabalho = primeirotrabalho;
    }

    public float getsegundotrabalho() {
        return segundotrabalho;
    }

    public void setsegundotrabalho(float segundotrabalho) {
        this.segundotrabalho = segundotrabalho;
    }

    public float getterceirotrabalho() {
        return terceirotrabalho;
    }

    public void setterceirotrabalho(float terceirotrabalho) {
        this.terceirotrabalho = terceirotrabalho;
    }

    public float getquartotrabalho() {
        return quartotrabalho;
    }

    public void setquartotrabalho(float quartotrabalho) {
        this.quartotrabalho = quartotrabalho;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova1) {
        this.prova1 = prova1;
    }

    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova2) {
        this.prova2 = prova2;
    }

    public float calcularMediaFinal() {
        float mediaParte1 = (primeirotrabalho + segundotrabalho + prova1) / 3;
        float mediaParte2 = (terceirotrabalho + quartotrabalho + prova2) / 3;
        return (mediaParte1 + mediaParte2) / 2;
    }

    public boolean foiAprovado() {
        return calcularMediaFinal() >= 6;
    }
}

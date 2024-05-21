package p.calculadora;

    public abstract class Calculadora {
    public abstract float somar(float a, float b);
    public abstract float subtrair(float a, float b);
    public abstract float multiplicar(float a, float b);
    public abstract float dividir(float a, float b);

}

class CalculadoraCompleta extends Calculadora{

    @Override
    public float somar(float a, float b) {return a + b;}

    @Override
    public float subtrair(float a, float b) {return a - b;}

    @Override
    public float multiplicar(float a, float b) {return a * b;}

    @Override
    public float dividir(float a, float b) {
        if(b == 0) {
            throw new ArithmeticException("A calculadora não aceita divisão por 0!");
        }
        return a / b;}

    public float RaizQuadrada (float a){
        if(a < 0){
            throw new ArithmeticException("Não é possível calcular raiz quadrada de número negativo!");

        }
        return (float)Math.sqrt(a);
    }
    public float Potenciade2 (float a){
        return (float)Math.pow(a, 2);
    }

}

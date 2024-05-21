package p.calculadora;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

        Scanner LerUser = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float num1 = LerUser.nextFloat();
        System.out.print("Digite o segundo número: ");
        float num2 = LerUser.nextFloat();

        System.out.print("Digite um número para calcular a Raiz Quadrada: ");
        float numQ = LerUser.nextFloat();

        System.out.print("Digite um número para calcular a Potência: ");
        float numP = LerUser.nextFloat();

        CalculadoraCompleta Calculo = new CalculadoraCompleta();

        System.out.println("Soma: " + Calculo.somar(num1,num2));

        System.out.println("Subtração: " + Calculo.subtrair(num1, num2));

        System.out.println("Multiplicação: " + Calculo.multiplicar(num1, num2));

        System.out.println("Divisão: " + Calculo.dividir(num1, num2));

        //Funções
        System.out.println("Raiz Quadrada: " + Calculo.RaizQuadrada(numQ));

        System.out.println("Potência ao quadrado: " + Calculo.Potenciade2(numP));

    }
}

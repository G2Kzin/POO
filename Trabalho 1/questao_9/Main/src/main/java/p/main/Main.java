package p.main;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Cinema ingresso = new Cinema(LocalDate.of(2024, 7, 17), LocalTime.of(21, 30), "Sala 10", 35);
        LocalDate dataNascimento1 = LocalDate.of(2017, 7, 17);
        LocalDate dataNascimento2 = LocalDate.of(2018, 2, 15);
        LocalDate dataNascimento3 = LocalDate.of(2020, 5, 17);
        LocalDate dataNascimento4 = LocalDate.of(2024, 3, 15);

        System.out.println(ingresso);

        float ValorD1 = ingresso.calculaDesconto(dataNascimento1);
        float ValorD2 = ingresso.calculaDesconto(dataNascimento2, 3333);
        float ValorD3 = ingresso.calculaDesconto(dataNascimento3, 4444);
        float ValorD4 = ingresso.calculaDesconto(dataNascimento4, 5555);

        float valorFinal1 = ingresso.calculaDescontoHorario(ValorD1);
        float valorFinal2 = ingresso.calculaDescontoHorario(ValorD2);
        float valorFinal3 = ingresso.calculaDescontoHorario(ValorD3);
        float valorFinal4 = ingresso.calculaDescontoHorario(ValorD4);

        System.out.println("\nValor final para menor de 12 anos: " + valorFinal1);
        System.out.println("Valor final para estudante de 12 a 15 anos: " + valorFinal2);
        System.out.println("Valor final para estudante de 16 a 20 anos: " + valorFinal3);
        System.out.println("Valor final para estudante acima de 20 anos: " + valorFinal4);
    }
}

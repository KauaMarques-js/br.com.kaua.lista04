package br.com.kaua.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(br);

        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / notas.length;

        System.out.println(String.format(br, "Média: %.2f", media));
        if (media >= 6) {
            System.out.println("Situação: aprovado");
        } else {
            System.out.println("Situação: reprovado");
        }

        sc.close();
    }
}

package br.com.kaua.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(br);

        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            total += precos[i];
        }

        System.out.println("\nPreços lidos:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println(String.format(br, "Produto %d: R$ %.2f", i + 1, precos[i]));
        }

        System.out.println(String.format(br, "Total da compra: R$ %.2f", total));

        sc.close();
    }
}

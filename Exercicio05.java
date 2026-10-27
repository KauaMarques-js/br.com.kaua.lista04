package br.com.kaua.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(br);

        double[] precos = new double[5];
        double[] comDesconto = new double[5];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preço do produto " + (i + 1) + ": ");
            precos[i] = sc.nextDouble();
            comDesconto[i] = precos[i] * 0.90;
        }

        System.out.println();
        for (int i = 0; i < precos.length; i++) {
            System.out.println(String.format(br,
                    "Produto %d: original R$ %.2f | com desconto R$ %.2f",
                    i + 1, precos[i], comDesconto[i]));
        }

        sc.close();
    }
}

package br.com.kaua.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(br);

        System.out.print("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();
        System.out.print("Digite a taxa de juros simples mensal (%): ");
        double taxa = sc.nextDouble();

        double[] devido = new double[12];

        for (int i = 0; i < devido.length; i++) {
            int mes = i + 1;
            devido[i] = valor + valor * taxa / 100 * mes;
        }

        System.out.println();
        for (int i = 0; i < devido.length; i++) {
            System.out.println(String.format(br, "Mês %d: R$ %.2f", i + 1, devido[i]));
        }

        sc.close();
    }
}

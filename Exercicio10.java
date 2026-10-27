package br.com.kaua.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(br);

        System.out.print("Digite a quantidade de itens da compra: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida.");
            sc.close();
            return;
        }

        double[] precos = new double[n];
        int[] quantidades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Item " + (i + 1) + " - preço unitário: ");
            precos[i] = sc.nextDouble();
            System.out.print("Item " + (i + 1) + " - quantidade: ");
            quantidades[i] = sc.nextInt();
        }

        double total = 0;

        System.out.println();
        for (int i = 0; i < n; i++) {
            double subtotal = precos[i] * quantidades[i];
            total += subtotal;
            System.out.println(String.format(br, "Item %d - subtotal: R$ %.2f", i + 1, subtotal));
        }

        double desconto = 0;
        if (total > 200.00) {
            desconto = total * 0.05;
        }

        double valorFinal = total - desconto;

        System.out.println(String.format(br, "Total da compra: R$ %.2f", total));
        System.out.println(String.format(br, "Desconto: R$ %.2f", desconto));
        System.out.println(String.format(br, "Valor final a pagar: R$ %.2f", valorFinal));

        sc.close();
    }
}

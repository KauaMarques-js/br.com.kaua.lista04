package br.com.kaua.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(br);

        int[] codigos = {101, 205, 310, 420, 550};
        double[] precos = {4.50, 12.00, 7.90, 25.00, 3.20};

        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();

        int posicao = -1;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                posicao = i;
                break;
            }
        }

        if (posicao >= 0) {
            System.out.println(String.format(br, "Preço do produto %d: R$ %.2f", codigo, precos[posicao]));
        } else {
            System.out.println("Produto não encontrado.");
        }

        sc.close();
    }
}

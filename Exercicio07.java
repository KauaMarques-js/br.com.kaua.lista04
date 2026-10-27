package br.com.kaua.lista04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(br);

        double[] salarios = new double[6];
        double soma = 0;

        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = sc.nextDouble();
            soma += salarios[i];
        }

        double maior = salarios[0];
        double menor = salarios[0];

        for (int i = 1; i < salarios.length; i++) {
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }

        double media = soma / salarios.length;

        int acimaDaMedia = 0;
        for (int i = 0; i < salarios.length; i++) {
            if (salarios[i] > media) {
                acimaDaMedia++;
            }
        }

        System.out.println();
        System.out.println(String.format(br, "Maior salário: R$ %.2f", maior));
        System.out.println(String.format(br, "Menor salário: R$ %.2f", menor));
        System.out.println(String.format(br, "Média salarial: R$ %.2f", media));
        System.out.println("Funcionários acima da média: " + acimaDaMedia);

        sc.close();
    }
}

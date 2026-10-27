package br.com.kaua.lista04;

import java.util.Locale;

public class Exercicio02 {
    public static void main(String[] args) {
        double[] precos = new double[3];

        precos[0] = 12.90;
        precos[1] = 5.50;
        precos[2] = 30.00;

        Locale br = Locale.forLanguageTag("pt-BR");
        for (int i = 0; i < precos.length; i++) {
            System.out.println(String.format(br, "Produto %d: R$ %.2f", i + 1, precos[i]));
        }
    }
}

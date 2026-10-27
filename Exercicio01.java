package br.com.kaua.lista04;

public class Exercicio01 {
    public static void main(String[] args) {
        double[] notas = {7.5, 6.0, 8.0, 5.5};

        int ultimoIndice = notas.length - 1;

        System.out.println("Quantidade de notas: " + notas.length);
        System.out.println("Primeira nota: " + notas[0]);
        System.out.println("Última nota: " + notas[ultimoIndice]);
    }
}

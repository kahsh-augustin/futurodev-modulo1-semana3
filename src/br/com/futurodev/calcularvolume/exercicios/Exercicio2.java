package br.com.futurodev.calcularvolume.exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        final int TAMANHO_ARRAY = 3; // Constante com o tamanho do array

        Scanner entrada = new Scanner(System.in);
        double[] numeros = new double[TAMANHO_ARRAY]; // Cria um array de tamanho fixo

        System.out.println("Informe " + TAMANHO_ARRAY + " números para calcular a média:");
        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = entrada.nextDouble();
        }

        double media = 0;
        for (double numero : numeros) { // Percorre o array
            media += numero; // Soma "media" e "numero"
        }
        media /= TAMANHO_ARRAY; // Divide "media" pelo "TAMANHO_ARRAY"
        System.out.println("A média é: " + media);

    }

}

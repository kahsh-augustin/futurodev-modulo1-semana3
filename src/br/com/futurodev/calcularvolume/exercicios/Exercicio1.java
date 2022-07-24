package br.com.futurodev.calcularvolume.exercicios;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        final int TAMANHO_ARRAY = 10; // Constante com o tamanho do array

        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[TAMANHO_ARRAY]; // Cria um array de tamanho fixo

        System.out.println("Informe " + TAMANHO_ARRAY + " números:");
        for (int i = 0; i < numeros.length; i++) {
           numeros[i] = entrada.nextInt();
        }

        System.out.print("Os números digitados foram:");
        for (int numero : numeros) { // Percorre o array
            System.out.print(" " + numero); // Exibe os numeros informados
        }

    }

}

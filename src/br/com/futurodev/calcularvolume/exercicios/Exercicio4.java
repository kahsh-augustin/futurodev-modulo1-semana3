package br.com.futurodev.calcularvolume.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        final int LIMITE = 100;

        int numeroAleatorio = new Random().nextInt(LIMITE + 1); // Cria um número aleatório entre ZERO e LIMITE
        System.out.println("Informe um múltiplo do número " + numeroAleatorio + ":");

        Scanner entrada = new Scanner(System.in);
        int numeroInformado = 0;
        do {
            numeroInformado = entrada.nextInt();
        } while (numeroInformado % numeroAleatorio != 0); // Repete enquanto o resto da divisão for diferente de ZERO (Enquanto não é multiplo)

        System.out.println("Parabéns! Está correto.");

    }

}

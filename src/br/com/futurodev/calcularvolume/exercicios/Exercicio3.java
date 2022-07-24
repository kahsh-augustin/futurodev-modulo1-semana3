package br.com.futurodev.calcularvolume.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe quantidade notas para calcular a média: ");
        int quantidade = entrada.nextInt();

        List<Double> notas = new ArrayList<>();

        System.out.println("Informe " + quantidade + " notas:");
        for (int i = 0; i < quantidade; i++) {
            notas.add(entrada.nextDouble());
        }

        double media = 0;
        for (double nota : notas) {
            media += nota; // Soma o valor de "media" com "nota"
        }
        media /= quantidade; // Divide o valor de "media" pela "quantidade"
        System.out.println("A média é: " + media);

    }

}

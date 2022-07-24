package br.com.futurodev.calcularvolume.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        List<String> passatempos = new ArrayList<>();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira todos os seus passatempos ou digite \"fechar\"");
        String passatempoInformado;
        do {
            passatempoInformado = entrada.nextLine(); // Espera o usuário digitar
            if (!passatempoInformado.toUpperCase().equals("FECHAR")) { // ".toUpperCase" deixa a String toda em MAIÚSCULO
                passatempos.add(passatempoInformado); // Adiciona na lista
                System.out.println("Passatempo adicionado.");
            }
        } while (!passatempoInformado.toUpperCase().equals("FECHAR")); // Repete enquanto passatempo diferente de "FECHAR"

        System.out.println("Seus passatempos são:");
        for (String passatempo : passatempos) { // Percorre o ArrayList e exibe o que foi digitado
            System.out.println(passatempo);
        }
    }

}

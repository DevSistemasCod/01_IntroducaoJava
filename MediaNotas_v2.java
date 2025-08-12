package org.example;

import java.util.Scanner;

public class MediaNotas_v2 {
    public static void main(String[] args) {
        String nome;
        float[ ] notas;
        float media, acumuladorDeNotas = 0 ;

        notas = new float[3];
        System.out.println("Informe o nome do aluno: ");
        Scanner entrada = new Scanner(System.in);
        nome = entrada.nextLine();

        for(int i = 0; i < 3 ;i++){
            System.out.printf("Informe a primeira nota[%d]: ",i);
            notas[i] = entrada.nextFloat();
            acumuladorDeNotas = acumuladorDeNotas + notas[i];
        }

        media = acumuladorDeNotas / 3;
        System.out.printf("Aluno: %s \n",nome);
        System.out.printf("Méda: %.2f",media);
        entrada.close();
    }
}

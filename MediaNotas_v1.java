package org.example;

import java.util.Scanner;

public class MediaNotas_v1 {
    public static void main(String[] args) {
        String nome;
        float nota1, nota2, nota3, media;

        System.out.println("Informe o nome do aluno: ");
        Scanner entrada = new Scanner(System.in);
        nome = entrada.nextLine();

        System.out.println("Informe a primeira nota: ");
        nota1 = entrada.nextFloat();

        System.out.println("Informe a segunda nota: ");
        nota2 = entrada.nextFloat();

        System.out.println("Informe a terceira nota: ");
        nota3 = entrada.nextFloat();

        System.out.printf("Aluno: %s \n",nome);
        media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Méda: %.2f",media);
        entrada.close();
    }
}

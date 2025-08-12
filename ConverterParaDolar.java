package org.example;

import java.util.Scanner;

public class ConverterParaDolar {
    public static void main(String[] args) {
        //final garante que o valor atribuído não seja alterado após a inicialização.
        final double COTACAO_DOLAR = 5.10;
        float valor_reais, valor_em_dolar;

        System.out.println("Informe o em Reais: ");
        Scanner entrada = new Scanner(System.in);
        valor_reais = entrada.nextFloat();
        //conversao cast
        valor_em_dolar = (float)(valor_reais / COTACAO_DOLAR );
        System.out.printf("O valor em dolar é: %.2f",valor_em_dolar);
        entrada.close();
    }
}

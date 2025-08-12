package org.example;

import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {
        double celsius,  fahrenheit, kelvin;

        System.out.print("Digite a temperatura em graus Celsius: ");
        Scanner entrada = new Scanner(System.in);
        celsius = entrada.nextDouble();
        fahrenheit = (celsius * 9 / 5) + 32;
        kelvin = celsius + 273.15;

        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", fahrenheit);
        System.out.printf("Temperatura em Kelvin: %.2f K%n", kelvin);

        // Fecha o Scanner
        entrada.close();
    }
}

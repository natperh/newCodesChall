package com.example.suma;

import java.util.Scanner;

public class SumaService {

    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        SumaService sumaService = new SumaService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int num1 = scanner.nextInt();

        System.out.println("Introduce el segundo número:");
        int num2 = scanner.nextInt();

        int resultado = sumaService.sumar(num1, num2);

        System.out.println("El resultado es " + resultado);
    }
}
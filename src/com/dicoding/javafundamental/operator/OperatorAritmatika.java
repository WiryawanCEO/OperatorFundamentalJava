package com.dicoding.javafundamental.operator;

import java.util.Scanner;

public class OperatorAritmatika {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Demo Aritmatika di Java: ");
        System.out.println("1. +\n2. -\n3. *\n4. /\n5. %");
        System.out.println("Masukan value pertama:");
        int value = scanner.nextInt();
        System.out.println("Masukan value kedua");
        int anotherValue = scanner.nextInt();
        System.out.println("Masukan pilihan Aritmatika: ");
        int pilihan = scanner.nextInt();
        int result = 0;

        switch (pilihan){
            case 1: result = value + anotherValue;
            break;
            case 2: result = value - anotherValue;
            break;
            case 3: result = value * anotherValue;
            break;
            case 4: result = value / anotherValue;
            break;
            case 5: result = value % anotherValue;
            default:
                System.out.println("Input 1-5");
        }

        System.out.println("Hasilnya ->> "+result);


    }
}

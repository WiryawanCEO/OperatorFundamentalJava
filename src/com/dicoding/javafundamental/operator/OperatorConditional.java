package com.dicoding.javafundamental.operator;

public class OperatorConditional{
    public static void main(String[] args) {
        int value = 4;
        int anotherValue = 5;

        System.out.println("Conditional AND");
        boolean result = value == 3 && anotherValue == 5;
        System.out.println(result);
        boolean anotherResult = value != 3 && anotherValue == 5;
        System.out.println(anotherResult);

        System.out.println("Conditional OR");
        result = value == 3 || anotherValue == 5;
        System.out.println(result);
        anotherResult = value != 3 || anotherValue == 5;
        System.out.println(anotherResult);

    }
}

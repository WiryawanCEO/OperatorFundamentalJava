package com.dicoding.javafundamental.operator;

public class OperatorEquality {
    public static void main(String[] args) {
        int value = 5;
        int anotherValue = 9;
        boolean result;
        result = value == anotherValue;
        System.out.println("== operator --> "+result);
        result = value != anotherValue;
        System.out.println("!= operator --> "+result);
        result = value > anotherValue;
        System.out.println("> operator --> "+result);
        result = value < anotherValue;
        System.out.println("< operator --> "+result);
        result = value >= anotherValue;
        System.out.println(">= operator --> "+result);
        result = value <= anotherValue;
        System.out.println("<= operator --> "+result);
    }
}

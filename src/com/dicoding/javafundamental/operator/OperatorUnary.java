package com.dicoding.javafundamental.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        System.out.println("Operator Unary Plus");
        int initialValue = 5;
        int result = +initialValue;
        System.out.println("Hasil +5 = "+result+"\n");

        System.out.println("Operator Unary Plus");
        int initialValue2 = 5;
        int result2 = -initialValue2;
        System.out.println("Hasil -5 = "+result2+"\n");

        System.out.println("Operator Unary Plus");
        int initialValue3 = 5;
        initialValue3++;
        System.out.println("Hasil 5++ = "+initialValue3+"\n");

        System.out.println("Operator Unary Plus");
        int initialValue4 = 5;
        initialValue4--;
        System.out.println("Hasil 5-- = "+initialValue4+"\n");

        System.out.println("Operator Unary Plus");
        boolean success = false;
        System.out.println("Hasil !false = "+!success);
    }
}

package com.example;

public class App {
    public static void main(String[] args) throws Exception {

        byte num = 127;
        short num0 = 32767;
        int num1 = 2147483647;
        long num2 = 199999999999999999L;

        double num3 = 121230000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000083.213D;
        float num4 = 100000000000000000000000000000000000083.123F;

        char caracter = 'a';
        String texto = "texto";

        boolean verdadero = !false;

        System.out.println("byte: " + num);
        System.out.println("short: " + num0);
        System.out.println("int: " + num1);
        System.out.println("long: " + num2);
        System.out.println("double: " + num3);
        System.out.println("float: " + num4);
        System.out.println("char: " + caracter);
        System.out.println("String: " + texto);
        System.out.println("boolean: " + verdadero);
    }
}

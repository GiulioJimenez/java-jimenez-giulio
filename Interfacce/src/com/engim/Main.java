package com.engim;

public class Main {

    public static void main(String[] args) {
        Verifica v1 = new Verifica(99);

        Verifica v2 = new Verifica(10);
        System.out.println(v1.compareTo(v2));

    }
}

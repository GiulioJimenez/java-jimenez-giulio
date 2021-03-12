package com.engim;

import java.util.Scanner;

public class Calcolatrice {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();
        boolean esci = false;
        String s = tastiera.nextLine();

        String[] buffer = s.split(" ");
        for(String elem: buffer) {
            try {
                double d = Double.parseDouble(elem);
                stack.push(d);
            } catch (Exception e) {
                switch (elem) {
                    case "+":
                        addizione(stack);
                        break;
                    case "-":
                        sottrazione(stack);
                        break;
                    case "*":
                        moltiplicazione(stack);
                    case "/":
                        divisione(stack);
                        break;
                    default:
                        System.out.println("Errore");
                        System.exit(0);
                }

            }
        }
        stack.stampa();


    }

    public static void addizione(Stack<Double> stack) {
        if(stack.size() > 1) {
            Double a = stack.pop();
            Double b = stack.pop();
            stack.push(a+b);
        }else {
            System.out.println("Errore nella sintassi");
        }
    }

    public static void sottrazione(Stack<Double> stack) {
        if(stack.size() > 1) {
            Double a = stack.pop();
            Double b = stack.pop();
            stack.push(b-a);
        }else {
            System.out.println("Errore nella sintassi");
        }
    }

    public static void moltiplicazione(Stack<Double> stack) {
        if(stack.size() > 1) {
            Double a = stack.pop();
            Double b = stack.pop();
            stack.push(a*b);
        }else {
            System.out.println("Errore nella sintassi");
        }
    }

    public static void divisione(Stack<Double> stack) {
        if(stack.size() > 1) {
            Double a = stack.pop();
            Double b = stack.pop();
            stack.push(b/a);
        }else {
            System.out.println("Errore nella sintassi");
        }
    }
}

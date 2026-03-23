package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.;
        } else {
            System.out.print("Hello ");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, Bhargavvv !");
        } else {
            StringBuilder names = new StringBuilder();

            for (String name : args) {
                names.append(name).append(" ");
            }

            System.out.println("Hello, " + names.toString().trim() + "!");
        }
    }
}
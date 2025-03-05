package com.agnes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Agnes!");
      Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName);
        scanner.close();

    }
}
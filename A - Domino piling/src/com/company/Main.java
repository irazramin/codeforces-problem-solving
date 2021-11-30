package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int m, n;

        Scanner s = new Scanner(System.in);

        m = s.nextInt();
        n = s.nextInt();

        System.out.println((m*n)/2);
    }
}

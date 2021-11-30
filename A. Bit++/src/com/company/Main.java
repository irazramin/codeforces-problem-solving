package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        int n = in.nextInt();
        int x = 0;


        for (int i = 0; i <= n; i++) {
            String x1 = in.nextLine();
            if (x1.equals("++X")) {
                x = x+1;
            }
            if (x1.equals("X++")) {
                x = x + 1;

            }

            if (x1.equals("--X")) {
                x = x - 1;


            }  if (x1.equals("X--")) {
                x = x - 1;


            }

        }
        System.out.println(x);
    }
}
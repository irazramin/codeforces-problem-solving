package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String[] s1 = s.split("\\+");

        int n = s1.length;
        int[] s2 = new int[s1.length];


        for (int i = 0; i < n; i++) {
            s2[i] = Integer.parseInt(s1[i]);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (s2[j - 1] > s2[j]) {
                    int temp = s2[j - 1];
                    s2[j - 1] = s2[j];
                    s2[j] = temp;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            if (i==n-1) {
                System.out.print(s2[i]);
            } else {
                System.out.print(s2[i] + "+");
            }
        }
    }
}
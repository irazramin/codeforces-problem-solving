package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        int n = in.nextInt();
        String s = in.next();
        for (int i = 0; i < n - 1; i++) {

            if ((s.charAt(i) == s.charAt(i + 1)) && s.charAt(i) == 'R') {
                count++;
            }

        }

        System.out.println(count);

    }
}

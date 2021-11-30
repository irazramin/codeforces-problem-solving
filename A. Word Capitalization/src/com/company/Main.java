package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String c = String.valueOf(s.charAt(0));
        System.out.print(c.toUpperCase() + s.substring(1, s.length()));
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int l = in.nextInt();
        int b = in.nextInt();
        int count = 0;

        while (l <= b){
            l*=3;
            b*=2;
            count++;
        }

        System.out.println(count);
    }
}

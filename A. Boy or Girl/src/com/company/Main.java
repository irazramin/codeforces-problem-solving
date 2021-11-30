package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.next();
        int count1 = 0;
        int count3;
        char [] c = name.toCharArray();
        Arrays.sort(c);
        for (int i = 0; i < c.length-1; i++) {
            if(c[i] ==c[i+1]){
                count1++;
            }
        }

        count3 = Math.abs(name.length() - count1);
        if (count3 % 2 != 0) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int a = 0;
        int b = 0;
        int temp = 0;
   
        ArrayList<Integer> count = new ArrayList<>();
        for (int i = 0; i<n; i++){
            a= in.nextInt();
            b = in.nextInt();

                temp = Math.abs(temp) - a;
                count.add(Math.abs(temp));
                temp = Math.abs(temp) + b;
                count.add(temp);

        }

        Integer max = Collections.max(count);
        System.out.println(max);

    }
}

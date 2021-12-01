package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int[] d = new int[]{1, 2, 3, 4, 5};
        ArrayList<Double> res = new ArrayList<>();

        for (int i = 0; i < d.length; i++) {
            res.add((double) x / d[i]);
        }
        Collections.sort(res);

        for (Double index : res){
            print(Math.ceil(index));
            break;
        }

    }

    public static void print(double output) {
        System.out.println((int) output);
    }
}

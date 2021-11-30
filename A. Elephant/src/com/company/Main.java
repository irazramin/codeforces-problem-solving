package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        ArrayList<Float> res = new ArrayList<>();
        int[] moves = new int[]{1, 2, 3, 4, 5};
        double res1 = 0.0;
        for (int i = 0; i<moves.length; i++){
           res1 = x%moves[i];
            print(res1);
        }




    }

    public static void print(double output){
        System.out.println(output);
    }
}

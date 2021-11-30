package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] mtr = new int[5][5];

        int move = 0;

        for (int i = 0; i < mtr.length; i++) {
            for (int j = 0; j < mtr.length; j++) {
                mtr[i][j] = in.nextInt();
                if (mtr[i][j] == 1) {
                    move += Math.abs(2 - i);
                    move += Math.abs(2 - j);
                }
            }

        }

        System.out.println(move);

//        if (countJ + 1 < center) {
//            System.out.println((countJ+1));
//        }

    }

}

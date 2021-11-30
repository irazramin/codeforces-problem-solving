package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x, y, z;
        int totalx = 0;
        int totaly = 0;
        int totalz = 0;

        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();

            totalx = totalx + x;
            totaly = totaly + y;
            totalz = totalz + z;
        }


        if (totalx==0 && totaly==0 && totalz==0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
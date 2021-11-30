package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n = s1.nextInt();
        int k = s1.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {

            arr[i] = s1.nextInt();
        }
        int minValue = arr[k - 1];

        for (int i = 0; i < n; i++) {

            if (arr[i] >= minValue && arr[i] > 0) {
                count++;

            }

        }
        System.out.print(count);

    }
}

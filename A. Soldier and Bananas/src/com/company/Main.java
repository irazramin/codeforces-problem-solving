package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dollars = in.nextInt();
        int n = in.nextInt();
        int bananas = in.nextInt();
		int total = 0;

		for (int i = 1; i <= bananas; i++) {
			total += (i * dollars);
		}

		if (n == 0) {
			print(total);
		}
		else if (total < n){
		    print(0);
        }
        else {
            print(total - n);
        }

    }

    public static void print(int output) {
        System.out.println(output);
    }
}

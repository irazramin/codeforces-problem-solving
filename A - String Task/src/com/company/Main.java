package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char c[]=input.toCharArray();
        int size = input.length();
        String s = new String();
        for(int i=0; i<size; i++)
        {
            if(c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u' && c[i] != 'A' && c[i] != 'E' && c[i] != 'I' && c[i] != 'O' && c[i] != 'U' && c[i] != 'y' && c[i] != 'Y')
            {
                s = s + '.' + c[i];
            }
        }

        System.out.print(s.toLowerCase());
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count1 =0;
        int count2 =0;
        for (int i = 0; i <=s.length()-1; i++) {

          if (Character.isLowerCase(s.charAt(i))){
              count2++;
          }
          if (Character.isUpperCase(s.charAt(i))){
                count1++;
          }
        }
        if (count1==count2){
            print(s.toLowerCase());
        }
        if (count1 > count2){
            print(s.toUpperCase());
        }
        if (count1<count2){
            print(s.toLowerCase());
        }
    }

    public static void print(String output) {
        System.out.println(output);
    }
}

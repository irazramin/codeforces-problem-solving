package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        String f = in.next();
        String zero = "0000000";
        String one = "1111111";

       if (f.contains(zero) || f.contains(one)){
           System.out.println("YES");
       }else {
           System.out.println("NO");
       }
    }
}

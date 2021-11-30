package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a1[] = new int [n];
        int a2[] = new int [n];
        int a3[] = new int [n];
        int sum =0;
        int sum2=0;
        int count=0;
        for(int i = 0; i<n; i++)
        {
            a1[i] = s.nextInt();
            a2[i] = s.nextInt();
            a3[i] = s.nextInt();
        }

        for(int i = 0; i<n; i++)
        {
            if(a1[i] ==1 && a2[i]==1 && a3[i]==1)
            {
                sum = sum+1;
            }
            else   if((a1[i] ==0 && a2[i]==1 && a3[i]==1)||(a1[i] ==1 && a2[i]==0 && a3[i]==1)||(a1[i] ==1 && a2[i]==1 && a3[i]==0))
            {
                sum2 =sum2+1;
                count++;
            }
            if((a1[i] ==0 && a2[i]==1 && a3[i]==1)||(a1[i] ==1 && a2[i]==0 && a3[i]==0)||(a1[i] ==0 && a2[i]==0 && a3[i]==1))
            {

            }
            //  else   if((a1[i] ==1 && a2[i]==1) ||(a1[i] ==1 &&a3[i]==1) ||(a2[i] ==1 && a3[i]==1))
        }
        System.out.println(sum+sum2);


    }
}
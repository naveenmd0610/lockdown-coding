Write a Java program to calculate nPr.

import java.util.Scanner;
public class prog
{
    public static int f(int num)
    {
        int p=1, i;
        for(i=1; i<=num; i++)
        {
            p = p*i;
        }
        returnpf;
    }
    public static void main(String args[])
      {
        int n, r,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        n = sc.nextInt();
        System.out.print("Enter Value of r : ");
        r = sc.nextInt();
      System.out.print("\nNPR = " +(p(n)/(p(n-r))));



    }

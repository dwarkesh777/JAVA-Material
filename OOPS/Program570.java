/*

WAP to find HCF of two numbers using recursion.

*/

import java.util.*;

class Program570 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1: ");
        int a = sc.nextInt();

        System.out.println("Enter Number 2: ");
        int b = sc.nextInt();


        System.out.println(hcf(a,b));

    }

    static int hcf(int a, int b) {

        if (b == 0)
            return a;
        else
            return hcf(b, a % b);

    }

}
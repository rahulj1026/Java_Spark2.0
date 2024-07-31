package logics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=in.nextInt();

        factorial(n);
    }

    static void factorial(int n){
        int f=1;
        for (int i = 1; i <=n ; i++) {
            f=f*i;
        }
        System.out.println("Factorial of the entered no. "+n+" is "+f);
    }
}

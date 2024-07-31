package logics;

import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();

        prime(n);
    }

    static void prime(int n) {
        int count = 0;

        if (n<0) n = n * -1;

        for(int i=1;i<=n;i++){

            if(n%i==0) {
                count = count + 1;
               // System.out.println(i);
            }
        }

        if(count==2){
            System.out.println(n+" is a logics.Prime Number");
        }
        else{
            System.out.println(n+" is a Composite Number");
        }


    }
}
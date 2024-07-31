import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n=sc.nextInt();
        System.out.println("Reverse of "+ n +" is ");
        reversed(n);
    }

     static void reversed(int n) {
        int rev = 0,rem;

        if(n<0) n = n * -1;

        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
         System.out.println(rev);
    }

}

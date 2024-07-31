package logics;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s= sc.nextLine();
        reversal(s);
    }

    static void reversal(String s) {
       // char ch;
        String rev="";
        for(int i=0;i<s.length();i++){
           //ch=s.charAt(i);
            rev=s.charAt(i)+rev;

        }

        System.out.println("Reversed Word is: "+rev);

        if(rev.equals(s)){
            System.out.println("Palindrome String");
        }
        else{
            System.out.println("Not a Palindrome String");
        }
    }
}

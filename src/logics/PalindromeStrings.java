package logics;

import java.util.Scanner;

public class PalindromeStrings {

    // Method to check if a given string is a palindrome
    public static boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept number of strings from the user
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Define an array of strings
        String[] stringArray = new String[n];

        // Accept strings from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            stringArray[i] = scanner.nextLine();
        }

        // Iterate through the array and check if each string is a palindrome
        System.out.println("\nPalindrome Strings:");
        for (String str : stringArray) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
            }
        }

        scanner.close();
    }
}

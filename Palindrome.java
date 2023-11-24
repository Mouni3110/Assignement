import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting input from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Checking if the string is a palindrome
        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

       
    }

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        // Base case: empty or single-character string is a palindrome
        if (str.length() <= 1) {
            return true;
        }

        // Compare the first and last characters
        if (str.charA(0) == str.charAt(str.length() - 1)) {
            // Recursively check the substring without the first and last characters
            return isPalindrome(str.substring(1, str.length() - 1));
        } else {
            return false;
      }
    }
}

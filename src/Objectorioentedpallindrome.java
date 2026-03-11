import java.util.Scanner;

class PalindromeChecker {

    boolean checkPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

public class Objectorioentedpallindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(input))
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}
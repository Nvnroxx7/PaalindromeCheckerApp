import java.util.Scanner;

public class recursive_pallindrome {

    static boolean isPalindrome(String s, int start, int end) {
        if (start >= end)
            return true;
        if (s.charAt(start) != s.charAt(end))
            return false;
        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input, 0, input.length() - 1))
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}
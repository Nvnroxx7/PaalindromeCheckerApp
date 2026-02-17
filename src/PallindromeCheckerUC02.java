import java.util.Scanner;
public class PallindromeCheckerUC02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input text: ");
        String text = scanner.nextLine();
        String reverse = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reverse = reverse + text.charAt(i);
        }
    boolean isPallindrome = text.equals(reverse);
    System.out.println("Is it a pallindrome? : " + isPallindrome);
    scanner.close();

    }

}

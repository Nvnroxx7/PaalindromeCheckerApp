import java.util.Scanner;
import java.util.Stack;
import java.util.Deque;
import java.util.ArrayDeque;

public class performancecomparison {

    static boolean twoPointerCheck(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    static boolean stackCheck(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray())
            stack.push(c);

        String reversed = "";

        while (!stack.isEmpty())
            reversed += stack.pop();

        return s.equals(reversed);
    }

    static boolean dequeCheck(String s) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : s.toCharArray())
            deque.addLast(c);

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast())
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long startTime, endTime;

        startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        endTime = System.nanoTime();
        long time1 = endTime - startTime;

        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        startTime = System.nanoTime();
        boolean result3 = dequeCheck(input);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Two Pointer Method: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Method: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Method: " + result3 + " | Time: " + time3 + " ns");

        sc.close();
    }
}
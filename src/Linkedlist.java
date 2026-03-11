import java.util.Scanner;

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
    }
}

public class Linkedlist {

    static Node reverse(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

    static boolean isPalindrome(Node head) {

        Node slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node second = reverse(slow);

        while (second != null) {
            if (head.data != second.data)
                return false;
            head = head.next;
            second = second.next;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        Node head = null, tail = null;

        for (char c : s.toCharArray()) {
            Node n = new Node(c);
            if (head == null) head = tail = n;
            else {
                tail.next = n;
                tail = n;
            }
        }

        System.out.println(isPalindrome(head) ?
                "The string is a Palindrome." :
                "The string is NOT a Palindrome.");

        sc.close();
    }
}
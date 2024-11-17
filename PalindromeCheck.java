import java.util.*;

public class PalindromeCheck {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        String temp = "";
        
        for (int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);
            temp = temp + ch;
        }
        
        if (temp.equals(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
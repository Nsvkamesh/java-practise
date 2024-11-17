import java.util.*;

public class NumberInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch >= '0' && ch <= '9') {
                System.out.println("Number found: " + ch);
                break;
            }
        }
    }
}
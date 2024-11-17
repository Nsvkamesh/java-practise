import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        String temp = "";

        for (int i = n.length() - 1; i >= 0; i--) {
            char ch = n.charAt(i);
            temp = temp + ch;
        }

        System.out.println(temp);
    }
}
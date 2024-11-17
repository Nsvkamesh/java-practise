import java.util.*;

public class SubstringWithinRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= 0 && b <= n.length() && a < b) {
            String substring = n.substring(a, b);
            System.out.println(substring);
        } else {
            System.out.println("Invalid range");
        }
    }
}
import java.util.*;

public class SpaceToPercent20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == ' ') {
                System.out.print("%20");
            } else {
                System.out.print(ch);
            }
        }
    }
}
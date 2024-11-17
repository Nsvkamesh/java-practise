import java.util.*;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int count = 0;

            for (int j = 0; j < n.length(); j++) {
                if (ch == n.charAt(j)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("1st non-repeated character is: " + ch);
                break;
            }
        }
    }
}
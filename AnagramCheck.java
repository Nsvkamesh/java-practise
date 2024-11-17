import java.util.*;

public class AnagramCheck {
    public static void main(String[] args) {
        String n;
        String m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        m = sc.nextLine();

        char[] ch = n.toCharArray();
        char[] hc = m.toCharArray();

        Arrays.sort(ch);
        Arrays.sort(hc);

        if (Arrays.equals(ch, hc)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an anagram");
        }
    }
}
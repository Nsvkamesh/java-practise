import java.util.*;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        int count = 0;
        int count1 = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            } else if (Character.isAlphabetic(ch)) {
                count1++;
            }
        }

        System.out.println("Vowels are: " + count);
        System.out.println("Consonants are: " + count1);
    }
}
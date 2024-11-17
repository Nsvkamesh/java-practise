import java.util.*;

public class FactorialCalculation {
    public static void main(String args[]) {
        int a = 1;
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            a = a * i;
            System.out.println(a);
        }
    }
}
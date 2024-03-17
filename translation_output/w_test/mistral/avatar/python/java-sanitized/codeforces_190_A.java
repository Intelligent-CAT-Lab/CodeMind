import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (n < 1) {
            if (m < 1) {
                System.out.println(n, m);
                return;
            }
            System.out.println("Impossible");
            return;
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min, max);
        } else {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min, max);
        }
    }
}
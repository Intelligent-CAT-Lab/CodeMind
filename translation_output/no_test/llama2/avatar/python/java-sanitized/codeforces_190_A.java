import java.util.Scanner;

public class codeforces_190_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());
        if (n < 1) {
            if (m < 1) {
                System.out.println(n, m);
                System.exit(0);
            } else {
                System.out.println("Impossible");
                System.exit(0);
            }
        }
        if (m > n) {
            int min = m;
            int max = n + m - 1;
            System.out.println(min, max);
        } else if (m <= n) {
            int min = n;
            int max = n + m - 1;
            if (m == 0) {
                max = n;
            }
            System.out.println(min, max);
        }
    }
}
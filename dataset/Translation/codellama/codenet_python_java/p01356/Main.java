import java.util.Scanner;

public class p01356 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int p = scanner.nextInt();
        int q = scanner.nextInt();

        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                System.out.println(m - (p + q) * n);
            } else {
                int k = m / (p + q);
                System.out.println(Math.min(m - k * (p + q), (k + 1) * (p + q) - m));
            }
        } else {
            int ans = m;
            for (int i = Math.min(n - 1, 40); i >= 0; i--) {
                int f = p * (int) Math.pow(a, i) + q * (int) Math.pow(b, i);
                if (m < f) {
                    ans = Math.min(ans, f - m);
                } else {
                    m -= f;
                    ans = Math.min(ans, m);
                }
            }
            System.out.println(ans);
        }
    }
}
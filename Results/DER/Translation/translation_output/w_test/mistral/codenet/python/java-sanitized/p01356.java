import java.util.*;

public class p01356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, a, b, p, q;
        n = sc.nextInt();
        m = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        p = sc.nextInt();
        q = sc.nextInt();

        if (a == 1 && b == 1) {
            if ((p + q) * n <= m) {
                System.out.println(m - (p + q) * n);
            } else {
                int k = m / (p + q);
                System.out.println(Math.min(m - k * (p + q), (k + 1) * (p + q) - m));
            }
        } else {
            int ans = m;
            for (int i = Math.max(0, n - 40); i >= 0; i--) {
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
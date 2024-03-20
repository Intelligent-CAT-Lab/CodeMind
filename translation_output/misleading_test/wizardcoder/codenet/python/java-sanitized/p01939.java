import java.util.*;

public class p01939 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MOD = 1000000007;

        int s = 0;
        if (n == 1) {
            s = m + 1;
        } else {
            int a = m + 1;
            int d = -n + 1;
            int n1 = 1 + m / (n - 1);
            s = sum(a, d, n1);
            s *= 2;
            s -= (m + 1);
        }

        System.out.println(s % MOD);
    }

    public static int sum(int a, int d, int n) {
        return n * (2 * a + (n - 1) * d) / 2;
    }
}
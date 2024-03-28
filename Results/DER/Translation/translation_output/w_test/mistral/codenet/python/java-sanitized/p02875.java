import java.util.Scanner;

public class p02875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int nn = N + 10;
        long P = 998244353;
        long[] fa = new long[nn + 1];
        long[] fainv = new long[nn + 1];
        for (int i = 0; i < nn; i++) {
            fa[i + 1] = fa[i] * (i + 1) % P;
        }
        fainv[nn - 1] = pow(fa[nn - 1], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        }
        long ans = pow(3, N, P);
        for (int i = 1; i <= N / 2; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P;
        }
        System.out.println(ans);
    }

    public static long C(int n, int k) {
        if (k > n) {
            return 0;
        }
        long ans = fa[n] * fainv[k] % P * fainv[n - k] % P;
        return ans;
    }

    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % mod;
            }
            b = b >> 1;
            a = (a * a) % mod;
        }
        return ans;
    }
}
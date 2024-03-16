import java.util.Scanner;

public class p02875 {
    private static final int P = 998244353;
    private static int[] fa;
    private static int[] fainv;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int nn = N + 10;
        fa = new int[nn + 1];
        fainv = new int[nn + 1];
        fa[0] = 1;

        for (int i = 0; i < nn; i++) {
            fa[i + 1] = (int)(((long)fa[i] * (i + 1)) % P);
        }

        fainv[nn] = pow(fa[nn], P - 2, P);

        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = (int)(((long)fainv[i + 1] * (i + 1)) % P);
        }

        int ans = pow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P) % P + P) % P;
        }

        System.out.println(ans);
    }

    private static int C(int a, int b) {
        if (0 <= b && b <= a) {
            return (int)(((long)fa[a] * fainv[b] % P * fainv[a - b]) % P);
        }
        return 0;
    }

    private static int pow(int base, int exponent, int mod) {
        int result = 1;
        base %= mod;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (int)(((long)result * base) % mod);
            }
            exponent >>= 1;
            base = (int)(((long)base * base) % mod);
        }

        return result;
    }
}
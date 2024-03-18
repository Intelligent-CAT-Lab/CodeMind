import java.util.Scanner;

public class p02875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int nn = N + 10;
        int P = 998244353;

        long[] fa = new long[nn + 1];
        long[] fainv = new long[nn + 1];
        for (int i = 0; i <= nn; i++) {
            fa[i] = 1;
            fainv[i] = 1;
        }

        for (int i = 0; i < nn; i++) {
            fa[i + 1] = (fa[i] * (i + 1)) % P;
        }
        fainv[nn] = modPow(fa[nn], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = (fainv[i + 1] * (i + 1)) % P;
        }

        long ans = modPow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            long coeff = (2 * combination(N, i, fa, fainv, P)) % P;
            ans = ((ans - coeff * modPow(2, N - i, P)) % P + P) % P;
        }

        System.out.println(ans);
    }

    public static long modPow(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }

    public static long combination(int a, int b, long[] fa, long[] fainv, int P) {
        if (b < 0 || b > a) {
            return 0;
        }
        long num = (fa[a] * fainv[b]) % P;
        long denom = fainv[a - b];
        return (num * denom) % P;
    }
}
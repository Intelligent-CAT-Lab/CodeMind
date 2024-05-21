import java.util.*;

public class p02875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nn = N + 10;
        int P = 998244353;

        long[] fa = new long[nn+1];
        long[] fainv = new long[nn+1];
        fa[0] = 1;
        fainv[0] = 1;
        for (int i = 1; i <= nn; i++) {
            fa[i] = fa[i-1] * i % P;
        }
        fainv[nn] = pow(fa[nn], P-2, P);
        for (int i = nn-1; i >= 0; i--) {
            fainv[i] = fainv[i+1] * (i+1) % P;
        }
        long C(int a, int b) {
            if (b < 0 || b > a) return 0;
            return fa[a] * fainv[b] % P * fainv[a-b] % P;
        }

        long ans = pow(3, N, P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P;
        }

        System.out.println(ans);
    }

    public static long pow(long a, long b, long p) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) res = res * a % p;
            a = a * a % p;
            b /= 2;
        }
        return res;
    }
}
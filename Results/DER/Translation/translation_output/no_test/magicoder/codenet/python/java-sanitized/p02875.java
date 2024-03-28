import java.util.Scanner;

public class p02875 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int nn = N + 10;
        long P = 998244353;

        long[] fa = new long[nn+1];
        long[] fainv = new long[nn+1];
        fa[0] = 1;
        fainv[nn] = pow(fa[nn], P-2, P);
        for (int i = 1; i <= nn; i++) {
            fa[i] = (fa[i-1] * i) % P;
        }
        for (int i = nn-1; i >= 0; i--) {
            fainv[i] = (fainv[i+1] * (i+1)) % P;
        }
        long C = (a, b) -> {
            if (0 <= b && b <= a) {
                return (fa[a] * fainv[b] % P * fainv[a-b] % P);
            } else {
                return 0;
            }
        };

        long ans = pow(3, N, P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P)) % P;
        }

        System.out.println(ans);
    }

    static long pow(long a, long b, long m) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (ans * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return ans;
    }
}
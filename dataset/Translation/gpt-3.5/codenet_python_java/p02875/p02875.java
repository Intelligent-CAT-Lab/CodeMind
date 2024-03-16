import java.util.Scanner;

public class p02875 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int nn = N + 10;
        int P = 998244353;

        long[] fa = new long[nn + 1];
        long[] fainv = new long[nn + 1];
        for (int i = 0; i < nn + 1; i++) {
            fa[i] = 1;
            fainv[i] = 1;
        }

        for (int i = 0; i < nn; i++) {
            fa[i + 1] = fa[i] * (i + 1) % P;
        }
        fainv[nn] = pow(fa[nn], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        }

        long ans = pow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i, fa, fainv, P) * pow(2, N - i, P) + P) % P;
        }

        System.out.println(ans);
    }

    private static long C(int a, int b, long[] fa, long[] fainv, int P) {
        if (b < 0 || b > a) {
            return 0;
        }
        return fa[a] * fainv[b] % P * fainv[a - b] % P;
    }

    private static long pow(long x, int y, int P) {
        long result = 1;
        x = x % P;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * x) % P;
            }
            y = y >> 1;
            x = (x * x) % P;
        }
        return result;
    }
}
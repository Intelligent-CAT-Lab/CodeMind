import java.util.Scanner;

public class p02875 {
    static final long P = 998244353;
    static long[] fa, fainv;

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % P;
            a = a * a % P;
            b >>= 1;
        }
        return res;
    }

    static long C(int a, int b) {
        if (b > a || b < 0)
            return 0;
        return fa[a] * fainv[b] % P * fainv[a - b] % P;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nn = N + 10;
        fa = new long[nn + 1];
        fainv = new long[nn + 1];
        fa[0] = fainv[0] = 1;
        for (int i = 1; i <= nn; i++)
            fa[i] = fa[i - 1] * i % P;
        fainv[nn] = pow(fa[nn], P - 2);
        for (int i = nn - 1; i >= 0; i--)
            fainv[i] = fainv[i + 1] * (i + 1) % P;
        long ans = pow(3, N);
        for (int i = N / 2 + 1; i <= N; i++)
            ans = (ans - 2 * C(N, i) * pow(2, N - i)) % P;
        System.out.println(ans);
    }
}
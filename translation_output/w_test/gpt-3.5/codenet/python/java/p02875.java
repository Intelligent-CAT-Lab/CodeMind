```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int nn = N + 10;
        long P = 998244353;

        long[] fa = new long[nn + 1];
        long[] fainv = new long[nn + 1];
        for (int i = 0; i < nn + 1; i++) {
            fa[i] = 1;
            fainv[i] = 1;
        }

        for (int i = 0; i < nn; i++) {
            fa[i + 1] = (fa[i] * (i + 1)) % P;
        }

        fainv[nn] = pow(fa[nn], P - 2, P);
        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = (fainv[i + 1] * (i + 1)) % P;
        }

        long ans = pow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i, fa, fainv, P) * pow(2, N - i, P) + P) % P;
        }

        System.out.println(ans);
    }

    static long pow(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if (exponent % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent /= 2;
        }
        return result;
    }

    static long C(long a, long b, long[] fa, long[] fainv, long P) {
        if (b < 0 || b > a) {
            return 0;
        }
        return (fa[(int) a] * fainv[(int) b] % P) * fainv[(int) (a - b)] % P;
    }
}
```


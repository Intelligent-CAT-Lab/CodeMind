Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int nn = N + 10;
        int P = 998244353;

        int[] fa = new int[nn+1];
        int[] fainv = new int[nn+1];
        fa[0] = 1;
        for (int i = 1; i <= nn; i++) {
            fa[i] = (int) ((long) fa[i-1] * (i) % P);
        }
        fainv[nn] = pow(fa[nn], P-2, P);
        for (int i = nn-1; i >= 0; i--) {
            fainv[i] = (int) ((long) fainv[i+1] * (i+1) % P);
        }
        int C = (int) ((long) fa[N] * fainv[N] % P * fainv[N-N] % P);

        int ans = pow(3, N, P);
        for (int i = N/2 + 1; i <= N; i++) {
            ans = (ans - 2 * C * pow(2, N - i, P)) % P;
        }

        System.out.println(ans);
    }

    public static int pow(int a, int b, int P) {
        if (b == 0) return 1;
        int res = pow(a, b/2, P);
        res = (int) ((long) res * res % P);
        if (b % 2 == 1) res = (int) ((long) res * a % P);
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer N from the standard input, calculates the factorials and their inverses, and then uses them to calculate the answer. The `pow` function is a helper function that calculates

Here's the translated Java code from the provided Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    static final int p = 1000000007;
    static long[] fact, factinv, inv;
    static int N = (int)1e6 + 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); int aa = sc.nextInt(); int bb = sc.nextInt();

        int a = Math.max(aa, bb);
        int b = Math.min(aa, bb);

        long[] xs0 = new long[n+1];
        long[] os0 = new long[n+1];
        os0[0] = 1;

        for (int i = b; i < a; i++) {
            for (int j = b; j <= i; j++) {
                xs0[i] += os0[i - j];
                xs0[i] %= p;
            }
            for (int j = 1; j <= i; j++) {
                os0[i] += xs0[i - j];
                os0[i] %= p;
            }
        }

        long[] os = new long[a];

        for (int i = b; i < a - 2; i++) {
            for (int j = 2; j < a - i; j++) {
                os[i + j] += xs0[i] * (j - 1);
            }
        }

        long[] x = new long[n+1];
        long[] o = new long[n+1];

        for (int i = b + 1; i < a; i++) {
            for (int j = b; j < i; j++) {
                o[i] += xs0[j];
                o[i] %= p;
            }
        }

        x[0] = 1;
        o[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < Math.min(b, i + 1); j++) {
                x[i] += o[i - j];
            }
            for (int j = 1; j < Math.min(a, i + 1); j++) {
                o[i] += x[i - j];
            }
            for (int j = b + 2; j < Math.min(a, i + 1); j++) {
                o[i] += x[i - j] * os[j];
            }
            x[i] %= p;
            o[i] %= p;
        }

        for (int i = b + 1; i < a; i++) {
            for (int j = b; j < i; j++) {
                o[n] += xs0[j] * x[n - i];
                o[i] %= p;
            }
        }

        long ans = o[n] + x[n];
        ans %= p;

        long[] beki2 = new long[5001];

        for (int i = 0; i < 5000; i++) {
            beki2[i + 1] = beki2[i] * 2;
            beki2[i + 1] %= p;
        }

        ans = beki2[n] - ans;
        ans += p;
        ans %= p;

        System.out.println(ans);
        sc.close();
    }
}
```

Please note that this Java code assumes the input is provided in the same way as the Python code does (from standard input) and outputs the result to standard output.

Make sure to run this in an environment that can handle standard input/output effectively. Also, I haven't included the inner workings of the `cmb` function and its related `fact`, `factinv`, and `inv` arrays initialization, as these parts are commented out in the provided Python code snippet. If you require these for the full functionality of this code, additional implementation will be needed.

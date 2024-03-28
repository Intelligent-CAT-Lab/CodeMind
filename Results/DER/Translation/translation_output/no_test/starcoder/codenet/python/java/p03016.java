<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import numpy as np


def exp_np(a, e, m):
    r = np.identity(a.shape[0], dtype=np.int64)
    t = a.copy()
    while e:
        if e % 2:
            r = np.dot(r, t) % m
        t = np.dot(t, t) % m
        e >>= 1
    return r


l, a, b, m = map(int, input().split())

first_d = len(str(a))
tail = a + b * (l - 1)

lo = -1
state = np.array([[0, a % m, 1]])

for d in range(first_d, 19):
    hi = min((10 ** d - 1 - a) // b, l - 1)
    cnt = hi - lo
    coe = np.array([
        [pow(10, d, m), 0, 0],
        [1, 1, 0],
        [0, b % m, 1]
    ], dtype=np.int64)

    coe = exp_np(coe, cnt, m)
    state = np.dot(state, coe) % m

    lo = hi
    if hi == l - 1:
        break

print(state[0][0])

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int first_d = (int) Math.log10(a) + 1;
        int tail = a + b * (l - 1);

        int lo = -1;
        long[][] state = new long[][]{{0, a, 1}};

        for (int d = first_d; d <= 18; d++) {
            int hi = Math.min((int) Math.pow(10, d) - 1 - a, l - 1);
            int cnt = hi - lo;
            long[][] coe = new long[][]{{
                (long) Math.pow(10, d), 0, 0
            }, {
                1, 1, 0
            }, {
                0, b, 1
            }};

            coe = exp_np(coe, cnt, m);
            state = mul(state, coe);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static long[][] mul(long[][] a, long[][] b) {
        int n = a.length;
        int m = b[0].length;
        long[][] c = new long[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                    c[i][j] %= 1000000007;
                }
            }
        }
        return c;
    }

    public static long[][] exp_np(long[][] a, long e, long m) {
        long[][] r = new long[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            r[i][i] = 1;
        }
        long[][] t = new long[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                t[i][j] = a[i][j];
            }
        }
        while (e > 0) {
            if ((e & 1) == 1) {
                r = mul(r, t);
                for (int i = 0; i < a.length; i++) {
                    for (int j = 0; j < a.length; j++) {
                        r[i][j] %= m;
                    }
                }
            }
            t = mul(t, t);
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length; j++) {
                    t[i][j] %= m;
                }
            }
            e >>= 1;
        }
        return r;
    }
}
```
<|endoftext|>

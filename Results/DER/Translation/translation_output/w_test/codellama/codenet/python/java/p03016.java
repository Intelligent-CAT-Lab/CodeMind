<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3 4 10007

Expected output:
5563


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
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;

public class ExpMod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int firstD = (int) Math.log10(a);
        int tail = a + b * (l - 1);

        int lo = -1;
        int[][] state = new int[][] {{0, a % m, 1}};

        for (int d = firstD; d <= 19; d++) {
            int hi = Math.min((int) Math.pow(10, d) - 1 - a, l - 1);
            int cnt = hi - lo;
            int[][] coe = new int[][] {{pow(10, d, m), 0, 0}, {1, 1, 0}, {0, b % m, 1}};

            coe = expMod(coe, cnt, m);
            state = matrixMultiply(state, coe);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    public static int[][] expMod(int[][] a, int e, int m) {
        int[][] r = new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] t = a.clone();
        while (e > 0) {
            if (e % 2 == 1) {
                r = matrixMultiply(r, t);
                r = matrixMod(r, m);
            }
            t = matrixMultiply(t, t);
            t = matrixMod(t, m);
            e >>= 1;
        }
        return r;
    }

    public static int[][] matrixMultiply(int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static int[][] matrixMod(int[][] a, int m) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] %= m;
            }
        }
        return a;
    }
}
```
Note that this code uses the `pow` function to compute the power of 10 modulo `m`, which is not the most efficient way to do it. A more efficient way would be to use the fact that `pow(10, d, m) = pow(10, d % m, m)` and compute the power of 10 modulo `m` using repeated squaring.</s>

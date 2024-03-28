<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        int firstD = String.valueOf(a).length();
        int tail = a + b * (l - 1);

        int lo = -1;
        long[][] state = {{0, a % m, 1}};

        for (int d = firstD; d < 19; d++) {
            int hi = Math.min((int) ((Math.pow(10, d) - 1 - a) / b), l - 1);
            int cnt = hi - lo;
            long[][] coe = {
                    {(long) Math.pow(10, d) % m, 0, 0},
                    {1, 1, 0},
                    {0, b % m, 1}
            };

            coe = exp(coe, cnt, m);
            state = multiply(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    private static long[][] exp(long[][] a, int e, int m) {
        long[][] r = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        long[][] t = a.clone();
        while (e > 0) {
            if ((e & 1) == 1) {
                r = multiply(r, t, m);
            }
            t = multiply(t, t, m);
            e >>= 1;
        }
        return r;
    }

    private static long[][] multiply(long[][] a, long[][] b, int m) {
        long[][] result = new long[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] = (result[i][j] + a[i][k] * b[k][j]) % m;
                }
            }
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the result, and prints it. The `exp` method calculates the matrix exponentiation, and the `multiply` method multiplies two matrices.<｜end▁of▁sentence｜>

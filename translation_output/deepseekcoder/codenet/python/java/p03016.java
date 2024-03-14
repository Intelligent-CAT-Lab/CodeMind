<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
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
        long tail = a + (long)b * (l - 1);

        long[][] state = {{0, a % m, 1}};
        long lo = -1;

        for (int d = firstD; d < 19; d++) {
            long hi = Math.min((long)Math.pow(10, d) - 1 - a, l - 1) / b;
            long cnt = hi - lo;
            long[][] coe = {{
                (long)Math.pow(10, d) % m, 0, 0},
                {1, 1, 0},
                {0, b % m, 1}};

            coe = exp(coe, cnt, m);
            state = multiply(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    private static long[][] exp(long[][] a, long e, long m) {
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

    private static long[][] multiply(long[][] a, long[][] b, long m) {
        long[][] c = new long[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % m;
                }
            }
        }
        return c;
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the first digit of the sum of the series, and prints the result. The calculation is done using matrix exponentiation, which is a common technique in number theory and computer science for dealing with large numbers.
<|EOT|>

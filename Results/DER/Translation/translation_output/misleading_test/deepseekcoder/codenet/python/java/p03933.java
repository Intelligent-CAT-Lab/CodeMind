<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
17.433799455066975

```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

import numpy as np

# (å§ç¹ãä¸è§å½¢)ã®çµã«å¯¾ãã¦ã3Kçªç®ãæ±ããã°ãã

N,K = map(int,read().split())

import numpy as np

theta = np.pi/N

def test(x):
    # ç­ < x ã§ããã
    # area = 2sin(a)sin(b)sin(c) < x ã¨ãªããã®ã®åæ°
    A = np.arange(1,N-1)
    sA = np.sin(A * theta)
    # sin(b)sin(c) > x / 2sA
    # cos((b-c)theta) + cos(a theta) > x/sA
    diff = np.arccos(x/sA - np.cos(A*theta)) / theta
    diff[np.isnan(diff)] = -(N+N)
    upper = np.minimum(N-A-1,(N-A+diff)/2).astype(int)
    lower = (N-A) - upper
    cnt = np.maximum(0, upper - lower + 1).sum()
    return N*((N-1)*(N-2)//2 - cnt) < 3*K

left = 0
right = 4
for _ in range(100):
    x = (left + right)/2
    if test(x):
        left = x
    else:
        right = x
print(x)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        double theta = Math.PI / N;

        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, N, K, theta)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
    }

    private static boolean test(double x, int N, int K, double theta) {
        int cnt = 0;
        for (int a = 1; a < N - 1; a++) {
            double sA = Math.sin(a * theta);
            if (sA != 0) {
                double diff = Math.acos(x / sA - Math.cos(a * theta)) / theta;
                int upper = Math.min(N - a - 1, (int) ((N - a + diff) / 2));
                int lower = (N - a) - upper;
                cnt += Math.max(0, upper - lower + 1);
            }
        }
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the standard input, calculates the value of `theta`, and then uses a binary search to find the smallest `x` such that the function `test` returns `true`. The function `test` counts the number of triples `(a, b, c)` such that `sin(a)sin(b)sin(c) < x` and `cos((b-c)theta) + cos(a theta) > x/sA` for `sA != 0`. If this count is less than `3K`, the function returns `true`; otherwise, it returns `false`.
<|EOT|>

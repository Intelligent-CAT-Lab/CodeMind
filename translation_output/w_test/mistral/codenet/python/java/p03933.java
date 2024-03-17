<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
1.0000000000000


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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double theta = Math.PI / N;
        double x = 0;
        double left = 0;
        double right = N;
        while (left < right) {
            x = (left + right) / 2;
            if (test(x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(x);
    }

    public static boolean test(double x) {
        double[] A = new double[N - 1];
        for (int i = 1; i < N - 1; i++) {
            A[i] = Math.sin(i * theta);
        }
        double sA = A[0];
        for (int i = 1; i < N - 1; i++) {
            sA *= A[i];
        }
        double diff = Math.acos((x / sA) - Math.cos(A[0] * theta)) / theta;
        for (int i = 1; i < N - 1; i++) {
            diff[i] = Math.acos((x / sA) - Math.cos(A[i] * theta)) / theta;
        }
        diff[diff.length - 1] = Double.NaN;
        int upper = (int) Math.min(N - A[0] - 1, (N - A[0] + diff[0]) / 2);
        int lower = N - A[0] - upper;
        int cnt = (int) Math.max(0, upper - lower + 1);
        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}
```</s>

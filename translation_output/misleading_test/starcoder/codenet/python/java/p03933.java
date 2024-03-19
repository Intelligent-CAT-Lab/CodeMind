<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        double theta = Math.PI / N;
        double left = 0, right = 4;
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

    public static boolean test(double x, int N, int K, double theta) {
        double[] A = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            A[i] = i + 1;
        }
        double[] sA = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        double[] diff = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
        }
        for (int i = 0; i < N - 2; i++) {
            if (Double.isNaN(diff[i])) {
                diff[i] = -(N + N);
            }
        }
        int[] upper = new int[N - 2];
        int[] lower = new int[N - 2];
        for (int i = 0; i < N - 2; i++) {
            upper[i] = (int) Math.min(N - 1 - A[i], (N - 1 - A[i] + diff[i]) / 2);
            lower[i] = (int) (N - 1 - A[i] - upper[i]);
        }
        int cnt = 0;
        for (int i = 0; i < N - 2; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }
        return N * (N - 1) * (N - 2) / 2 - cnt < 3 * K;
    }
}
```

'''
<|endoftext|>

System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        double theta = Math.PI / N;
        double left = 0;
        double right = 4;

        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(N, theta, x)) {
                left = x;
            } else {
                right = x;
            }
        }

        System.out.println(left);
    }

    private static boolean test(int N, double theta, double x) {
        int[] A = new int[N - 2];
        for (int i = 1; i < N - 1; i++) {
            A[i - 1] = i;
        }

        double[] sA = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            sA[i] = Math.sin((A[i] + 1) * theta);
        }

        double[] diff = new double[N - 2];
        for (int i = 0; i < N - 2; i++) {
            diff[i] = Math.acos((x / sA[i]) - Math.cos((A[i] + 1) * theta)) / theta;
            if (Double.isNaN(diff[i])) {
                diff[i] = -(N + N);
            }
        }

        int[] upper = new int[N - 2];
        int[] lower = new int[N - 2];
        for (int i = 0; i < N - 2; i++) {
            upper[i] = (int) Math.min(N - A[i] - 2, ((N - A[i] + diff[i]) / 2));
            lower[i] = (N - A[i]) - upper[i];
        }

        int cnt = 0;
        for (int i = 0; i < N - 2; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }

        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}
```<|endoftext|>

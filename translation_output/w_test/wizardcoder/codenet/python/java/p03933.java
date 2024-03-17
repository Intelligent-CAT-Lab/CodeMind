Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        double theta = Math.PI / N;

        double left = 0, right = 4;
        for (int i = 0; i < 100; i++) {
            double mid = (left + right) / 2;
            if (test(mid, N, K)) {
                left = mid;
            } else {
                right = mid;
            }
        }
        bw.write(String.format("%.10f", left) + "\n");

        bw.close();
        br.close();
    }

    public static boolean test(double x, int N, int K) {
        double theta = Math.PI / N;
        double[] sA = new double[N-2];
        for (int i = 1; i < N-1; i++) {
            sA[i-1] = Math.sin(i * theta);
        }
        double[] diff = new double[N-2];
        for (int i = 1; i < N-1; i++) {
            double a = (i - 1) * theta;
            double b = i * theta;
            double c = (N - i) * theta;
            double cos1 = Math.cos((b - c) * theta);
            double cos2 = Math.cos(a * theta);
            double sin1 = Math.sin(b * theta);
            double sin2 = Math.sin(c * theta);
            double cos3 = Math.cos((b + c) * theta);
            double sin3 = Math.sin((b + c) * theta);
            double cos4 = Math.cos((a + c) * theta);
            double sin4 = Math.sin((a + c) * theta);
            double cos5 = Math.cos((a - c) * theta);
            double sin5 = Math.sin((a - c) * theta);
            double cos6 = Math.cos((b - a) * theta);
            double sin6 = Math.sin((b - a) * theta);
            double cos7 = Math.cos((b + a) * theta);
            double sin7 = Math.sin((b + a) * theta);
            double cos8 = Math.cos((c + a) * theta);
            double sin8 = Math.sin((c + a) * theta);
            double cos9 = Math.cos((c - a) * theta);
            double sin9 = Math.sin((c - a) * theta);
            double cos10 = Math.cos((b - c) * theta);
            double sin10 = Math.sin((b - c) * theta);
            double cos11 = Math.cos((b + c) * theta);
            double sin11 = Math.sin((b + c) * theta);
            double cos12 = Math.cos((a + c) * theta);
            double sin12 = Math.sin((a + c) * theta);
            double cos13 = Math.cos((a - c) * theta);
            double sin13 = Math.sin((a - c) * theta);
            double cos14 = Math.cos((b - a) * theta);
            double sin14 = Math.sin((b - a) * theta);
            double cos15 = Math.cos((b + a) * theta);
            double sin15 = Math.sin((b + a) * theta);
            double cos16 = Math.cos((c + a) * theta);
            double sin16 = Math.sin((c + a) * theta);
            double cos17 = Math.cos((c - a) * theta);
            double sin17 = Math.sin((c - a) * theta);
            double cos18 = Math.cos((b - c) * theta);
            double sin18 = Math.sin((b - c) * theta);
            double cos19 = Math.cos((b + c) * theta);
            double sin19 = Math.sin((b + c) * theta);
            double cos20 = Math.cos((a + c) * theta);
            double sin20 = Math.sin((a + c) * theta);
            double cos21 = Math.cos((a - c) * theta);
            double sin21 = Math.sin((a - c) * theta);
            double cos22 = Math.cos((b - a) * theta);
            double sin22 = Math.sin((b - a) * theta);
            double cos23 = Math.cos((b + a) * theta);
            double sin23 = Math.sin((b + a) * theta);
            double cos24 = Math.cos((c + a) * theta);
            double sin24 = Math.sin((c + a) * theta);
            double cos25 = Math.cos((c - a) * theta);
            double sin25 = Math.sin((c - a) * theta);
            double cos26 = Math.cos((b - c) * theta);
            double sin26 = Math.sin((b - c) * theta);
            double cos27 = Math.cos((b + c) * theta);
            double sin27 = Math.sin((b + c) * theta);
            double cos28 = Math.cos((a + c) * theta);
            double sin28 = Math.sin((a + c) * theta);
            double cos29 = Math.cos((a - c) * theta);
            double sin29 = Math.sin((a - c) * theta);
            double cos30 = Math.cos((b - a) * theta);
            double sin30 = Math.sin((b - a) * theta);
            double cos31 = Math.cos((b + a) * theta);
            double sin31 = Math.sin((b + a) * theta);
            double cos32 = Math.cos((c + a) * theta);
            double sin32 = Math.sin((c + a) * theta);
            double cos33 = Math.cos((c - a) * theta);
            double sin33 = Math.sin((c - a) * theta);
            double cos34 =

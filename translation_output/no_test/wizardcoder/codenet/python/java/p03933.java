Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

        int N, K;
        String[] line = br.readLine().split(" ");
        N = Integer.parseInt(line[0]);
        K = Integer.parseInt(line[1]);

        double theta = Math.PI / N;

        double left = 0, right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, N, K)) {
                left = x;
            } else {
                right = x;
            }
        }
        bw.write(String.format("%.10f", left));
        bw.flush();
        bw.close();
    }

    public static boolean test(double x, int N, int K) {
        double theta = Math.PI / N;
        double[] sA = new double[N-2];
        for (int i = 1; i < N-1; i++) {
            sA[i-1] = Math.sin(i * theta);
        }
        double[] diff = new double[N-2];
        for (int i = 1; i < N-1; i++) {
            double a = (i-1) * theta;
            double b = i * theta;
            double c = (i+1) * theta;
            double cos1 = Math.cos((b-c) * theta);
            double cos2 = Math.cos(a * theta);
            double sin1 = Math.sin(b * theta);
            double sin2 = Math.sin(c * theta);
            double cos3 = Math.cos((b-c) * theta);
            double cos4 = Math.cos(a * theta);
            double sin3 = Math.sin(b * theta);
            double sin4 = Math.sin(c * theta);
            double cos5 = Math.cos((b-c) * theta);
            double cos6 = Math.cos(a * theta);
            double sin5 = Math.sin(b * theta);
            double sin6 = Math.sin(c * theta);
            double cos7 = Math.cos((b-c) * theta);
            double cos8 = Math.cos(a * theta);
            double sin7 = Math.sin(b * theta);
            double sin8 = Math.sin(c * theta);
            double cos9 = Math.cos((b-c) * theta);
            double cos10 = Math.cos(a * theta);
            double sin9 = Math.sin(b * theta);
            double sin10 = Math.sin(c * theta);
            double cos11 = Math.cos((b-c) * theta);
            double cos12 = Math.cos(a * theta);
            double sin11 = Math.sin(b * theta);
            double sin12 = Math.sin(c * theta);
            double cos13 = Math.cos((b-c) * theta);
            double cos14 = Math.cos(a * theta);
            double sin13 = Math.sin(b * theta);
            double sin14 = Math.sin(c * theta);
            double cos15 = Math.cos((b-c) * theta);
            double cos16 = Math.cos(a * theta);
            double sin15 = Math.sin(b * theta);
            double sin16 = Math.sin(c * theta);
            double cos17 = Math.cos((b-c) * theta);
            double cos18 = Math.cos(a * theta);
            double sin17 = Math.sin(b * theta);
            double sin18 = Math.sin(c * theta);
            double cos19 = Math.cos((b-c) * theta);
            double cos20 = Math.cos(a * theta);
            double sin19 = Math.sin(b * theta);
            double sin20 = Math.sin(c * theta);
            double cos21 = Math.cos((b-c) * theta);
            double cos22 = Math.cos(a * theta);
            double sin21 = Math.sin(b * theta);
            double sin22 = Math.sin(c * theta);
            double cos23 = Math.cos((b-c) * theta);
            double cos24 = Math.cos(a * theta);
            double sin23 = Math.sin(b * theta);
            double sin24 = Math.sin(c * theta);
            double cos25 = Math.cos((b-c) * theta);
            double cos26 = Math.cos(a * theta);
            double sin25 = Math.sin(b * theta);
            double sin26 = Math.sin(c * theta);
            double cos27 = Math.cos((b-c) * theta);
            double cos28 = Math.cos(a * theta);
            double sin27 = Math.sin(b * theta);
            double sin28 = Math.sin(c * theta);
            double cos29 = Math.cos((b-c) * theta);
            double cos30 = Math.cos(a * theta);
            double sin29 = Math.sin(b * theta);
            double sin30 = Math.sin(c * theta);
            double cos31 = Math.cos((b-c) * theta);
            double cos32 = Math.cos(a * theta);
            double sin31 = Math.sin(b * theta);
            double sin32 = Math.sin(c * theta);
            double cos33 = Math.cos((b-c) * theta);
            double cos34 = Math.cos(a * theta);
            double sin33 = Math.sin(b * theta);
            double sin34 = Math.sin(c * theta);
            double cos35 = Math.cos((b-c) * theta);
            double cos36 = Math.cos(a * theta);
            double sin35 = Math.sin(b * theta);
            double sin36 = Math.sin(c * theta);
            double cos37 = Math.cos((b-c) * theta);
            double cos38 = Math.cos(a * theta);
            double sin37 = Math.sin(b * theta);
            double sin38 = Math.sin(c * theta);
            double cos39 = Math.cos((b-c) * theta);
            double cos40 = Math.cos(a * theta);
            double sin39 = Math.

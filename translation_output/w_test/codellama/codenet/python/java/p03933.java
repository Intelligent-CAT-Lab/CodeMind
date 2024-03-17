<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
[/INST]

Here is the Java code that implements the same logic as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double theta = Math.PI / N;

        double[] A = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = i * theta;
        }

        double[] sA = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            sA[i] = Math.sin(A[i]);
        }

        double x = (left + right) / 2;
        if (test(x)) {
            left = x;
        } else {
            right = x;
        }

        System.out.println(x);
    }

    public static boolean test(double x) {
        double[] diff = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
        }

        int[] upper = new int[N - 1];
        int[] lower = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            upper[i] = Math.min(N - A[i] - 1, (N - A[i] + diff[i]) / 2);
            lower[i] = (N - A[i]) - upper[i];
        }

        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            cnt += Math.max(0, upper[i] - lower[i] + 1);
        }

        return N * ((N - 1) * (N - 2) / 2 - cnt) < 3 * K;
    }
}
```
Note that this code assumes that the input values for `N` and `K` are provided on the first two lines of the input file, and that the input file is in the same format as the sample input provided in the question.</s>

Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
            double x = (left + right) / 2;
            if (test(x, N, K)) {
                left = x;
            } else {
                right = x;
            }
        }
        bw.write(String.format("%.6f", x));
        bw.flush();
    }

    public static boolean test(double x, int N, int K) {
        double theta = Math.PI / N;
        for (int i = 1; i < N - 1; i++) {
            double a = i * theta;
            double sA = Math.sin(a);
            double b = (i + 1) * theta;
            double c = (i + 2) * theta;
            double sB = Math.sin(b);
            double sC = Math.sin(c);
            double cosABC = Math.cos((b - c) * theta) + Math.cos(a * theta);
            double diff = Math.acos(x / sA - cosABC) / theta;
            if (diff < 0) {
                continue;
            }
            int upper = Math.min(N - i - 1, (int) Math.floor((N - i + diff) / 2));
            int lower = (int) Math.ceil((N - i) - upper);
            int cnt = Math.max(0, upper - lower + 1);
            if (N * (N - 1) / 2 - cnt < 3 * K) {
                return true;
            }
        }
        return false;
    }
}
```<|endoftext|>

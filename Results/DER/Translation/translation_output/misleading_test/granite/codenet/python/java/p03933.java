System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        double theta = Math.PI / n;
        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(x, n, theta)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
    }

    private static boolean test(double x, int n, double theta) {
        int[] a = new int[n - 2];
        for (int i = 1; i < n - 1; i++) {
            a[i - 1] = i;
        }
        int cnt = 0;
        for (int i = 1; i < n - 1; i++) {
            double sinA = Math.sin(a[i - 1] * theta);
            double sinB = Math.sin((n - i) * theta);
            double sinC = Math.sin((n - 1) * theta);
            double left = Math.acos((x / sinA - Math.cos(a[i - 1] * theta)) / theta);
            double right = Math.PI - a[i - 1] * theta;
            if (left > right) {
                cnt += n - i - 1;
            } else {
                int leftIndex = Arrays.binarySearch(a, (int) Math.ceil(left / theta));
                int rightIndex = Arrays.binarySearch(a, (int) Math.floor(right / theta));
                if (leftIndex < 0) {
                    leftIndex = -leftIndex - 1;
                }
                if (rightIndex < 0) {
                    rightIndex = -rightIndex - 2;
                }
                cnt += rightIndex - leftIndex + 1;
            }
        }
        return n * (n - 1) * (n - 2) / 2 - cnt < 3 * k;
    }
}
<|endoftext|>

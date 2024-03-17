

```java
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        double left = 0;
        double right = 4;
        for (int i = 0; i < 100; i++) {
            double x = (left + right) / 2;
            if (test(N, K, x)) {
                left = x;
            } else {
                right = x;
            }
        }
        System.out.println(left);
    }

    static boolean test(int N, int K, double x) {
        double theta = Math.PI / N;
        int[] A = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            A[i] = i + 1;
        }
        double[] sA = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            sA[i] = Math.sin(A[i] * theta);
        }
        double[] diff = new double[N - 1];
        for (int i = 0; i < N - 1; i++) {
            diff[i] = Math.acos(x / sA[i] - Math.cos(A[i] * theta)) / theta;
        }
        int[] upper = new int[N - 1];
        int[] lower = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            if (Double.isNaN(diff[i])) {
                upper[i] = -(N + N);
            } else {
                upper[i] = Math.min(N - A[i] - 1, (N - A[i] + diff[i]) / 2);
            }
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

## 10. 1000000007

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

# 1000000007 ã®åã«å¤ããªãåã®æ°ãåãè¾¼ã

N = int(read())

def f(x):
    return x*(x-1)//2

def g(x):
    return x*(x-1)*(x-2)//6

def h(x):
    return x*(x-1)*(x-2)*(x-3)//24

def i(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)//120

def j(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)//720

def k(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)//5040

def l(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)//40320

def m(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)//362880

def n(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)//3628800

def o(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)*(x-10)//39916800

def p(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)*(x-10)*(x-11)//479001600

def q(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)*(x-10)*(x-11)*(x-12)//6227020800

def r(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)*(x-10)*(x-11)*(x-12)*(x-13)//87178291200

def s(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x-8)*(x-9)*(x-10)*(x-11)*(x-12)*(x-13)*(x-14)//1307674368000

def t(x):
    return x*(x-1)*(x-2)*(x-3)*(x-4)*(x-5)*(x-6)*(x-7)*(x

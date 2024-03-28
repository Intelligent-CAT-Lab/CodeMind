<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
-82

```
N, K = map(int, input().split())
P = 10 ** 9 + 7
X = [0] * (K + 1)
ans = 0
for i in range(1, K + 1):
    X[i] += i
    for j in range(i * 2, K+1, i):
        X[j] -= X[i]
    ans += X[i] * pow(K//i, N, P)
print(ans % P)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long P = (long) Math.pow(10, 9) + 7;
        long[] X = new long[K + 1];
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += X[i] * pow(K / i, N, P);
        }
        System.out.println(ans % P);
    }

    private static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % m;
            a = a * a % m;
            b >>= 1;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the standard input, calculates the array X, and then calculates the final result. The pow function is used to calculate the power of a number modulo a given number.<｜end▁of▁sentence｜>

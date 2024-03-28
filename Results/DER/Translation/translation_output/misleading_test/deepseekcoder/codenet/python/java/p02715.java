<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

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

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b = b / 2;
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the sum of the numbers from 1 to K, and then multiplies this sum by the Nth power of K, modulo P. The result is printed to the standard output.

The `pow` method is a helper method that calculates the power of a number modulo another number. It uses the binary exponentiation algorithm to efficiently calculate the power.
<|EOT|>

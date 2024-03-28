<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 1 1

Expected output:
2


```
import math
H, W, A, B = map(int, input().split())
MOD = 10 ** 9 + 7

factorial = [1]
inv_factorial = [1]


for i in range(1, H+W+1):
    factorial.append(factorial[-1] * i % MOD)
    inv_factorial.append(pow(factorial[-1], MOD-2, MOD))


def f(h, w):
    return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD


answer = 0
for i in range(B+1, W+1):
    answer += f(H-A, i) * f(A, W-i+1)
    answer %= MOD

print(int(answer))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long[] factorial;
    static long[] inv_factorial;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        factorial = new long[H+W+1];
        inv_factorial = new long[H+W+1];

        factorial[0] = 1;
        for (int i = 1; i <= H+W; i++) {
            factorial[i] = (factorial[i-1] * i) % MOD;
            inv_factorial[i] = pow(factorial[i], MOD-2);
        }

        long answer = 0;
        for (int i = B+1; i <= W+1; i++) {
            answer += f(H-A, i) * f(A, W-i+1);
            answer %= MOD;
        }

        System.out.println(answer);
    }

    static long f(int h, int w) {
        return (factorial[h+w-2] * inv_factorial[h-1] * inv_factorial[w-1]) % MOD;
    }

    static long pow(long a, long b) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (result * a) % MOD;
            }
            a = (a * a) % MOD;
            b /= 2;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the factorial and inverse factorial of numbers up to `H+W`, and then calculates the answer using the `f` function. The `pow` function is used to calculate the modular inverse. The result is printed to the standard output.
<|EOT|>

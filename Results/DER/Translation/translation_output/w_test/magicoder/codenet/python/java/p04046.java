<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.*;

public class Main {
    static long MOD = (long) Math.pow(10, 9) + 7;
    static long[] factorial = new long[200001];
    static long[] inv_factorial = new long[200001];

    static void precompute() {
        factorial[0] = 1;
        for (int i = 1; i <= 200000; i++) {
            factorial[i] = (factorial[i - 1] * i) % MOD;
        }
        inv_factorial[200000] = pow(factorial[200000], MOD - 2, MOD);
        for (int i = 200000 - 1; i >= 0; i--) {
            inv_factorial[i] = (inv_factorial[i + 1] * (i + 1)) % MOD;
        }
    }

    static long pow(long a, long b, long m) {
        if (b == 0) return 1;
        if (b % 2 == 0) {
            long temp = pow(a, b / 2, m);
            return (temp * temp) % m;
        } else {
            return (a * pow(a, b - 1, m)) % m;
        }
    }

    static long f(int h, int w) {
        return (factorial[h + w - 2] * inv_factorial[h - 1] * inv_factorial[w - 1]) % MOD;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        precompute();
        long answer = 0;
        for (int i = B + 1; i <= W; i++) {
            answer += (f(H - A, i) * f(A, W - i + 1)) % MOD;
            answer %= MOD;
        }
        System.out.println((int) answer);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, precomputes factorials and their inverses, and then calculates the answer. The `pow` function is used to calculate the modular exponentiation. The `f` function is used to calculate the binomial coefficient. The `main` function reads the input, calls the `precompute` function, and then calculates the answer. The `answer` is then printed.<｜end▁of▁sentence｜>

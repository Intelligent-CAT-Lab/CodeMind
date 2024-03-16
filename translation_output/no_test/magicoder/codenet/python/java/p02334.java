<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10**9 + 7

p = q = 1
for i in range(N):
    p = p * (N+K-1-i) % MOD
    q = q * (i+1) % MOD

print(p * pow(q, MOD-2, MOD) % MOD)


```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N+K-1-i)) % MOD;
            q = (q * (i+1)) % MOD;
        }

        long inverseQ = pow(q, MOD-2, MOD);
        long result = (p * inverseQ) % MOD;
        System.out.println(result);
    }

    private static long pow(long base, long exponent, long mod) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exponent >>= 1;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the standard input, calculates the factorials of N+K-1-i and i+1 for i from 0 to N-1, and then calculates the modular multiplicative inverse of q and multiplies it with p to get the final result. The pow function is used to calculate the modular multiplicative inverse of q.<｜end▁of▁sentence｜>

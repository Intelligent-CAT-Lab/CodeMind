<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

N, K = map(int, input().split())
MOD = 10**9 + 7

p = q = 1
for i in range(N):
    p = p * (N+K-1-i) % MOD
    q = q * (i+1) % MOD

print(p * pow(q, MOD-2, MOD) % MOD)



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;

        long p = 1;
        long q = 1;
        for (int i = 0; i < N; i++) {
            p = (p * (N + K - 1 - i)) % MOD;
            q = (q * (i + 1)) % MOD;
        }

        long result = (p * Math.pow(q, MOD - 2, MOD)) % MOD;
        System.out.println(result);
    }
}
```
Note that in Java, we need to use `long` instead of `int` to store large values, and we need to use `Math.pow` to calculate the power of a number modulo `MOD`.</s>

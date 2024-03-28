<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-7

```
N, K = map(int, input().split())
MOD = 10**9 + 7

p = q = 1
for i in range(N):
    p = p * (N+K-1-i) % MOD
    q = q * (i+1) % MOD

print(p * pow(q, MOD-2, MOD) % MOD)


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long MOD = 1000000007;
        long p = 1, q = 1;
        for (int i = 0; i < N; i++) {
            p = p * (N + K - 1 - i) % MOD;
            q = q * (i + 1) % MOD;
        }
        System.out.println(p * pow(q, MOD - 2, MOD) % MOD);
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b = b >> 1;
        }
        return res;
    }
}
```</s>

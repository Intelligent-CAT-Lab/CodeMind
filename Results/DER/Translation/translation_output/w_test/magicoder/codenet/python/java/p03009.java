<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 1

Expected output:
6


```
N, H, D = map(int,input().split())
MOD = 10**9 + 7
 
fact = [1]
fact_cum = [0]
for i in range(1,N+1):
  fact.append((fact[-1]*i)%MOD)
  fact_cum.append((fact_cum[-1] + fact[-1])%MOD)
 
ap = [0] * (H+1)
ap_cum = [0] * (H+1)
ap[0] = 1
ap_cum[0] = 1
 
for n in range(1,H+1):
  x = ap_cum[n-1]
  if n > D:
    x -=ap_cum[n-D-1]
  x *= fact_cum[N]
  x %= MOD
  ap[n] = x
  ap_cum[n] = (ap_cum[n-1] + x)%MOD
 
 
ans = ap[H]
ans *= fact[N]
ans %= MOD
ans *= pow(fact_cum[N],MOD-2,MOD)
ans %= MOD
 
print(ans)
```

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int D = scanner.nextInt();
        long MOD = (long) Math.pow(10, 9) + 7;

        long[] fact = new long[N + 1];
        long[] fact_cum = new long[N + 1];
        fact[0] = 1;
        fact_cum[0] = 0;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            fact_cum[i] = (fact_cum[i - 1] + fact[i]) % MOD;
        }

        long[] ap = new long[H + 1];
        long[] ap_cum = new long[H + 1];
        ap[0] = 1;
        ap_cum[0] = 1;

        for (int n = 1; n <= H; n++) {
            long x = ap_cum[n - 1];
            if (n > D) {
                x -= ap_cum[n - D - 1];
            }
            x = (x * fact_cum[N]) % MOD;
            ap[n] = x;
            ap_cum[n] = (ap_cum[n - 1] + x) % MOD;
        }

        long ans = ap[H];
        ans = (ans * fact[N]) % MOD;
        ans = (ans * pow(fact_cum[N], MOD - 2, MOD)) % MOD;

        System.out.println(ans);
    }

    static long pow(long a, long b, long m) {
        if (b == 0) {
            return 1;
        }
        long p = pow(a, b / 2, m);
        p = (p * p) % m;
        if ((b & 1) == 1) {
            p = (p * a) % m;
        }
        return p;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers N, H, and D from the input, calculates the factorial and cumulative factorial, and then calculates the answer. The `pow` function is used to calculate the modular inverse of the cumulative factorial.<｜end▁of▁sentence｜>

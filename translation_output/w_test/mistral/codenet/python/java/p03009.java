<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int D = sc.nextInt();
        long MOD = 1000000007;

        long[] fact = new long[N + 1];
        long[] factCum = new long[N + 1];
        Arrays.fill(fact, 1);
        Arrays.fill(factCum, 0);
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
            factCum[i] = (factCum[i - 1] + fact[i - 1]) % MOD;
        }

        long[] ap = new long[H + 1];
        long[] apCum = new long[H + 1];
        ap[0] = 1;
        apCum[0] = 1;
        for (int n = 1; n <= H; n++) {
            long x = apCum[n - 1];
            if (n > D) {
                x -= apCum[n - D - 1];
            }
            x *= factCum[N];
            x %= MOD;
            ap[n] = x;
            apCum[n] = (apCum[n - 1] + x) % MOD;
        }

        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= Math.pow(factCum[N], MOD - 2);
        ans %= MOD;

        System.out.println(ans);
    }
}
```</s>

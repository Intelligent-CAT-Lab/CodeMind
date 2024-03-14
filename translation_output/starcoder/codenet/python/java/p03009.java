<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int D = sc.nextInt();
        int MOD = 1000000007;
 
        long[] fact = new long[N+1];
        fact[0] = 1;
        for(int i = 1; i <= N; i++) {
            fact[i] = (fact[i-1] * i) % MOD;
        }
 
        long[] fact_cum = new long[N+1];
        fact_cum[0] = 0;
        for(int i = 1; i <= N; i++) {
            fact_cum[i] = (fact_cum[i-1] + fact[i]) % MOD;
        }
 
        long[] ap = new long[H+1];
        ap[0] = 1;
        for(int n = 1; n <= H; n++) {
            long x = ap[n-1];
            if(n > D) {
                x -= ap[n-D-1];
            }
            x *= fact_cum[N];
            x %= MOD;
            ap[n] = x;
        }
 
        long ans = ap[H];
        ans *= fact[N];
        ans %= MOD;
        ans *= pow(fact_cum[N],MOD-2,MOD);
        ans %= MOD;
 
        System.out.println(ans);
    }
 
    public static long pow(long a, long b, long mod) {
        long ans = 1;
        while(b > 0) {
            if((b & 1) == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return ans;
    }
}
```
<|endoftext|>

<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n,m,k=map(int,input().split())
# è§£èª¬åç»ãè¦ã
mod=998244353
ans=0

#-------------------------------------------------------------------
MAX_N = 10**6

fact = [1]
fact_inv = [0]*(MAX_N+4)
for i in range(MAX_N+3):
  fact.append(fact[-1]*(i+1)%mod)

fact_inv[-1] = pow(fact[-1],mod-2,mod)
for i in range(MAX_N+2,-1,-1):
  fact_inv[i] = fact_inv[i+1]*(i+1)%mod

def mod_comb_k(n,k,mod):
  return fact[n] * fact_inv[k] % mod * fact_inv[n-k] %mod 
#-------------------------------------------------------------------

for x in range(0,k+1):
  ans+=m*pow(m-1,n-1-x,mod)*mod_comb_k(n-1,x,mod)
  ans%=mod
if ans<0:
  ans+=mod
print(ans)
```
[/INST]
```java
import java.util.*;

public class Main {
    static int mod = 998244353;
    static int MAX_N = 1000000;
    static int fact[] = new int[MAX_N + 1];
    static int fact_inv[] = new int[MAX_N + 4];

    static void init() {
        fact[0] = 1;
        fact_inv[0] = 0;
        for (int i = 1; i <= MAX_N; i++) {
            fact[i] = fact[i - 1] * (i + 1) % mod;
            fact_inv[i] = fact_inv[i - 1] * (i + 1) % mod;
        }
        fact_inv[MAX_N] = pow(fact[MAX_N], mod - 2, mod);
        for (int i = MAX_N - 1; i >= 1; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % mod;
        }
    }

    static int mod_comb_k(int n, int k, int mod) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m, k;
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        init();
        int ans = 0;
        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod);
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }
}
```</s>

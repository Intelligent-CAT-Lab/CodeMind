System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;
import java.io.*;

public class Main {
    static long mod = 998244353;
    static long[] fact;
    static long[] fact_inv;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);

        fact = new long[1000001];
        fact_inv = new long[1000001];
        fact[0] = 1;
        for (int i = 1; i <= 1000000; i++) {
            fact[i] = fact[i - 1] * i % mod;
        }
        fact_inv[1000000] = pow(fact[1000000], mod - 2, mod);
        for (int i = 999999; i >= 0; i--) {
            fact_inv[i] = fact_inv[i + 1] * (i + 1) % mod;
        }

        long ans = 0;
        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) % mod * mod_comb_k(n - 1, x, mod) % mod;
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    static long mod_comb_k(int n, int k, long mod) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
    }

    static long pow(long a, long n, long mod) {
        long res = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            n >>= 1;
        }
        return res;
    }
}
```<|endoftext|>

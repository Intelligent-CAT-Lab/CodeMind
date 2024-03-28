Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2 1

Expected output:
6


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

### Response:
```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int mod = 998244353;
        int ans = 0;

        //-------------------------------------------------------------------
        int MAX_N = 1000000;

        long[] fact = new long[MAX_N+4];
        long[] fact_inv = new long[MAX_N+4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            fact[i] = (fact[i-1] * i) % mod;
        }
        fact_inv[MAX_N] = pow(fact[MAX_N], mod-2, mod);
        for (int i = MAX_N-1; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i+1] * (i+1)) % mod;
        }

        long mod_comb_k(int n, int k, int mod) {
            return (fact[n] * fact_inv[k] % mod * fact_inv[n-k] % mod);
        }
        //-------------------------------------------------------------------

        for (int x = 0; x <= k; x++) {
            ans = (ans + m * pow(m-1, n-1-x, mod) * mod_comb_k(n-1, x, mod)) % mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long mod) {
        long res = 1;
        a %= mod;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b /= 2;
        }
        return res;
    }
}
```<|endoftext|>

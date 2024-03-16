<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    static final int MAX_N = 1000000;
    static long[] fact = new long[MAX_N + 4];
    static long[] fact_inv = new long[MAX_N + 4];
    static final long mod = 998244353;

    static void preprocess() {
        fact[0] = 1;
        for (int i = 1; i <= MAX_N + 3; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }
        fact_inv[MAX_N + 3] = pow(fact[MAX_N + 3], mod - 2, mod);
        for (int i = MAX_N + 2; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }
    }

    static long pow(long a, long b, long m) {
        a %= m;
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = (res * a) % m;
            a = (a * a) % m;
            b >>= 1;
        }
        return res;
    }

    static long mod_comb_k(int n, int k) {
        return (fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        preprocess();
        long ans = 0;
        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x);
            ans %= mod;
        }
        if (ans < 0)
            ans += mod;
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers `n`, `m`, and `k` from the standard input, and then calculates the answer according to the given formula. The `preprocess` function calculates the factorial and its inverse, and the `pow` function calculates the power of a number modulo a given modulus. The `mod_comb_k` function calculates the combination of `n` choose `k` modulo `mod`. The `main` function reads the input, calls the `preprocess` function, and then calculates the answer according to the given formula.<｜end▁of▁sentence｜>

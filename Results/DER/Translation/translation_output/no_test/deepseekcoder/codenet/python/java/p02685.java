<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        long mod = 998244353;
        long ans = 0;

        //-------------------------------------------------------------------
        int MAX_N = (int) Math.pow(10, 6);

        long[] fact = new long[MAX_N + 4];
        long[] fact_inv = new long[MAX_N + 4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N + 3; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        fact_inv[MAX_N + 3] = pow(fact[(int) MAX_N + 3], (int) (mod - 2), (int) mod);
        for (int i = MAX_N + 2; i >=0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }

        //-------------------------------------------------------------------

        for (int x = 0; x <= k; x++) {
            ans += m * pow(m - 1, n - 1 - x, (int) mod) * mod_comb_k(n - 1, x, (int) mod);
            ans %= mod;
        }
        if (ans < 0) {
            ans += mod;
        }
        System.out.println(ans);
    }

    public static long pow(long a, long b, long m) {
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (ans * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return ans;
    }

    public static long mod_comb_k(int n, int k, int mod) {
        return fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod;
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the standard input, calculates the answer modulo 998244353, and prints the answer. The code uses the fact that `(a*b)%mod = ((a%mod)*(b%mod))%mod` to avoid overflow. The `pow` function is used to calculate `(a^b)%mod`. The `mod_comb_k` function calculates `n choose k` modulo `mod`.
<|EOT|>

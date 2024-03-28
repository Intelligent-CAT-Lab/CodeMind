<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2 1

Expected output:
47

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
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    static long mod = 998244353;
    static long[] fact = new long[1000004];
    static long[] fact_inv = new long[1000004];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        fact[0] = 1;
        for (int i = 1; i < 1000004; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        fact_inv[1000003] = pow(fact[1000003], mod - 2);
        for (int i = 1000002; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }

        long ans = 0;
        for (int x = 0; x <= k; x++) {
            ans = (ans + m * pow(m - 1, n - 1 - x) % mod * mod_comb_k(n - 1, x)) % mod;
        }

        if (ans < 0) {
            ans += mod;
        }

        System.out.println(ans);
    }

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                res = (res * a) % mod;
            }
            a = (a * a) % mod;
            b >>= 1;
        }
        return res;
    }

    static long mod_comb_k(int n, int k) {
        return (fact[n] * fact_inv[k] % mod * fact_inv[n - k]) % mod;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, calculates the answer, and prints it to the standard output. The `pow` function is used to calculate the power of a number modulo `mod`, and the `mod_comb_k` function is used to calculate the combination of `n` and `k` modulo `mod`.
<|EOT|>

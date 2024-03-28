<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = 998244353;
        int ans = 0;

        // è§£èª¬åç»ãè¦ã
        int MAX_N = 1000000;
        int[] fact = new int[MAX_N + 4];
        int[] fact_inv = new int[MAX_N + 4];
        fact[0] = 1;
        for (int i = 1; i <= MAX_N; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        fact_inv[MAX_N] = (int) Math.pow(fact[MAX_N], mod - 2, mod);
        for (int i = MAX_N - 1; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % mod;
        }

        for (int x = 0; x <= k; x++) {
            ans += (m * (int) Math.pow(m - 1, n - 1 - x, mod) * mod_comb_k(n - 1, x, mod)) % mod;
        }

        if (ans < 0) {
            ans += mod;
        }

        System.out.println(ans);
    }

    public static int mod_comb_k(int n, int k, int mod) {
        return (fact[n] * fact_inv[k] % mod * fact_inv[n - k] % mod);
    }
}
```
This is the Java code for the given Python code. The code uses the same approach as the Python code, but with some minor differences in syntax and data types. The `mod_comb_k` function is defined separately and is used in the main function to calculate the final answer. The `MAX_N` variable is defined as a constant and is used to define the size of the `fact` and `fact_inv` arrays. The `ans` variable is used to store the final answer and is printed at the end of the program.</s>

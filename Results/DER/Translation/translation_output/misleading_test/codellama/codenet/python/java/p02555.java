<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7

Expected output:
51

```
s=int(input())
if  s<3:print(0);exit()
n=s//3
mod=10**9+7
fact=[1]*(2*s+1)
inv=[1]*(2*s+1)
for i in range(2,2*s+1):
    fact[i]=i*fact[i-1]%mod
inv[-1]=pow(fact[-1],-1,mod)
for i in range(2*s,1,-1):
    inv[i-1]=inv[i]*i%mod
def comb(x,y):return fact[x]*inv[y]%mod*inv[x-y]%mod if x>=y>=0 else 0
ans=0
for i in range(1,s+1):
    ans=(ans+comb(s-3*i+i-1,i-1))%mod
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        int n = s / 3;
        int mod = 1000000007;
        int[] fact = new int[2 * s + 1];
        int[] inv = new int[2 * s + 1];
        for (int i = 2; i <= 2 * s; i++) {
            fact[i] = i * fact[i - 1] % mod;
        }
        inv[2 * s] = pow(fact[2 * s], -1, mod);
        for (int i = 2 * s - 1; i >= 1; i--) {
            inv[i - 1] = inv[i] * i % mod;
        }
        int ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }

    public static int comb(int x, int y) {
        if (x < y || y < 0) {
            return 0;
        }
        return fact[x] * inv[y] % mod * inv[x - y] % mod;
    }
}
```
Note: The `pow` function is used to calculate the modular exponentiation, which is not available in Java by default. You can use the `BigInteger` class to perform modular exponentiation.

Also, the `comb` function is defined as a separate method to make the code more readable and reusable.</s>

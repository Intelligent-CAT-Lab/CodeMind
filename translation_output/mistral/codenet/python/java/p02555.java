<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if (s < 3) {
            System.out.println(0);
            return;
        }
        int n = s / 3;
        long mod = 1000000007;
        long[] fact = new long[(2 * s + 1)];
        Arrays.fill(fact, 1);
        long[] inv = new long[(2 * s + 1)];
        Arrays.fill(inv, 1);
        for (int i = 2; i <= 2 * s; i++) {
            fact[i] = i * fact[i - 1] % mod;
        }
        inv[fact.length - 1] = pow(fact[fact.length - 1], -1, mod);
        for (int i = fact.length - 1; i >= 1; i--) {
            inv[i - 1] = inv[i] * i % mod;
        }
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }

    public static long comb(long x, long y) {
        return fact[x] * inv[y] % mod * inv[x - y] % mod;
    }

    public static long pow(long x, long y, long mod) {
        long res = 1;
        while (y != 0) {
            if (y % 2 == 1) {
                res = res * x % mod;
            }
            y = y >> 1;
            x = x * x % mod;
        }
        return res;
    }
}
```</s>

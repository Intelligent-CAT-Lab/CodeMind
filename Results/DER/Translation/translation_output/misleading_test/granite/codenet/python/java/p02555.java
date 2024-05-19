System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.*;
import java.io.*;

public class Main {
    static int mod = (int)1e9 + 7;
    static long[] fact, inv;

    static long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1)
                res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    static long comb(int n, int k) {
        if (n < k)
            return 0;
        return fact[n] * inv[k] % mod * inv[n - k] % mod;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        fact = new long[2 * s + 1];
        inv = new long[2 * s + 1];
        fact[0] = 1;
        inv[0] = 1;
        for (int i = 1; i <= 2 * s; i++) {
            fact[i] = fact[i - 1] * i % mod;
            inv[i] = pow(fact[i], mod - 2);
        }
        long ans = 0;
        for (int i = 1; i <= s; i++) {
            ans = (ans + comb(s - 3 * i + i - 1, i - 1)) % mod;
        }
        System.out.println(ans);
    }
}
```<|endoftext|>

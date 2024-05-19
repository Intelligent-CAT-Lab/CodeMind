System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n,a,b = map(int, input().split())
MOD = 10**9 + 7

def modcomb(n,a,mod):
    cnt = 1
    for i in range(a):
        cnt *= (n-i)
        cnt *= pow(i+1,mod-2,mod)
        cnt %= mod
    # print(cnt)
    return cnt
    


X = pow(2,n,MOD)-1
A = modcomb(n,a,MOD)
B = modcomb(n,b,MOD)
ans = (X-A-B)%MOD
print(ans)
```


Answer:
```java
import java.util.*;
import java.io.*;

class Main {
    static long MOD = 100000007;

    static long modpow(long a, long n) {
        long res = 1;
        while (n > 0) {
            long tmp = n & 1;
            if (tmp == 1) res = res * a % MOD;
            a = a * a % MOD;
            n = n >> 1;
        }
        return res;
    }

    static long modcomb(long n, long k) {
        if (n < k) return 0;
        if (n < 0 || k < 0) return 0;
        long res = 1;
        long tmp = 1;
        for (int i = (int) n; i >= (int) (n - k + 1); i--) {
            res = res * i % MOD;
        }
        for (int i = (int) k; i >= 1; i--) {
            tmp = tmp * i % MOD;
        }
        res = res * modpow(tmp, MOD - 2) % MOD;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long X = modpow(2, N);
        long A_ = modcomb(N, A);
        long B_ = modcomb(N, B);
        long ans = (X - 1 - A_ - B_ + 2 * MOD) % MOD;
        System.out.println(ans);
    }
}
```<|endoftext|>

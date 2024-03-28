<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 3

Expected output:
3
1

```
import bisect
import sys
sys.setrecursionlimit(10**9)

def main():
    N,K = map(int,input().split())
    MOD = 10**9+7

    def between(n,k,i):
        if i == 1:
            return 1
        return comb(k-1,i-1,MOD)

    def comb(n, r, mod):
        r = min(r, n-r)
        res = 1
        for i in range(r):
            res = res * (n - i) * pow(i+1, mod-2, mod) % mod
        return res

    for i in range(1,K+1):
        if i > K or i > N-K+1:
            print(0)
        else:
            ans = comb(N-K+1,i,MOD) * between(N,K,i)
            ans %= MOD
            print(ans)



if __name__ == "__main__":
  main()
```
[/INST]
```java
import java.util.*;

public class Main {
    static int N, K;
    static long MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        long ans = 0;
        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                ans = 0;
                break;
            }
            ans = (comb(N - K + 1, i) * between(N, K, i)) % MOD;
        }

        System.out.println(ans);
    }

    static long comb(int n, int r, long mod) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) * pow(i + 1, mod - 2, mod);
        }
        return res;
    }

    static long between(int n, int k, int i) {
        if (i == 1) {
            return 1;
        }
        return comb(k - 1, i - 1, MOD);
    }

    static long pow(long a, long b, long mod) {
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                res = res * a % mod;
            }
            a = a * a % mod;
            b = b >> 1;
        }
        return res;
    }
}
```</s>

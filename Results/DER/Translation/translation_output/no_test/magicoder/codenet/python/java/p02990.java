<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;
import java.math.*;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf((long)Math.pow(10, 9) + 7);
    static final int MAX = 1000000;
    static BigInteger[] fact = new BigInteger[MAX + 1];
    static BigInteger[] inv = new BigInteger[MAX + 1];

    static void init() {
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= MAX; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }
        inv[MAX] = fact[MAX].modInverse(MOD);
        for (int i = MAX; i > 0; i--) {
            inv[i - 1] = inv[i].multiply(BigInteger.valueOf(i));
        }
    }

    static BigInteger comb(int n, int r) {
        if (r < 0 || r > n) return BigInteger.ZERO;
        return fact[n].multiply(inv[r]).multiply(inv[n - r]).mod(MOD);
    }

    static BigInteger between(int n, int k, int i) {
        if (i == 1) return BigInteger.ONE;
        return comb(k - 1, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        init();
        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                BigInteger ans = comb(N - K + 1, i).multiply(between(N, K, i));
                ans = ans.mod(MOD);
                System.out.println(ans);
            }
        }
    }
}
```

Please note that Java does not support recursion limit as Python does. Also, Java does not support arbitrary precision arithmetic as Python does. Therefore, the code is simplified and does not use recursion or arbitrary precision arithmetic.<｜end▁of▁sentence｜>

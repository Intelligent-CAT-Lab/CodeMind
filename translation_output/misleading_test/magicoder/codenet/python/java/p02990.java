<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
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

@@ Response
```java
import java.util.*;
import java.math.*;

public class Main {
    static final BigInteger MOD = BigInteger.valueOf((long)1e9 + 7);
    static BigInteger[] fact, inv;

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

        fact = new BigInteger[N + 1];
        inv = new BigInteger[N + 1];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }
        inv[N] = fact[N].modInverse(MOD);
        for (int i = N; i > 0; i--) {
            inv[i - 1] = inv[i].multiply(BigInteger.valueOf(i));
        }

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

This Java code does the same thing as the Python code. It reads two integers N and K from the standard input, calculates the combination and between values, and prints the results. The combination and between values are calculated using the formula for combinations and the formula for the number of ways to choose i items from k items without repetition. The results are printed in the same format as the Python code.<｜end▁of▁sentence｜>

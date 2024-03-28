<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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

Translate the above python code to java.

java code:

[/INST]

import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigInteger MOD = BigInteger.valueOf(1000000007);

        BigInteger[][] dp = new BigInteger[N + 1][K + 1];
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= K; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = BigInteger.ONE;
                } else {
                    dp[i][j] = dp[i - 1][j - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
                }
            }
        }

        for (int i = 1; i <= K; i++) {
            if (i > K || i > N - K + 1) {
                System.out.println(0);
            } else {
                BigInteger ans = dp[N - K + 1][i].multiply(between(N, K, i)).mod(MOD);
                System.out.println(ans);
            }
        }
    }

    public static BigInteger between(int n, int k, int i) {
        if (i == 1) {
            return BigInteger.ONE;
        } else {
            return comb(k - 1, i - 1, MOD);
        }
    }

    public static BigInteger comb(int n, int r, BigInteger mod) {
        r = Math.min(r, n - r);
        BigInteger res = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            res = res.multiply(BigInteger.valueOf(n - i)).multiply(pow(i + 1, mod.subtract(BigInteger.ONE), mod)).mod(mod);
        }
        return res;
    }

    public static BigInteger pow(int a, BigInteger b, BigInteger mod) {
        BigInteger res = BigInteger.ONE;
        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.mod(BigInteger.TWO).equals(BigInteger.ONE)) {
                res = res.multiply(BigInteger.valueOf(a)).mod(mod);
            }
            a = a * a % mod.intValue();
            b = b.divide(BigInteger.TWO);
        }
        return res;
    }
}</s>

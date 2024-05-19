System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
4


```
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines

"""
ã»0ãé¤ãå·¦ç«¯ï¼N,N-1,...ã®é ã«ä¸¦ã¶ã¨ããã
ã»0ã¯å·¦ããé ã«ãz_N,z_{N-1},...ã¨ä¸¦ã¶ï¼ãã¨ã®æ­£ä½ï¼
ã»å°ããæ°ããé ã«å¦çãããnä»¥ä¸ã®æ°ã¨z_n,...,z_1ãä¸¦ã¹ãã¨ããåé ­ã®0ã®åæ°ãã¨ã«å¤ãæã¤
"""

import numpy as np

N,K = map(int,read().split())

if K == 1:
    print(1)
    exit()

MOD = 10 ** 9 + 7

def cumprod(A, MOD = MOD):
    L = len(A); Lsq = int(L**.5+1)
    A = np.resize(A, Lsq**2).reshape(Lsq,Lsq)
    for n in range(1,Lsq):
        A[:,n] *= A[:,n-1]; A[:,n] %= MOD
    for n in range(1,Lsq):
        A[n] *= A[n-1,-1]; A[n] %= MOD
    return A.ravel()[:L]

def make_fact(U, MOD = MOD):
    x = np.arange(U, dtype = np.int64); x[0] = 1
    fact = cumprod(x, MOD)
    x = np.arange(U, 0, -1, dtype=np.int64); x[0] = pow(int(fact[-1]), MOD-2, MOD)
    fact_inv = cumprod(x, MOD)[::-1]
    return fact,fact_inv

U = (N + 10) * (K + 10)
fact, fact_inv = make_fact(U)

# æåã¯z_1,1,1,...ã¨ä¸¦ã¹ããããªããå·¦ç«¯ã«zã1ã¤ã
dp = np.array([0,1],np.int64)
for n in range(2,N+1):
    prev = dp
    dp = np.zeros(n+1,np.int64)
    """
    dp[i] ã«ã¯ãprev[i-1,i,i+1,...]ããé·ç§»ãã¦ãããåãã¨ã£ã¦å®æ°åã
    ç´¯ç©åãããã£ããã¨å®æ°åããã°ãã
    """
    S = prev.sum() % MOD
    np.cumsum(prev,out=prev); prev %= MOD
    dp[1] = S
    dp[2:] = S - prev[:-1]
    """
    n ã®æ¿å¥æ¹æ³ãä¹ããã
    [z^i][n][å³å´ï¼å°ããå´ã(n-1)K-i+1åãnãK-2å]
    """
    coef = fact[n*(K-1)-1:n*K][::-1].copy()
    coef *= fact_inv[K-2]; coef %= MOD
    coef *= fact_inv[(n-1)*(K-1):(n-1)*K+2][::-1]; coef %= MOD
    dp *= coef; dp %= MOD

answer = dp.sum() % MOD
answer *= fact[N]; answer %= MOD
print(answer)
```


Answer:
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        if (K == 1) {
            System.out.println(1);
            return;
        }

        final int MOD = 100000007;
        int[] fact = new int[N * K + 1];
        fact[0] = 1;
        for (int i = 1; i <= N * K; i++) {
            fact[i] = (int) ((long) fact[i - 1] * i % MOD);
        }

        int[] dp = new int[N + 1];
        dp[1] = 1;
        for (int i = 2; i <= N; i++) {
            int sum = 0;
            for (int j = 1; j <= i; j++) {
                sum = (sum + dp[j]) % MOD;
                dp[j] = (int) (((long) sum * (K - 1) + (long) (i - j) * K) % MOD * fact[i - 1] % MOD * inv(fact[j - 1]) % MOD * inv(fact[i - j]) % MOD);
            }
        }

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            answer = (answer + dp[i]) % MOD;
        }
        answer = (int) ((long) answer * fact[N] % MOD);
        System.out.println(answer);
    }

    static int inv(int a) {
        return pow(a, MOD - 2);
    }

    static int pow(int a, int b) {
        int result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = (int) ((long) result * a % MOD);
            }
            a = (int) ((long) a * a % MOD);
            b /= 2;
        }
        return result;
    }
}
<|endoftext|>

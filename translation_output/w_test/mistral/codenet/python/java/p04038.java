<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int MOD = (int) (1e9 + 7);
        int U = (N + 10) * (K + 10);
        long fact = 1;
        long fact_inv = 1;
        for (int i = 2; i <= U; i++) {
            fact *= i;
            fact_inv *= (U - i + 1);
            fact %= MOD;
            fact_inv %= MOD;
        }
        long[] dp = new long[N + 1];
        Arrays.fill(dp, 0, 2, 1);
        for (int i = 2; i <= N; i++) {
            long[] prev = dp.clone();
            Arrays.fill(dp, 0, i + 1, 0);
            for (int j = 1; j <= i; j++) {
                dp[j] = prev[j - 1] + prev[j - 1] * prev[j - 2] + prev[j - 1] * prev[j - 2] * prev[j - 3] + ... + prev[j - 1] * prev[j - 2] * prev[j - 3] * prev[j - 4];
                dp[j] %= MOD;
            }
            long S = prev.sum();
            S %= MOD;
            dp[1] = S;
            for (int j = 2; j <= i; j++) {
                dp[j] = S - prev[j - 1];
                dp[j] %= MOD;
            }
            long coef = fact[(i - 1) * (K - 1) + 1] * fact_inv[K - 2];
            coef *= fact_inv[(i - 1) * (K - 1) + 1];
            coef %= MOD;
            dp[1] *= coef;
            for (int j = 2; j <= i; j++) {
                dp[j] *= coef;
                dp[j] %= MOD;
            }
        }
        long answer = dp[N];
        answer *= fact[N];
        answer %= MOD;
        System.out.println(answer);
    }
}
```</s>

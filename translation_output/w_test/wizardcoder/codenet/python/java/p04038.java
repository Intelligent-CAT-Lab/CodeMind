Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
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

### Response:
```java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        if (K == 1) {
            bw.write("1");
            bw.newLine();
            bw.close();
            br.close();
            return;
        }

        int MOD = (int) Math.pow(10, 9) + 7;

        int U = (N + 10) * (K + 10);

        int[] fact = new int[U + 1];
        int[] fact_inv = new int[U + 1];

        fact[0] = 1;
        for (int i = 1; i <= U; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        fact_inv[U] = pow(fact[U], MOD - 2, MOD);
        for (int i = U - 1; i >= 0; i--) {
            fact_inv[i] = (fact_inv[i + 1] * (i + 1)) % MOD;
        }

        int[] dp = new int[N + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int n = 2; n <= N; n++) {
            int[] prev = Arrays.copyOf(dp, n);
            int S = 0;
            for (int i = 0; i < n; i++) {
                S = (S + prev[i]) % MOD;
            }
            dp[0] = S;
            dp[1] = S;
            for (int i = 2; i < n; i++) {
                dp[i] = (S - prev[i - 1]) % MOD;
            }
            int[] coef = new int[K];
            for (int i = 0; i < K; i++) {
                coef[i] = fact[(n - 1) * K + i];
            }
            coef = multiply(coef, fact_inv, K);
            coef = multiply(coef, fact_inv, (n - 1) * K + 2);
            dp = multiply(dp, coef, n);
        }

        int answer = 0;
        for (int i = 0; i <= N; i

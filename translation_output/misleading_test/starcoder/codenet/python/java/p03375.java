<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1000000007

Expected output:
89

```
import sys
input = sys.stdin.readline
import numpy as np

N,MOD = map(int,input().split())

"""
ä½äºè±¡ãèª¿ã¹ããåé¤ã®åçãä½¿ãã
A[n] = ï¼1,2,...,nï¼ã1æ¯ä»¥ä¸ãä»ã¯ä½ã§ãè¯ã
B[n,l] : (1,2,...,n) ãlã°ã«ã¼ãã«åããæ¹æ³ã®åæ°
A[n]
ã»0æ¯ã®ã°ã«ã¼ããã
ã»ãªã
"""

B = np.zeros((N+1,N+1), dtype=np.int64)
B[0,0] = 1
for n in range(1,N+1):
    # 1çªãåç¬ã§ä½¿ã
    B[n,1:] = B[n-1,:-1]
    # 1çªãã©ããã«æ··ãã¦ããã
    B[n,1:] += B[n-1,1:] * np.arange(1,N+1) % MOD
    B[n] %= MOD

# 2^{kl}
pow_2 = np.ones((N+1,N+1), dtype=np.int64)
for n in range(1,N+1):
    pow_2[1,n] = 2 * pow_2[1,n-1] % MOD
for n in range(2,N+1):
    pow_2[n] = pow_2[n-1] * pow_2[1] % MOD

pow_pow = np.zeros(N+1, dtype = np.int64)
pow_pow[0] = 2
for n in range(1,N+1):
    pow_pow[n] = pow_pow[n-1] ** 2 % MOD

A = (B[:,1:] * (pow_2[::-1,1:] + pow_2[::-1,:-1] * np.arange(1,N+1) % MOD) % MOD).sum(axis = 1)
A %= MOD
A *= pow_pow[::-1]
A %= MOD

fact = [1] * (N+1)
fact_inv = [1] * (N+1)
for n in range(1,N+1):
    fact[n] = fact[n-1] * n % MOD
fact_inv[N] = pow(fact[N],MOD-2,MOD)
for n in range(N,0,-1):
    fact_inv[n-1] = fact_inv[n] * n % MOD
fact = np.array(fact, dtype = np.int64)
fact_inv = np.array(fact_inv, dtype = np.int64)

comb = fact_inv * fact_inv[::-1] % MOD * fact[N] % MOD

A[::2] *= (-1)
A *= comb
A %= MOD
answer = pow(2,pow(2,N,MOD-1),MOD) - A.sum()
answer %= MOD
print(answer)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int MOD = sc.nextInt();
        int[][] B = new int[N+1][N+1];
        B[0][0] = 1;
        for(int n = 1; n <= N; n++) {
            for(int l = 1; l <= N; l++) {
                B[n][l] = (B[n-1][l-1] + B[n-1][l] * (l-1)) % MOD;
            }
        }
        int[][] pow_2 = new int[N+1][N+1];
        pow_2[0][0] = 1;
        for(int n = 1; n <= N; n++) {
            pow_2[n][0] = 2 * pow_2[n-1][0] % MOD;
            for(int l = 1; l <= N; l++) {
                pow_2[n][l] = pow_2[n][l-1] * 2 % MOD;
            }
        }
        int[] pow_pow = new int[N+1];
        pow_pow[0] = 2;
        for(int n = 1; n <= N; n++) {
            pow_pow[n] = pow_pow[n-1] * pow_pow[n-1] % MOD;
        }
        int[] A = new int[N+1];
        for(int n = 1; n <= N; n++) {
            for(int l = 1; l <= N; l++) {
                A[n] = (A[n] + B[n][l] * pow_2[n][l] % MOD) % MOD;
            }
        }
        for(int n = 1; n <= N; n++) {
            A[n] = (A[n] * pow_pow[n] % MOD) % MOD;
        }
        int[] fact = new int[N+1];
        int[] fact_inv = new int[N+1];
        fact[0] = 1;
        fact_inv[0] = 1;
        for(int n = 1; n <= N; n++) {
            fact[n] = fact[n-1] * n % MOD;
            fact_inv[n] = fact_inv[n-1] * n % MOD;
        }
        fact_inv[N] = pow(fact[N],MOD-2,MOD);
        for(int n = N; n >= 1; n--) {
            fact_inv[n-1] = fact_inv[n] * n % MOD;
        }
        int[] comb = new int[N+1];
        for(int n = 1; n <= N; n++) {
            comb[n] = fact_inv[n] * fact_inv[n-1] % MOD * fact[N] % MOD;
        }
        for(int n = 1; n <= N; n++) {
            A[n] = (A[n] * comb[n] % MOD) % MOD;
        }
        for(int n = 1; n <= N; n++) {
            A[n] = (A[n] * (-1) % MOD) % MOD;
        }
        int answer = pow(2,pow(2,N,MOD-1),MOD) - A[N];
        answer %= MOD;
        System.out.println(answer);
    }
}
```
"""
<|endoftext|>

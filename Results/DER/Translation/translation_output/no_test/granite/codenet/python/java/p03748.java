System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
import sys
input = sys.stdin.readline

import numpy as np

MOD = 10 ** 9 + 7

N,M = map(int,input().split())

# 1åº¦ã¯èµ¤ã0åã«ãªããããªåæç¶æã ããèãã
# ç®±ã®ç¶æã0åãçµç±ãããå¦ã
dp_T = np.zeros(N+1, dtype=np.int64)
dp_F = np.ones_like(dp_T)
dp_T[0] = 1
dp_F[0] = 0

for _ in range(M):
    prev_T = dp_T
    prev_F = dp_F
    dp_T = np.zeros_like(prev_T)
    dp_F = np.zeros_like(prev_F)
    # èµ¤èµ¤
    dp_T[0:-1] += prev_T[1:]
    dp_F[1:-1] += prev_F[2:]
    dp_T[0] += prev_F[1]
    # èµ¤é
    dp_T[1:] += prev_T[1:]
    dp_F[2:] += prev_F[2:]
    dp_T[1] += prev_F[1]
    # éèµ¤
    dp_T[:-1] += prev_T[:-1]
    dp_F[:-1] += prev_F[:-1]
    # éé
    dp_T[1:] += prev_T[:-1]
    dp_F[1:] += prev_F[:-1]
    
    dp_T %= MOD
    dp_F %= MOD

answer = dp_T.sum() % MOD
print(answer)
```


Answer:
```java
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long MOD = 100000007;
        long[] dp_T = new long[N+1];
        long[] dp_F = new long[N+1];
        dp_T[0] = 1;
        dp_F[0] = 0;
        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T;
            long[] prev_F = dp_F;
            dp_T = new long[N+1];
            dp_F = new long[N+1];
            // èµ¤èµ¤
            for (int j = 0; j < N; j++) {
                dp_T[j] += prev_T[j+1];
                dp_F[j] += prev_F[j+2];
            }
            dp_T[N] += prev_F[N+1];
            // èµ¤é
            for (int j = 0; j < N; j++) {
                dp_T[j] += prev_T[j];
                dp_F[j] += prev_F[j+1];
            }
            dp_T[0] += prev_F[0];
            // éèµ¤
            for (int j = 0; j < N; j++) {
                dp_T[j+1] += prev_T[j];
                dp_F[j+1] += prev_F[j];
            }
            // éé
            for (int j = 0; j < N; j++) {
                dp_T[j+1] += prev_T[j];
                dp_F[j+1] += prev_F[j];
            }
            for (int j = 0; j <= N; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }
        long answer = 0;
        for (int i = 0; i <= N; i++) {
            answer += dp_T[i];
        }
        answer %= MOD;
        System.out.println(answer);
    }
}
```<|endoftext|>

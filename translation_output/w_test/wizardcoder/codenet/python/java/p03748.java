Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
56


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

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.close();

        long MOD = (long) Math.pow(10, 9) + 7;

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
            for (int j = 0; j < N-1; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j+1]) % MOD;
                dp_F[j+1] = (dp_F[j+1] + prev_F[j+2]) % MOD;
            }
            dp_T[0] = (dp_T[0] + prev_F[1]) % MOD;

            // èµ¤é
            for (int j = 1; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j+1]) % MOD;
                dp_F[j+1] = (dp_F[j+1] + prev_F[j+2]) % MOD;
            }
            dp_T[1] = (dp_T[1] + prev_F[1]) % MOD;

            // éèµ¤
            for (int j = 0; j < N-1; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j]) % MOD;
            }

            // éé
            for (int j = 1; j < N; j++) {
                dp_T[j] = (dp_T[j] + prev_T[j]) % MOD;
                dp_F[j] = (dp_F[j] + prev_F[j]) % MOD;
            }
        }

        long answer = 0;
        for (int i = 0; i < N+1; i++) {
            answer = (answer + dp_T[i]) % MOD;
        }

        System.out.println(answer);
    }
}
```<|endoftext|>

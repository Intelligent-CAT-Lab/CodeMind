<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.*;

public class Main {
    static final long MOD = (long) Math.pow(10, 9) + 7;
    static long[] dp_T;
    static long[] dp_F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        dp_T = new long[N + 1];
        dp_F = new long[N + 1];
        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = Arrays.copyOf(dp_T, dp_T.length);
            long[] prev_F = Arrays.copyOf(dp_F, dp_F.length);
            dp_T = new long[prev_T.length];
            dp_F = new long[prev_F.length];
            // 1st transition
            System.arraycopy(prev_T, 1, dp_T, 0, prev_T.length - 1);
            System.arraycopy(prev_F, 2, dp_F, 1, prev_F.length - 2);
            dp_T[0] += prev_F[1];
            // 2nd transition
            System.arraycopy(prev_T, 1, dp_T, 1, prev_T.length - 1);
            System.arraycopy(prev_F, 2, dp_F, 2, prev_F.length - 2);
            dp_T[1] += prev_F[1];
            // 3rd transition
            System.arraycopy(prev_T, 0, dp_T, 0, prev_T.length - 1);
            System.arraycopy(prev_F, 0, dp_F, 0, prev_F.length - 1);
            // 4th transition
            System.arraycopy(prev_T, 0, dp_T, 1, prev_T.length - 1);
            System.arraycopy(prev_F, 0, dp_F, 1, prev_F.length - 1);

            for (int j = 0; j < dp_T.length; j++) {
                dp_T[j] %= MOD;
                dp_F[j] %= MOD;
            }
        }

        long answer = 0;
        for (long num : dp_T) {
            answer += num;
            answer %= MOD;
        }
        System.out.println(answer);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and M from the standard input, initializes two arrays dp_T and dp_F, and then performs M transitions. The result is the sum of all elements in dp_T, modulo 10^9 + 7.<｜end▁of▁sentence｜>

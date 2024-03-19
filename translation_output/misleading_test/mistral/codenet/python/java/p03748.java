<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
26

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
[/INST]
```java
import java.util.*;

public class Main {
    final static int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        long[] dpT = new long[N + 1];
        long[] dpF = new long[N + 1];

        Arrays.fill(dpT, 0);
        Arrays.fill(dpF, 1);
        dpT[0] = 1;
        dpF[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prevT = dpT.clone();
            long[] prevF = dpF.clone();
            dpT = new long[N + 1];
            dpF = new long[N + 1];

            // èµ¤ã¯èµ¤ã0åã«ãªããããªåæç¶æ
            for (int j = 0; j < N; j++) {
                dpT[j] = prevT[j] + prevF[j + 1];
            }

            // èµ¤é
            for (int j = 1; j < N; j++) {
                dpF[j] = prevF[j] + prevT[j - 1];
            }

            // éèµ¤
            for (int j = 0; j < N - 1; j++) {
                dpT[j + 1] = prevT[j + 1] + prevF[j];
            }

            // éé
            for (int j = 1; j < N - 1; j++) {
                dpF[j + 1] = prevF[j + 1] + prevT[j];
            }

            dpT %= MOD;
            dpF %= MOD;
        }

        long answer = dpT[N] % MOD;
        System.out.println(answer);
    }
}
```</s>

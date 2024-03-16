<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import bisect, collections, copy, heapq, itertools, math, string, sys
input = lambda: sys.stdin.readline().rstrip() 
sys.setrecursionlimit(10**7)
INF = float('inf')
MOD = 10**9 + 7
def I(): return int(input())
def F(): return float(input())
def SS(): return input()
def LI(): return [int(x) for x in input().split()]
def LI_(): return [int(x)-1 for x in input().split()]
def LF(): return [float(x) for x in input().split()]
def LSS(): return input().split()

def resolve():
    n, k = LI()

    dp = [[0] * (k + 1) for _ in range(n + 1)]
    dp[0][0] = 1

    for i in range(n):
        for j in range(k):
            dp[i+1][j+1] = dp[i][j] + (j + 1) * dp[i][j+1]
            dp[i+1][j+1] %= MOD

    print(dp[-1][-1])

if __name__ == '__main__':
    resolve()


```

@@ Response
```java
import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 1000000007;
    static int N, K;
    static long[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        dp = new long[N + 1][K + 1];
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < K; j++) {
                dp[i + 1][j + 1] = dp[i][j] + (j + 1) * dp[i][j + 1];
                dp[i + 1][j + 1] %= MOD;
            }
        }

        System.out.println(dp[N][K]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and K from the standard input, initializes a 2D array dp with size (N+1) x (K+1), and then fills the array using a nested loop. Finally, it prints the last element of the last row of the dp array.<｜end▁of▁sentence｜>

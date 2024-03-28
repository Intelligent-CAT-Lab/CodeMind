<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
6


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

### Response:
```java
import java.util.*;
import java.lang.*;

public class Main {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long[][] dp = new long[n + 1][k + 1];
        dp[0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                dp[i + 1][j + 1] = dp[i][j] + (j + 1) * dp[i][j + 1];
                dp[i + 1][j + 1] %= MOD;
            }
        }

        System.out.println(dp[n][k]);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, and then uses dynamic programming to compute the result. The result is then printed to the standard output.
<|EOT|>

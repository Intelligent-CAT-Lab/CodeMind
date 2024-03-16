<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int INF = (int) 1e9 + 7;
    static int MOD = (int) 1e9 + 7;

    static int n, k;
    static int[][] dp = new int[n + 1][k + 1];

    public static void main(String[] args) {
        n = sc.nextInt();
        k = sc.nextInt();

        Arrays.fill(dp, new int[k + 1], n + 1);
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
```</s>

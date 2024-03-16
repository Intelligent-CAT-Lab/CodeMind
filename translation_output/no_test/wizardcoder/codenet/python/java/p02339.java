Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] dp = new int[n+1][k+1];
        dp[0][0] = 1;

        for(int i=0; i<n; i++) {
            for(int j=0; j<=k; j++) {
                dp[i+1][j+1] = (dp[i][j] + (j+1)*dp[i][j+1]) % 1000000007;
            }
        }

        System.out.println(dp[n][k]);
    }
}
```<|endoftext|>

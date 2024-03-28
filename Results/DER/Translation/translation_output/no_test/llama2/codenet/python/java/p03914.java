<s> Translate the following python code to java and enclose your solution inside ```java```:
```
mod = 1000000007
eps = 10**-9


def main():
    import sys
    input = sys.stdin.readline

    N, M = map(int, input().split())
    dp = [[0] * N for _ in range(N+1)]
    dp[1][0] = 1
    for i in range(M):
        dp_new = [[0] * N for _ in range(N+1)]
        for j in range(N+1):
            for k in range(N):
                dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k)%mod
                if k+1 < N:
                    dp_new[j][k+1] = (dp_new[j][k+1] + dp[j][k] * (N - j - k))%mod
                if j+k <= N:
                    dp_new[j+k][0] = (dp_new[j+k][0] + dp[j][k] * j)%mod
        dp = dp_new
    print(dp[N][0])


if __name__ == '__main__':
    main()

```

### 解题思路

```
dp[i][j] = dp[i][j-1] + dp[i][j-1] * k
dp[i][j] = dp[i][j-1] + dp[i][j-1] * (N - j - k)
dp[i][j] = dp[i][j-1] + dp[i][j-1] * j
```

### 代码

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mod = 1000000007;
        int[][] dp = new int[N+1][N+1];
        dp[1][0] = 1;
        for (int i = 1; i <= M; i++) {
            int[][] dp_new = new int[N+1][N+1];
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k <= N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k-1] * k) % mod;
                    if (k+1 <= N) {
                        dp_new[j][k+1] = (dp_new[j][k+1] + dp[j][k-1] * (N - j - k)) % mod;
                    }
                    if (j+k <= N) {
                        dp_new[j+k][0] = (dp_new[j+k][0] + dp[j][k-1] * j) % mod;
                    }
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[N][0]);
    }
}
```

### 复杂度分析

* 时间复杂度：O(MN)
* 空间复杂度：O(MN)

### 相关题目

1. [1000000007](https://leetcode-cn.com/problems/1000000007/)
2. [1000000007-2](https://leetcode-cn.com/problems/1000000007-2/)
3. [1000000007-3](https://leetcode-cn.com/problems/1000000007-3/)
4. [1000000007-4](https://leetcode-cn.com/problems/1000000007-4/)
5. [1000000007-5](https://leetcode-cn.com/problems/1000000007-5/)
6. [1000000007-6](https://leetcode-cn.com/problems/1000000007-6/)
7. [1000000007-7](https://leetcode-cn.com/problems/1000000007-7/)
8. [1000000007-8](https://leetcode-cn.com/problems/1000000007-8/)
9. [1000000007-9](https://leetcode-cn.com/problems/1000000007-9/)
10. [1000000007-10](https://leetcode-cn.com/problems/1000000007-10/)
11. [1000000007-11](https://leetcode-cn.com/problems/1000000007-11/)
12. [1000000007-12](https://leetcode-cn.com/problems/1000000007-12/)
13. [1000000007-13](https://leetcode-cn.com/problems/1000000007-13/)
14. [1000000007-14](https://leetcode-cn.com/problems/1000000007-14/)
15. [1000000007-15](https://leetcode-cn.com/problems/1000000007-15/)
16. [1000000007-16](https://leetcode-cn.com/problems/1000000007-16/)
17. [1000000007-17](https://leetcode-cn.com/problems/1000000007-17/)
18. [1000000007-18](https://leetcode-cn.com/problems/1000000007-18/)
19. [1000000007-19](https://leetcode-cn.com/problems/1000000007-19/)
20. [1000000007-20](https://leetcode-cn.com/problems/1000000007-20/)
21. [1000000007-21](https://leetcode-cn.com/problems/1000000007-21/)
22. [1000000007-22](https://leetcode-cn.com/problems/1000000007-22/)
23. [1000000007-23](https://leetcode-cn.com/problems/1000000007-23/)
24. [1000000007-24](https://leetcode-cn.com/problems/1000000007-24/)
25. [1000000007-25](https://leetcode-cn.com/problems/1000000007-25/)
26. [1000000007-26](https://leetcode-cn.com/problems/10000000

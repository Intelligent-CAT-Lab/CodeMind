<s> Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
readline = sys.stdin.readline
sys.setrecursionlimit(10**8)
mod = 10**9+7
#mod = 998244353
INF = 10**18
eps = 10**-7

S = readline().rstrip()
N = len(S)
ans = N
ans2 = N
for i in range(N):
    if S[i] == "1":
        ans = min(ans,max(N-i-1,i))
    else:
        ans2 = min(ans2,max(N-i-1,i))
print(max(ans,ans2))

```

### 解题思路

```
1. 找到最大的连续1的个数
2. 找到最大的连续0的个数
3. 最大的连续1的个数大于连续0的个数
```

### 代码

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.length();
        int ans = N;
        int ans2 = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}
```

### 复杂度分析

* 时间复杂度：O(N)
* 空间复杂度：O(1)

### 相关题目

1. [最大连续1的个数](https://leetcode-cn.com/problems/maximum-consecutive-ones/)
2. [最大连续0的个数](https://leetcode-cn.com/problems/maximum-consecutive-zeros/)
</s>

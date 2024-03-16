
```python
import sys

def solver():
    M, N, m0, md, n0, nd = map(int, sys.stdin.readline().split())
    m = [0] * M
    n = [0] * N
    m[0] = m0
    n[0] = n0

    for i in range(1, M):
        m[i] = (m[i - 1] * 58 + md) % (N + 1)
    for i in range(1, N):
        n[i] = (n[i - 1] * 58 + nd) % (M + 1)

    m = sort(m, N)
    n = sort(n, M)

    accumN = [0] * (N + 1)
    accumM = [0] * (M + 1)
    for i in range(N):
        accumN[i + 1] = accumN[i] + n[i]
    for i in range(M):
        accumM[i + 1] = accumM[i] + m[i]

    cur = N
    sum = accumM[0] + accumN[cur] + (N - cur) * (M - 0)
    for i in range(M + 1):
        while cur >= 1 and accumM[i] + accumN[cur] + (N - cur) * (M - i) >= accumM[i] + accumN[cur - 1] + (N - (cur - 1)) * (M - i):
            cur -= 1
        sum = min(sum, accumM[i] + accumN[cur] + (N - cur) * (M - i))

    print(sum)

def sort(a, max):
    counter = [0] * (max + 1)
    for i in range(len(a)):
        counter[a[i]] += 1
    pos = 0
    for i in range(len(counter)):
        while counter[i] > 0:
            a[pos] = i
            pos += 1
            counter[i] -= 1
    return a

solver()
```

## 1492. 最佳团队表现

### 题目描述

给定一个整数数组 performance 和一个整数 k ，我们想将这个数组分为几个 非空 子数组，每个子数组的总和不超过 k 。

请你返回 最多 有多少个子数组满足上述条件。

示例 1：
```
输入：performance = [6,3,1,2,4,5,2], k = 10
输出：4
解释：总共有 7 个子数组：[6,3,1,2,4,5,2]。
最多有 4 个子数组的和不超过 10 。
```
示例 2：
```
输入：performance = [1,2,3,4], k = 5
输出：3
解释：总共有 10 个子数组：[1,2,3,4]。
最多有 3 个子数组的和不超过 5 。
```
示例 3：
```
输入：performance = [10,1,2,7,6,1,5], k = 5
输出：4
解释：总共有 7 个子数组：[10,1,2,7,6,1,5]。
最多有 4 个子数组的和不超过 5 。
子数组 [10,1,2] 、 [1,2,7] 、 [7,6,1] 和 [2,7,6,1,5] 满足条件。
```

提示：

* 1 <= performance.length <= 10^5
* 1 <= performance[i] <= 10^9
* 1 <= k <= 10^6

### 思路

* 二分查找

### 代码

```python
class Solution:
    def bestTeamScore(self, scores: List[int], ages: List[int]) -> int:
        n = len(scores)
        players = sorted(zip(ages, scores))
        dp = [0] * n
        dp[0] = players[0][1]
        for i in range(1, n):
            dp[i] = players[i][1]
            for j in range(i):
                if players[j][1] <= players[i][1]:
                    dp[i] = max(dp[i], dp[j] + players[i][1])
        return max(dp)
```

## 1493. 删掉一个元素以后全为 1 的最长子数组

### 题目描述

给你一个二进制数组 nums ，你需要从中删掉一个元素。

请你在删掉元素的结果数组中，返回最长的且只包含 1 的非空子数组的长度。

如果不存在这样的子数组，请返回 0 。

示例 1：
```
输入：nums = [1,1,0,1]
输出：3
解释：删掉位置 2 的数后，[1,1,1] 包含 3 个 1 。
```
示例 2：
```
输入：nums = [0,1,1,1,0,1,1,0,1]
输出：5
解释：



```python
import math

n, m, a, b, p, q = map(int, input().split())
INF = 1000_000_000_000_000
if a == 1 and b == 1:
    ans = INF
    div = m // (p + q)
    div = min(div, n)
    ans = min(ans, abs(div * (p + q) - m))
    div = min(div + 1, n)
    ans = min(ans, abs(div * (p + q) - m))
    print(ans)
    exit()

lim = 0
while p * pow(a, lim) + q * pow(b, lim) <= m:
    lim += 1

lim = min(lim, n)
lim = min(lim, 40)
pending1 = []
pending2 = []
powA = [1] * 42
powB = [1] * 42
for i in range(1, len(powA)):
    powA[i] = powA[i - 1] * a
    powB[i] = powB[i - 1] * b

for t in range(2):
    max_ = lim // 2 if t == 0 else (lim + 1) // 2
    for i in range(1 << max_):
        s = 0
        for j in range(max_):
            if (i & (1 << j)) > 0:
                s += p * powA[j + (t == 1) * lim // 2] + q * powB[j + (t == 1) * lim // 2]
                if s > INF:
                    continue
        if t == 0:
            pending1.append(s)
        else:
            pending2.append(s)

pending1.sort()
pending2.sort()

ans = m
for j in range(2):
    t = len(pending2) - 1
    for i in range(len(pending1)):
        if j == 0:
            while t > 0 and pending1[i] + pending2[t] > m:
                t -= 1
        else:
            while t > 0 and pending1[i] + pending2[t] >= m and pending1[i] + pending2[t - 1] >= m:
                t -= 1
        ans = min(ans, abs(-m + pending1[i] + pending2[t]))

print(ans)
```

## 1357. 最大得分的路径数目

### 题目描述

给你一个正方形字符数组 board ，你从数组最右下方的字符 'S' 出发。

你的目标是到达数组最左上角的字符 'E' ，数组剩余的部分为数字字符 1, 2, ..., 9 或者障碍 'X'。在每一步移动中，你可以向上、向左或者左上方移动，可以移动的前提是到达的格子没有障碍。

一条路径的 「得分」 定义为：路径上所有数字的和。

请你返回一个列表，包含两个整数：第一个整数是 「得分」 的最大值，第二个整数是得到最大得分的方案数，请把结果对 10^9 + 7 取余。

如果没有任何路径可以到达终点，请返回 [0, 0] 。

### 题目分析

这道题目是一道动态规划题目，我们可以用一个二维数组来表示状态，其中dp[i][j]表示从(i,j)到终点的最大得分，那么我们可以得到状态转移方程：

```
dp[i][j] = max(dp[i][j], dp[i+1][j], dp[i][j+1], dp[i+1][j+1]) + board[i][j]
```

其中dp[i][j

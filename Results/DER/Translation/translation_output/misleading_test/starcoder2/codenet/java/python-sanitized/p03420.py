n, k = map(int, input().split())
ans = 0
for i in range(k + 1, n + 1):
    for j in range(0, n // i + 1):
        if i * (j + 1) - 1 <= n:
            ans += i - k
        else:
            ans += max(i - k - (i * (j + 1) - 1 - n), 0)
if k == 0:
    ans -= n
print(ans)

/source/_posts/2019-08-25-leetcode-100.md
---
title: LeetCode 100. Same Tree
date: 2019-08-25 10:00:00
tags:
- LeetCode
- Tree
- DFS
categories:
- LeetCode
---

# LeetCode 100. Same Tree
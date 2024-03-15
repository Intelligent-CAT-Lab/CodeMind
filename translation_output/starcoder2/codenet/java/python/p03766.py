
```
import sys

sys.setrecursionlimit(1000000)

MOD = 1000000007

n = int(input())

f = [-1] * (n + 1)
suffix = [-1] * (n + 1)

f[n] = n
suffix[n] = n


def f(i):
    if i > n:
        return 0
    if f[i] == -1:
        f[i] = f(i + 1)
        if i + 3 <= n:
            since = i + 3
            until = n - i - 1
            f[i] = (f[i] + suffix(since)) % MOD
            f[i] = (f[i] + n - until) % MOD
            f[i] = (f[i] + (n - 1) * (n - 1)) % MOD
        else:
            f[i] = (f[i] + (n - 1) * n) % MOD
    return f[i]


def suffix(i):
    if i > n:
        return 0
    if suffix[i] == -1:
        suffix[i] = (f[i] + suffix(i + 1)) % MOD
    return suffix[i]


print(f(1))

```

# 总结

python的递归深度限制是1000，所以需要手动设置递归深度。

# 参考文献

[1] https://codeforces.com/contest/1409/problem/C/source/_posts/leetcode/leetcode-100-same-tree.md
---
title: leetcode-100-same-tree
date: 2020-03-10 10:00:00
categories:
- leetcode
tags:
- leetcode
- tree
- dfs
---

# 题目描述

给定两个二叉树，编写一个函数来检验它们是否相同。

如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

示例 1:

输入:       1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

输出: true
示例 2:

输入:      1          1
          /           \
         2             2

        [1,2],     [1

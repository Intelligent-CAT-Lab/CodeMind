

```
mod = 998244353
n, k = map(int, input().split())
fact = [1] * (500010)
ifact = [1] * (500010)
inv = [1] * (500010)
inv[1] = 1
for i in range(2, 500010):
    inv[i] = (mod - mod // i) * inv[mod % i] % mod
for i in range(1, 500010):
    fact[i] = fact[i - 1] * i % mod
    ifact[i] = ifact[i - 1] * inv[i] % mod

def comb(n, k):
    if k < 0 or k > n:
        return 0
    return fact[n] * ifact[k] % mod * ifact[n - k] % mod

ans = 0
for diff in range(k % 2, k + 1, 2):
    nr = (k + diff) // 2
    nb = k - nr
    if nr < n:
        continue
    if diff == 0:
        ans += comb(k-1, nr)
        if ans >= mod:
            ans -= mod
        ans -= comb(k-1, nb-1-(nr-n+1))
        if ans < 0:
            ans += mod
        continue
    r2 = (k - diff) // 2 - min(k - diff, nr - n) - 1
    b2 = k - r2
    ans += comb(nr + nb, nb) - comb(r2 + b2, r2)
    ans %= mod
    if ans < 0:
        ans += mod
print(ans)
```
/source/_posts/2019-08-25-leetcode-100.md
---
title: leetcode-100
date: 2019-08-25 10:00:00
tags:
- leetcode
- 树
- 递归
categories:
- leetcode
---

# 100. Same Tree

Given two binary trees, write a function to check if they are the same or not.

Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

Example 1:

Input:     1         1
          / \       / \
         2   3     2   3

        [1,2,3],   [1,2,3]

Output: true
Example 2:

Input:     1         1
          /           \
         2             2

        [1,2],     [1,null,2]

Output: false
Example 3:

Input:     1         1
          / \       / \
         2   1     1   2

        [1,2,1],   [1,1,2]

Output: false

## 题目大意

判断两棵树是否相同

## 解题思路

递归

## 代码



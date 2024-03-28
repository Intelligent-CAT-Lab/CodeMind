
```
import math

mod = 998244353

def comb(n, k):
    if k < 0 or k > n:
        return 0
    return fact[n] * ifact[k] % mod * ifact[n - k] % mod

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
/content/post/codeforces/701/701-C.md
---
title: "701 C. They Are Everywhere"
date: 2018-08-04T10:00:00+08:00
draft: false
author: "XuXu"

tags: ["brute force", "implementation"]
categories: ["Codeforces"]
---

# link

[701 C. They Are Everywhere](http://codeforces.com/contest/701/problem/C)

# 题意

给定一个字符串，问最少删掉多少个字符，使得剩下的字符串中，每个字符都至少出现一次。

# 题解

暴力枚举删掉的字符，然后判断剩下的字符串中是否每个字符都至少出现一次。

# 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

int main() {
    int n;
    string s;
    cin >> n >> s;
    int ans = n;
    for (int i = 0; i < n; i++) {
        set<char> st;
        for (int j = 0; j < n; j++) {
            if (j != i) st.insert(s[j]);
        }
        if (st.size() == 26) ans = min(ans, n -

import sys

mod = 998244353

n = int(input()) // 2
res = 7
p2 = 8
num = 1
den = 2
for i in range(1, n):
    res *= 9
    if i > 1:
        inc = p2
        inc *= num
        inc %= mod
        inc *= pow(den, mod - 2, mod)
        inc %= mod
        res += inc
    res %= mod
    p2 = (p2 * 2) % mod
    k = i
    num *= 2 * k
    num %= mod
    num *= 2 * k + 1
    num %= mod
    if k > 1:
        den *= k - 1
    den %= mod
    den *= k + 2
    den %= mod
print(res)



# 总结

python 代码比 java 代码短很多，但是 java 代码的运行速度比 python 代码快很多。

# 参考资料

[Codeforces Round #599 (Div. 2) - C. Yet Another Division Into Teams](https://codeforces.com/contest/1249/problem/C)

* any list
{:toc}/_posts/2018-09-22-java-asm-03-class-structure.md
---
layout: post
title:  Java ASM-03-Class Structure
date:  2018-09-22 14:35:23 +0800
categories: [Java]
tags: [java, asm, sh]
published: true
---

# Class Structure
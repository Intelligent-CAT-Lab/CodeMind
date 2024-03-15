import sys

n = int(input())
if n == 2:
    print(-1)
    sys.exit()

for i in range(n):
    for j in range(n - 1):
        if i == j:
            print(n, end=' ')
        else:
            print(j + 1, end=' ')
    print()



# 总结

python 代码比 java 代码短很多，但是 java 代码的可读性更好。

# 参考资料

[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)


# 参考资料

[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)

# 总结

python 代码比 java 代码短很多，但是 java 代码的可读性更好。

# 参考资料

[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)
/content/post/codeforces/1006D - I3Y3s Challenge.md
---
title: "1006D - I3Y3s Challenge"
date: 2019-03-03T10:00:00+08:00
draft: false
author: "caicai"
tags:
  - python
  - java
categories:
  - codeforces
---

# 题目

题目链接：[CF1006D - I3Y3s Challenge](https://codeforces.com/contest/1006/problem/D)

# 题意

给定一个长度为 $n$ 的字符串 $s$，$s$ 由 $n$ 个小写字母组成。

定义一个字符串 $t$ 是 $s$ 的一个子序列，当且仅当 $t$ 可以从 $s$ 中删除一些字符（可以不删除）后得到。

给定一个长度为 $n$ 的字符串 $t$，$t$ 由 $n$ 个小写字母组成。

求 $t$ 是 $s$ 的子序列的方案数。

# 题解
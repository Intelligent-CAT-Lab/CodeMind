
```
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
```

## 总结

python 代码比 java 代码短很多，但是 java 代码的运行速度比 python 快很多。

## 参考

[Codeforces Round #200 (Div. 2) - Problem D](http://codeforces.com/contest/342/problem/D)

[Codeforces Round #200 (Div. 2) - Problem D - 题解](http://blog.csdn.net/palayutm/article/details/46840089)

[Codeforces Round #200 (Div. 2) - Problem D - 题解](http://blog.csdn.net/palayutm/article/details/46840089)


## 参考

[Codeforces Round #200 (Div. 2) - Problem A](http://codeforces.com/contest/342/problem/A)

[Codeforces Round #200 (Div. 2) - Problem A - 题解](http://blog.csdn.net/palayutm/article/details/46839999)

[Codeforces Round #200 (Div. 2) - Problem A - 题解](http://blog.csdn.net/palayutm/article/details/46839999)

## 总结

python 代码比 java 代码短很多，但是 java 代码的运行速度比 python 快很多。

## 参考

[Codeforces Round #200 (Div. 2) - Problem A](http://codeforces.com/contest/342/problem/A)

[Codeforces Round #200 (Div. 2) - Problem A - 题解](http://blog.csdn.net/palayutm/article/details/46839999)

[Codeforces Round #200 (Div. 2) - Problem A - 题解](http://blog.csdn.net/palayutm/article/details/46839999)
/source/_posts/codeforces-342-A.md
---
title: Codeforces Round #200 (Div. 2) - Problem A
date: 2017-03-26 16:00:00
tags: [python, java, codeforces]
---

# Codeforces Round #200 (Div. 2) - Problem A

## 题目

[Codeforces Round #200 (Div. 2) - Problem A](http://codeforces.com/contest/342/problem/A)

## 题目大意

给定一个数组，数组中有 5 个 1， 10 个 2， 20 个 5， 50 个 10， 100 个 50， 200 个 100， 500 个 500， 1000 个 1000， 2000 个 2000， 5000 个 5000， 10000 个 10000， 20000 个 20000， 50000 个 50000， 100000 个 100000， 200000 个 200000， 500000 个 500000， 1000000 个 1000000， 2000000 个 2000000， 5000000 个 5000000， 10000000 个 10000000， 20000000 个 20000000， 50000000 个 50000000， 100000000 个 100000000， 200000000 个 200000000， 500000000 个 500000000， 1000000000 个 1000000000， 2000000000 个 2000000000， 5000000000 个 5000000000， 10000000000 个 10000000000， 20000000000 个 20000000000， 50000000000 个 50000000000， 100000000000 个 100000000000， 200000000000 个 200000000000， 500000000000 个 500000000000， 1000000000000 个 1000000000000， 2000000000000 个 2000000000000， 5000000000000 个 5000


```
import sys

MODULO = 1000000007

s = sys.stdin.readline().strip()
alternating = True
for i in range(len(s) - 1):
    if s[i] == s[i + 1]:
        alternating = False
if alternating:
    print(1)
    exit(0)

sum = [0] * (len(s) + 1)
for i in range(len(s)):
    sum[i + 1] = sum[i]
    if s[i] == 'a':
        sum[i + 1] += 1
    elif s[i] == 'b':
        sum[i + 1] += 2
    else:
        raise Exception()
    sum[i + 1] %= 3

next = [[len(s) + 1] * (len(s) + 2) for _ in range(3)]
for pos in range(len(s), -1, -1):
    for i in range(3):
        next[i][pos] = next[i][pos + 1]
    next[sum[pos]][pos] = pos

total = sum[len(s)]
ways = [0] * (len(s) + 2)
ways[0] = 1
for i in range(len(s) + 1):
    need = (sum[i] + 1) % 3
    ways[next[need][i]] += ways[i]
    ways[next[need][i]] %= MODULO
    need = (sum[i] + 2) % 3
    ways[next[need][i]] += ways[i]
    ways[next[need][i]] %= MODULO

res = 0
for i in range(1, len(s) + 1):
    if sum[i] == total:
        res = (res + ways[i]) % MODULO
print(res)

```

## 总结

这道题目是一道比较有意思的题目，主要是利用了题目中给出的性质，然后利用动态规划的思想，将问题分解为子问题，然后利用前缀和的思想，将问题进一步简化，最后利用python的list的特性，将问题简化为一个O(n)的算法。

## 参考资料

1. [Codeforces Round #510 (Div. 2) Problem E. Alternating Subsequence](https://codeforces.com/contest/1051/problem/E)
2. [Codeforces Round #510 (Div. 2) Problem E. Alternating Subsequence 题解](https://www.cnblogs.com/ECJTUACM-873284962/p/10486008.html)

## 参考资料

1. [Codeforces Round #510 (Div. 2) Problem C. Vasya and Book](https://codeforces.com/contest/1051/problem/C)
2. [Codeforces Round #510 (Div. 2) Problem C. Vasya and Book 题解](https://www.cnblogs.com/ECJTUACM-873284962/p/10485999.html)

## 日期

2018 年 10 月 23 日 —— 又是周二，好好休息
# Codeforces Round #510 (Div. 2) Problem C. Vasya and Book

Vasya has a book with n pages. He wants to read it.

Vasya can read 1 page in 1 minute. He can read the book in any order he wants.

Vasya has a special device that allows him to read the book in the following way:

1. Vasya chooses a page number i (1 ≤ i ≤ n).
2. Vasya reads all pages from 1 to i.
3. Vasya reads all pages from i to n.
4. Vasya reads all pages from n to i.
5. Vasya reads all pages from i to 1.
6. Vasya reads all pages from 1 to i.
7. Vasya reads all pages from i to n.
8. Vasya reads all pages from n to i.
9. Vasya reads all pages from i to 1.
10. Vasya reads all pages from 1 to i.
11. Vasya reads all pages from i to n.
12. Vasya reads all pages from n to i.
13. Vasya reads all pages from i to 1.
14. Vasya reads all pages from 1 to i.


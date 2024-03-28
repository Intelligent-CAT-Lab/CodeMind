

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    alternating = True
    for i in range(len(s) - 1):
        if s[i] == s[i + 1]:
            alternating = False
    if alternating:
        print(1)
        return
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

MODULO = 1000000007

if __name__ == '__main__':
    main()

```


```

python code:

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    b = list(map(int, sys.stdin.readline().split()))
    c = list(map(int, sys.stdin.readline().split()))
    d = list(map(int, sys.stdin.readline().split()))
    a.sort()
    b.sort()
    c.sort()
    d.sort()
    res = 0
    for i in range(n):
        for j in range(n):
            res += upper_bound(c, a[i] + b[j]) - lower_bound(c, a[i] + b[j])
    print(res)

def lower_bound(a, x):
    l = -1
    r = len(a)
    while r - l > 1:
        m = (l + r) // 2
        if a[m] >= x:
            r = m
        else:
            l = m
    return r

def upper_bound(a, x):
    l = -1
    r = len(a)
    while r - l > 1:
        m = (l + r) // 2
        if a[m] > x:
            r = m
        else:
            l = m
    return r

if __name__ == '__main__':
    main()

```
/source/_posts/2017-08-06-codeforces-round-401-div-2.md
---
layout: post
title: "Codeforces Round #401 (Div. 2)"
date: 2017-08-06 15:00:00 +0800
categories: Codeforces
---

[Codeforces Round #401 (Div. 2)](http://codeforces.com/contest/777)

A
---

### Problem

You are given a string s consisting of lowercase English letters.

You have to find the number of pairs of indices (i, j) (1 ≤ i < j ≤ |s|) such that the substring s[i...j] is a palindrome.

A palindrome is a string that reads the same from left to right and from right to left.

### Input

The first line contains a single integer n (1 ≤ n ≤ 100 000) — the length of the string s.

The second line contains the string s consisting of lowercase English letters.

### Output

Print a single integer — the number of pairs of indices (i, j) (1 

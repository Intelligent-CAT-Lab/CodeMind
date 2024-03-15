import sys

MODULO = int(1e9 + 7)

def main():
    zeroes, ones, k = map(int, sys.stdin.readline().split())
    depth = (zeroes + ones - 1) / (k - 1)
    ways = [0] * (ones + 1)
    ways[0] = 1
    res = 0
    nice = [False] * (ones + 1)
    for i in range(1, depth + 1):
        for extra in range(0, depth - i + 1):
            now = ones - extra * (k - 1)
            if now >= 0:
                nice[now] = True
        for old in range(ones, -1, -1):
            if ways[old] != 0:
                for cur in range(1, k):
                    if old + cur <= ones and nice[old + cur]:
                        res += ways[old]
                        if res >= MODULO:
                            res -= MODULO
                    if old + cur <= ones:
                        ways[old + cur] += ways[old]
                        if ways[old + cur] >= MODULO:
                            ways[old + cur] -= MODULO
    print(res)

if __name__ == '__main__':
    main()

 1000000007

def main():
    n = int(input())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    c = list(map(int, input().split()))
    d = list(map(int, input().split()))
    a.sort()
    b.sort()
    c.sort()
    d.sort()
    res = 0
    for i in range(n):
        for j in range(n):
            res += bisect_left(c, -a[i] - b[j]) * bisect_left(d, -a[i] - b[j])
    print(res)

if __name__ == '__main__':
    main()

/source/_posts/2017-08-13-codeforces-round-402-div-2.md
---
layout: post
title: Codeforces Round 402 (Div. 2)
date: 2017-08-13 15:00:00
categories:
- Codeforces
tags:
- Codeforces
- Divide and Conquer
- Binary Search
- Sorting
---

# A. Vanya and Fence

Time limit: 2000 ms

Memory limit: 256 mb
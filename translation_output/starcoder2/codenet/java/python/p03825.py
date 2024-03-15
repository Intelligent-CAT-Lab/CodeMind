
```
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
```
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
```
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

## Description

Vanya and his friends are walking along the fence of height h and they do not want the guard to notice them. In order to achieve this the height of each of the friends should not exceed h. If the height of some person is greater than h he can bend down and then he surely won't be noticed by the guard. The height of the i-th person is equal to ai.

Consider the width of the person walking as usual to be equal to 1, while the width of the bent person is equal to 2. Friends want to talk to each other while walking, so they would like to walk in a single row. What is the minimum width of the road, such that friends can walk in a row and remain unattended by the guard?

## Input

The first line of the input contains two integers n and h (1 ≤ n ≤ 1000, 1 ≤ h ≤ 1000) — the number of friends and the height of the fence, respectively.

The second line contains n integers ai (1 ≤ ai ≤ 2h), the i-th of them is equal to the height of the i-th person.

## Output

Print a single integer — the minimum possible valid width of the road.

## Examples

### input

```
4 7
7 7 7 7
```

### output

```
4
```

### input

```
4 7
7 7 8 7
```

### output

```
6
```

### input

```
5 4
1 1 1 1 1
```

### output

```
10
```

## Note

In the first sample all the friends are short enough and no one has to bend, so the width is equal to the number of the friends, that is 4.

In the second sample the first and the second friends have to bend in order to be able to pass through the fence. Thus, the width of the road is equal to 2 + 2 + 1 + 2 = 7.

In the third sample all the friends have to bend in order to pass through the fence.

# B. Vanya and Cubes

Time limit: 2000 ms

Memory limit: 256 mb

## Description

Vanya has n cubes, each cube has a number written on it; number ai is written on the i-th cube. Vanya wants to arrange all the cubes in a line so that each cube had a number written on it was strictly greater than the number written on it's left neighbour (if any). What is the minimum possible number of cubes that can stay at the end of the line?

## Input

The first line contains a single integer n (1 ≤ n ≤ 1000) — the number of cubes.

The second line contains n integers a1, a2, ..., an (1 ≤ ai ≤ 1


```python
n = int(input())
square = n * n
odd = []
even = []

for i in range(1, square + 1):
    if i % 2 == 0:
        even.append(i)
    else:
        odd.append(i)

loop = square // n
div = loop // 2

for i in range(1, loop + 1):
    for j in range(div):
        if i % 2 == 1:
            print(odd.pop(0), even.pop(), end=' ')
        else:
            print(even.pop(0), odd.pop(), end=' ')
    print()
```

## 334B - Eugeny and Play List

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[i:j + 1]))

print(ans)
```

## 334C - Xenia and Spies

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[i:j + 1]))

print(ans)
```

## 334D - Xenia and Weights

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[i:j + 1]))

print(ans)
```

## 334E - Xenia and Tree

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[i:j + 1]))

print(ans)
```
/source/_posts/2017-03-26-codeforces-round-399-div-2.md
---
title: Codeforces Round #399 (Div. 2)
date: 2017-03-26 16:00:00
tags:
- ACM
- Codeforces
- 题解
categories:
- 题解
---

## A. Mishka and Game

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[i:j + 1]))

print(ans)
```

## B. Mishka and Contest

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[i:j + 1]))

print(ans)
```

## C. Mishka and Permutations

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[i:j + 1]))

print(ans)
```

## D. Mishka and GCD

### 题目大意

给定一个长度为n的数组，求出一个长度为n的子数组，使得这个子数组的最大值和最小值的差值最小。

### 解题思路

直接暴力枚举，时间复杂度为O(n^2)。

### 代码

```python
n = int(input())
a = list(map(int, input().split()))

ans = 1000000000
for i in range(n):
    for j in range(i, n):
        ans = min(ans, max(a[i:j + 1]) - min(a[

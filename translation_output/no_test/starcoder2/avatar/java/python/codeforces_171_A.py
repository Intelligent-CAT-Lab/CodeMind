
```
a = int(input())
b = int(input())

def getNum(a, b):
    reverseB = 0
    while b > 0:
        reverseB = reverseB * 10 + b % 10
        b //= 10
    return a + reverseB

ans = getNum(a, b)
print(ans)
```

## 171B - New Year and Old Property

### 题目大意

给定一个数n，求出所有满足条件的数对(a, b)，使得a^b = n。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = log(n) / log(a)，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = math.log(n) / math.log(a)
    if b == int(b):
        ans += 1

print(ans)
```

## 171C - New Year and Ancient Prophecy

### 题目大意

给定一个数n，求出所有满足条件的数对(a, b)，使得a^b = n。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = log(n) / log(a)，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = math.log(n) / math.log(a)
    if b == int(b):
        ans += 1

print(ans)
```

## 171D - New Year and Arbitrary Arrangement

### 题目大意

给定一个数n，求出所有满足条件的数对(a, b)，使得a^b = n。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = log(n) / log(a)，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = math.log(n) / math.log(a)
    if b == int(b):
        ans += 1

print(ans)
```

## 171E - New Year and Cleaning

### 题目大意

给定一个数n，求出所有满足条件的数对(a, b)，使得a^b = n。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = log(n) / log(a)，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = math.log(n) / math.log(a)
    if b == int(b):
        ans += 1

print(ans)
```
/source/_posts/codeforces-round-466-div-2.md
---
title: Codeforces Round #466 (Div. 2)
date: 2018-09-16 16:00:00
tags:
- ACM
- Codeforces
- 题解
categories:
- 题解
---

## A - Vladik and Courtesy

### 题目大意

给定一个数n，问是否存在两个数a和b，使得a + b = n，且a和b的十进制表示中，奇数位上的数字之和等于偶数位上的数字之和。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = n - a，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = n - a
    if b == int(b):
        ans += 1

print(ans)
```

## B - Vladik and Favorite Game

### 题目大意

给定一个数n，问是否存在两个数a和b，使得a + b = n，且a和b的十进制表示中，奇数位上的数字之和等于偶数位上的数字之和。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = n - a，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = n - a
    if b == int(b):
        ans += 1

print(ans)
```

## C - Vladik and fractions

### 题目大意

给定一个数n，问是否存在两个数a和b，使得a + b = n，且a和b的十进制表示中，奇数位上的数字之和等于偶数位上的数字之和。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = n - a，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = n - a
    if b == int(b):
        ans += 1

print(ans)
```

## D - Vladik and Memorable Trip

### 题目大意

给定一个数n，问是否存在两个数a和b，使得a + b = n，且a和b的十进制表示中，奇数位上的数字之和等于偶数位上的数字之和。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = n - a，如果b是整数，则满足条件。

### 代码

```
import math

n = int(input())

ans = 0
for a in range(1, 1000000001):
    b = n - a
    if b == int(b):
        ans += 1

print(ans)
```

## E - Vladik and Parties

### 题目大意

给定一个数n，问是否存在两个数a和b，使得a + b = n，且a和b的十进制表示中，奇数位上的数字之和等于偶数位上的数字之和。

### 解题思路

首先，我们可以知道，a和b的范围是[1, 10^9]，所以我们可以枚举a，然后计算b = n - a，如果



```python
n, m = map(int, input().split())
if n == 0:
    if m != 0:
        print("Impossible")
    else:
        print(0, 0)
elif m <= n:
    if m == 0:
        m = 1
    print(n, m + n - 1)
else:
    print(m, m + n - 1)
```

## 190B - Team

### 题目大意

给出n个学生的成绩，如果成绩大于等于5，则输出YES，否则输出NO。

### 解题思路

python代码：

```python
n = int(input())
a = list(map(int, input().split()))
for i in a:
    if i >= 5:
        print("YES")
    else:
        print("NO")
```

## 190C - Lucky Sum of Digits

### 题目大意

给出一个数字，求出一个数字，使得这个数字的各位数字之和等于给出的数字，且这个数字的各位数字只有4和7。

### 解题思路

python代码：

```python
n = int(input())
if n == 0:
    print(0)
else:
    print(4 * (n // 2) + 7 * (n % 2))
```

## 190D - Lucky Permutation

### 题目大意

给出一个数字n，求出一个1到n的排列，使得这个排列的逆序对的个数为奇数。

### 解题思路

python代码：

```python
n = int(input())
if n % 2 == 0:
    print(-1)
else:
    for i in range(1, n + 1):
        print(i + 1 if i % 2 == 0 else i - 1)
```

## 190E - Lucky Queries

### 题目大意

给出一个数字n，求出一个1到n的排列，使得这个排列的逆序对的个数为奇数。

### 解题思路

python代码：

```python
n = int(input())
if n % 2 == 0:
    print(-1)
else:
    for i in range(1, n + 1):
        print(i + 1 if i % 2 == 0 else i - 1)
```

## 190F - Lucky Tree

### 题目大意

给出一棵树，求出树上所有节点的权值和。

### 解题思路

python代码：

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n - 1):
    x, y = map(int, input().split())
print(sum(a))
```

## 190G - Lucky Graph

### 题目大意

给出一个数字n，求出一个n个节点的图，使得这个图的边数为n-1，且这个图的边权和为n。

### 解题思路

python代码：

```python
n = int(input())
for i in range(1, n):
    print(i, i + 1, 1)
print(1, n, n)
```

## 190H - Lucky Tree 2

### 题目大意

给出一棵树，求出树上所有节点的权值和。

### 解题思路

python代码：

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n - 1):
    x, y = map(int, input().split())
print(sum(a))
```

## 190I - Lucky Tree 3

### 题目大意

给出一棵树，求出树上所有节点的权值和。

### 解题思路

python代码：

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n - 1):
    x, y = map(int, input().split())
print(sum(a))
```

## 190J - Lucky Tree 4

### 题目大意

给出一棵树，求出树上所有节点的权值和。

### 解题思路

python代码：

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n - 1):
    x, y = map(int, input().split())
print(sum(a))
```

## 190K - Lucky Tree 5

### 题目大意

给出一棵树，求出树上所有节点的权值和。

### 解题思路

python代码：

```python
n = int(input())
a = list(map(int, input().split()))
for i in range(n - 1):
    x, y = map(int, input().split())
print(sum(a))
```
/source/_posts/2018-08-01-codeforces-round-474-div-2.md
---
title: Codeforces Round #474 (Div. 2)
date: 2018-08-01 15:00:00
tags:
- ACM
- Codeforces
- 题解
categories:
- 题解
---

# A. Beautiful Matrix

## 题目大意

给出一个5*5的矩阵，其中只有一个数字为1，其余数字均为0，求出将这个1移动到中心位置需要移动的步数。

## 解题思路

python代码：

```python
for i in range(5):
    a = list(map(int, input().split()))
    if 1 in a:
        print(abs(i - 2) + abs(a.index(1) - 2))
        break
```

# B. Vanya and Cubes

## 题目大意

给出一个数字n，求出一个数字x，使得1+2+3+...+x>=n，且x最小。

## 解题思路

python代码：

```python
n = int(input())
x = 0
s = 0
while s < n:
    x += 1
    s += x
print(x)
```

# C. Vanya and Table

## 题目大意

给出一个数字n，求出一个数字x，使得1+2+3+...+x>=n，且x最小。

## 解题思路

python代码：

```python
n = int(input())
x = 0
s = 0
while s < n:
    x += 1
    s += x
print(x)
```

# D. Vanya and Scales

## 题目大意

给出一个数字n，求出一个数字x，使得1+2+3+...+x>=n，且x最小。

## 解题思路

python代码：

```python
n = int(input())
x = 0
s = 

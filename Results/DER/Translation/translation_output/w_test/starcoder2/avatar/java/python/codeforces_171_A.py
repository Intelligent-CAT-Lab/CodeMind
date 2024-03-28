

```python
a, b = map(int, input().split())
b = int(str(b)[::-1])
print(a + b)
```

## 171B

### 题目描述

You are given a sequence of n integers a1, a2, ..., an. Your task is to find the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 输入格式

The first line contains integer n (1 ≤ n ≤ 100). The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100).

### 输出格式

Print the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
2
```

### 题目分析

```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 2013 == 0:
            ans += 1
print(ans)
```

## 171C

### 题目描述

You are given a sequence of n integers a1, a2, ..., an. Your task is to find the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 输入格式

The first line contains integer n (1 ≤ n ≤ 100). The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100).

### 输出格式

Print the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
2
```

### 题目分析

```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 2013 == 0:
            ans += 1
print(ans)
```

## 171D

### 题目描述

You are given a sequence of n integers a1, a2, ..., an. Your task is to find the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 输入格式

The first line contains integer n (1 ≤ n ≤ 100). The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100).

### 输出格式

Print the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
2
```

### 题目分析

```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 2013 == 0:
            ans += 1
print(ans)
```

## 171E

### 题目描述

You are given a sequence of n integers a1, a2, ..., an. Your task is to find the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 输入格式

The first line contains integer n (1 ≤ n ≤ 100). The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100).

### 输出格式

Print the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
2
```

### 题目分析

```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 2013 == 0:
            ans += 1
print(ans)
```

## 171F

### 题目描述

You are given a sequence of n integers a1, a2, ..., an. Your task is to find the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 输入格式

The first line contains integer n (1 ≤ n ≤ 100). The second line contains n integers a1, a2, ..., an (0 ≤ ai ≤ 100).

### 输出格式

Print the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
2
```

### 题目分析

```python
n = int(input())
a = list(map(int, input().split()))
ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if (a[i] + a[j]) % 2013 == 0:
            ans += 1
print(ans)
```


### 题目描述

You are given a sequence of n integers a1, a2, ..., an. Your task is to find the number of pairs of elements (ai, aj) (i < j) such that ai + aj is divisible by 2013.

### 输入格式

The first line contains integer n (1 

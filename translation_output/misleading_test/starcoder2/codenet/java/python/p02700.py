

```python
import sys

a, b, c, d = map(int, sys.stdin.readline().split())

t = c // b
tt = c % b
y = a // d
u = a % d
while a >= 0 or c >= 0:
    c = c - b
    if c <= 0:
        print("Yes")
        break
    a = a - d
    if a <= 0:
        print("No")
        break
```

## 2701

### 题目

题目描述

给定一个长度为n的整数序列，求其中最长的严格上升子序列的长度。

输入

第一行包含一个整数n。

第二行包含n个整数，表示整数序列。

输出

输出一个整数，表示最长严格上升子序列的长度。

样例输入

```
7
3 1 2 1 8 5 6
```

样例输出

```
4
```

数据规模与约定

对于20%的数据，n <= 10；

对于50%的数据，n <= 1000；

对于100%的数据，n <= 100000。

### 题解

```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

dp = [1] * n
for i in range(n):
    for j in range(i):
        if a[i] > a[j]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))
```

## 2702

### 题目

题目描述

给定一个长度为n的整数序列，求其中最长的严格上升子序列的长度。

输入

第一行包含一个整数n。

第二行包含n个整数，表示整数序列。

输出

输出一个整数，表示最长严格上升子序列的长度。

样例输入

```
7
3 1 2 1 8 5 6
```

样例输出

```
4
```

数据规模与约定

对于20%的数据，n <= 10；

对于50%的数据，n <= 1000；

对于100%的数据，n <= 100000。

### 题解

```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

dp = [1] * n
for i in range(n):
    for j in range(i):
        if a[i] > a[j]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))
```

## 2703

### 题目

题目描述

给定一个长度为n的整数序列，求其中最长的严格上升子序列的长度。

输入

第一行包含一个整数n。

第二行包含n个整数，表示整数序列。

输出

输出一个整数，表示最长严格上升子序列的长度。

样例输入

```
7
3 1 2 1 8 5 6
```

样例输出

```
4
```

数据规模与约定

对于20%的数据，n <= 10；

对于50%的数据，n <= 1000；

对于100%的数据，n <= 100000。

### 题解

```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

dp = [1] * n
for i in range(n):
    for j in range(i):
        if a[i] > a[j]:
            dp[i] = max(dp[i], dp[j] + 1)

print(max(dp))
```

## 2704

### 题目

题目描述

给定一个长度为n的整数序列，求其中最长的严格上升子序列的长度。

输入

第一行包含一个整数n。

第二行包含n个整数，表示整数序列。

输出

输出一个整数，表示最长严格上升子序列的长度。

样例输入

```
7
3 1 2 

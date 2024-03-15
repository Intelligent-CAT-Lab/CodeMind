
```
low = 1
high = 3 ** 32
n = int(input())

def dfs(pos, pace):
    if pos > n:
        return 0
    # 3.0X
    if pace < high:
        npace = 3 * pace
        npos = pos + npace
        if npos == n and (npace == 1 or npace == 3):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    # 1.0X
    npace = pace
    npos = npace + pos
    if npos == n and (npace == 1 or npace == 3):
        return 1
    else:
        temp = dfs(npos, npace)
        if temp != 0:
            return 1 + temp
    # 0.3X
    if pace > low:
        npace = pace // 3
        npos = pos + npace
        if npos == n and (npace == 3 or npace == 1):
            return 1
        else:
            temp = dfs(npos, npace)
            if temp != 0:
                return 1 + temp
    return 0

ans = -1 if n == 0 else dfs(1, 1)
print(ans + 1)
```

## 1000. 3n + 1

### 题目描述

3n + 1问题是指对于任意一个正整数，如果它是奇数，则对它乘3后加1，如果它是偶数，则对它除以2；经过若干次后，这个数变成了1。比如，对于数字3，经过2次操作之后得到1。

3n + 1问题的本质是考察数字规律，并没有固定的算法。

### 输入格式

输入包含多组数据，每组数据包含一个正整数n（1≤n≤1000000）。

### 输出格式

对应每一组数据，输出执行最少的操作次数，每个结果占一行。

### 样例输入

```
3
10
```

### 样例输出

```
2
6
```

### 题解

```python
while True:
    try:
        n = int(input())
        ans = 0
        while n != 1:
            if n % 2 == 0:
                n //= 2
            else:
                n = 3 * n + 1
            ans += 1
        print(ans)
    except:
        break
```

## 1001. 3n + 1 (2)

### 题目描述

3n + 1问题是指对于任意一个正整数，如果它是奇数，则对它乘3后加1，如果它是偶数，则对它除以2；经过若干次后，这个数变成了1。比如，对于数字3，经过2次操作之后得到1。

3n + 1问题的本质是考察数字规律，并没有固定的算法。

### 输入格式

输入包含多组数据，每组数据包含两个正整数a和b（1≤a≤b≤1000000）。

### 输出格式

对应每一组数据，输出执行最少的操作次数，每个结果占一行。

### 样例输入

```
3 10
```

### 样例输出

```
2
```

### 题解

```python
while True:
    try:
        a, b = map(int, input().split())
        ans = 0
        for i in range(a, b + 1):
            temp = 0
            while i != 1:
                if i % 2 == 0:
                    i //= 2
                else:
                    i = 3 * i + 1
                temp += 1
            ans = max(ans, temp)
        print(ans)
    except:
        break
```

## 1002. 3n + 1 (3)

### 题目描述

3n + 1问题是指对于任意一个正整数，如果它是奇数，则对它乘3后加1，如果它是偶数，则对它除以2；经过若干次后，这个数变成了1。比如，对于数字3，经过2次操作之后得到1。

3n + 1问题的本质是考察数字规律，并没有固定的算法。

### 输入格式

输入包含多组数据，每组数据包含两个正整数a和b（1≤a≤b≤1000000）。

### 输出格式

对应每一组数据，输出执行最少的操作次数，每个结果占一行。

### 样例输入

```
3 10
```

### 样例输出

```
2
```

### 题解

```python
while True:
    try:
        a, b = map(int, input().split())
        ans = 0
        for i in range(a, b + 1):
            temp = 0
            while i != 1:
                if i % 2 == 0:
                    i //= 2
                else:
                    i = 3 * i + 1
                temp += 1
            ans = max(ans, temp)
        print(ans)
    except:
        break
```

## 1003. 3n + 1 (4)

### 题目描述

3n + 1问题是指对于任意一个正整数，如果它是奇数，则对它乘3后加1，如果它是偶数，则对它除以2；经过若干次后，这个数变成了1。比如，对于数字3，经过2次操作之后得到1。

3n + 1问题的本质是考察数字规律，并没有固定的算法。

### 输入格式

输入包含多组数据，每组数据包含两个正整数a和b（1≤a≤b≤1000000）。

### 输出格式

对应每一组数据，输出执行最少的操作次数，每个结果占一行。

### 样例输入

```
3 10
```

### 样例输出

```
2
```

### 题解

```python
while True:
    try:
        a, b = map(int, input().split())
        ans = 0
        for i in range(a, b + 1):
            temp = 0
            while

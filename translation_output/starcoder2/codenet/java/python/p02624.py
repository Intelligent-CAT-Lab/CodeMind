
```python
import sys

def main():
    LIMIT = 1000 * 10000 + 10
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    res = 0
    n = int(input())
    for i in range(1, n + 1):
        res += i * div[i]
    print(res)

if __name__ == '__main__':
    main()
```

## 02625 - 1000000007

### 题目描述

给定一个数n，求1到n的数中，有多少个数的约数个数是奇数个。

### 输入格式

一行一个整数n。

### 输出格式

一行一个整数，表示答案。

### 样例输入

```
10
```

### 样例输出

```
4
```

### 样例解释

1, 3, 5, 7, 9

### 数据范围

对于100%的数据，1≤n≤10^18。

### 题解

```python
import sys

def main():
    LIMIT = 1000 * 10000 + 10
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    res = 0
    n = int(input())
    for i in range(1, n + 1):
        if div[i] % 2 == 1:
            res += 1
    print(res)

if __name__ == '__main__':
    main()
```

## 02626 - 1000000007

### 题目描述

给定一个数n，求1到n的数中，有多少个数的约数个数是偶数个。

### 输入格式

一行一个整数n。

### 输出格式

一行一个整数，表示答案。

### 样例输入

```
10
```

### 样例输出

```
6
```

### 样例解释

2, 4, 6, 8, 10, 12

### 数据范围

对于100%的数据，1≤n≤10^18。

### 题解

```python
import sys

def main():
    LIMIT = 1000 * 10000 + 10
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    res = 0
    n = int(input())
    for i in range(1, n + 1):
        if div[i] % 2 == 0:
            res += 1
    print(res)

if __name__ == '__main__':
    main()
```

## 02627 - 1000000007

### 题目描述

给定一个数n，求1到n的数中，有多少个数的约数个数是质数个。

### 输入格式

一行一个整数n。

### 输出格式

一行一个整数，表示答案。

### 样例输入

```
10
```

### 样例输出

```
2
```

### 样例解释

1, 9

### 数据范围

对于100%的数据，1≤n≤10^18。

### 题解

```python
import sys

def main():
    LIMIT = 1000 * 10000 + 10
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    res = 0
    n = int(input())
    for i in range(1, n + 1):
        if div[i] == 2 or div[i] == 3:
            res += 1
    print(res)

if __name__ == '__main__':
    main()
```

## 02628 - 1000000007

### 题目描述

给定一个数n，求1到n的数中，有多少个数的约数个数是合数个。

### 输入格式

一行一个整数n。

### 输出格式

一行一个整数，表示答案。

### 样例输入

```
10
```

### 样例输出

```
8
```

### 样例解释

2, 3, 4, 5, 6, 7, 8, 10

### 数据范围

对于100%的数据，1≤n≤10^18。

### 题解

```python
import sys

def main():
    LIMIT = 1000 * 10000 + 10
    div = [1] * LIMIT
    for i in range(2, LIMIT):
        for j in range(i, LIMIT, i):
            div[j] += 1

    res = 0
    n = int(input())
    for i in range(1

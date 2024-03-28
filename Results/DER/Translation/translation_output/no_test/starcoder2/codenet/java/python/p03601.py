
```
a, b, c, d, e, f = map(int, input().split())

waterX = 0
ansWater = 100
ansSugar = 0
while 100 * a * waterX <= f:
    waterY = 0
    while 100 * a * waterX + 100 * b * waterY <= f:
        water = 100 * a * waterX + 100 * b * waterY
        sugarX = 0
        while water + c * sugarX <= f:
            sugarY = 0
            while water + c * sugarX + d * sugarY <= f:
                sugar = c * sugarX + d * sugarY
                if sugar * (100 + e) <= e * (water + sugar):
                    if sugar * (ansWater + ansSugar) >= ansSugar * (water + sugar):
                        ansWater = water
                        ansSugar = sugar
                sugarY += 1
            sugarX += 1
        waterY += 1
    waterX += 1

print(ansWater + ansSugar, ansSugar)
```

## 03602 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例输入

```
10
```

### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1≤n≤1000000。

### 题解

```
n! = 1 * 2 * 3 * ... * n
n! mod 1000000007 = (1 * 2 * 3 * ... * n) mod 1000000007
```

### 代码

```
n = int(input())

ans = 1
for i in range(1, n + 1):
    ans *= i
    ans %= 1000000007

print(ans)
```

## 03603 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例输入

```
10
```

### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1≤n≤1000000。

### 题解

```
n! = 1 * 2 * 3 * ... * n
n! mod 1000000007 = (1 * 2 * 3 * ... * n) mod 1000000007
```

### 代码

```
n = int(input())

ans = 1
for i in range(1, n + 1):
    ans *= i
    ans %= 1000000007

print(ans)
```

## 03604 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例输入

```
10
```

### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1≤n≤1000000。

### 题解

```
n! = 1 * 2 * 3 * ... * n
n! mod 1000000007 = (1 * 2 * 3 * ... * n) mod 1000000007
```

### 代码

```
n = int(input())

ans = 1
for i in range(1, n + 1):
    ans *= i
    ans %= 1000000007

print(ans)
```

## 03605 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例输入

```
10
```

### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1≤n≤1000000。

### 题解

```
n! = 1 * 2 * 3 * ... * n
n! mod 1000000007 = (1 * 2 * 3 * ... * n) mod 1000000007
```

### 代码

```
n = int(input())

ans = 1
for i in range(1, n + 1):
    ans *= i
    ans %= 1000000007

print(ans)
```

## 03606 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例输入

```
10
```

### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1≤n≤1000000。

### 题解

```
n! = 1 * 2 * 3 * ... * n
n! mod 10

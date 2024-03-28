
```
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    t = c // b
    tt = c % b
    y = a // d
    u = a % d
    while a >= 0 or c >= 0:
        c = c - b
        if c <= 0:
            print("Yes")
            return
        a = a - d
        if a <= 0:
            print("No")
            return

if __name__ == '__main__':
    main()
```

## 2701

### 题目描述

给定一个长度为n的数组，求出数组中所有元素的和。

### 输入格式

第一行包含一个整数n。

接下来n行，每行包含一个整数，表示数组中的一个元素。

### 输出格式

输出一个整数，表示数组元素的和。

### 数据范围

1≤n≤100000,
−100000≤数组元素≤100000

### 输入样例：

```
4
7
-3
5
2
```

### 输出样例：

```
11
```

### 题解

```
import sys

def main():
    n = int(sys.stdin.readline())
    sum = 0
    for i in range(n):
        sum += int(sys.stdin.readline())
    print(sum)

if __name__ == '__main__':
    main()
```

## 2702

### 题目描述

给定一个长度为n的整数数列，数列中有正数也有负数。

请你求出数列中的一个连续子序列，使得该连续子序列的和最大。

输出这个最大和。

### 输入格式

第一行包含一个整数n。

第二行包含n个整数（有正有负），表示整数数列。

### 输出格式

输出一个整数，表示数列的最大和。

### 数据范围

1≤n≤100000,
−10000≤数列中元素的值≤10000

### 输入样例：

```
7
2 -1 3 -5 3 2 -1
```

### 输出样例：

```
7
```

### 题解

```
import sys

def main():
    n = int(sys.stdin.readline())
    nums = list(map(int, sys.stdin.readline().split()))
    max_sum = nums[0]
    sum = 0
    for i in range(n):
        sum += nums[i]
        if sum > max_sum:
            max_sum = sum
        if sum < 0:
            sum = 0
    print(max_sum)

if __name__ == '__main__':
    main()
```

## 2703

### 题目描述

给定一个长度为n的整数数列，数列中有正数也有负数。

请你求出数列的一个非空连续子序列，使得该连续子序列的和最大。

输出这个最大和。

### 输入格式

第一行包含一个整数n。

第二行包含n个整数（有正有负），表示整数数列。

### 输出格式

输出一个整数，表示数列的最大和。

### 数据范围

1≤n≤100000,
−10000≤数列中元素的值≤10000

### 输入样例：

```
7
2 -1 3 -5 3 2 -1
```

### 输出样例：

```
7
```

### 题解

```
import sys

def main():
    n = int(sys.stdin.readline())
    nums = list(map(int, sys.stdin.readline().split()))
    max_sum = nums[0]
    sum = 0
    for i in range(n):
        sum += nums[i]
        if sum > max_sum:
            max_sum = sum
        if sum < 0:
            sum = 0
    print(max_sum)

if __name__ == '__main__':
    main()
```

## 2704

### 题目描述

给定一个长度为n的整数数列，数列中有正数也有负数。

请你求出数列的一个非空连续子序列，使得该连续子序列的和最大。

输出这个最大和。

### 输入格式

第一行包含一个整数n。

第二行包含n个整数（有正有负），

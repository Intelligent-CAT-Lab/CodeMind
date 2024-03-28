
```
import sys

n, m = map(int, sys.stdin.readline().split())

if n % 2 == 0:
    print(0, end='')
    for i in range(1, n // 2 + 1):
        print(' 0', end='')
    for i in range(n // 2 + 1, n):
        print(' {}'.format(m), end='')
else:
    print(0, end='')
    for i in range(1, n // 2 + 1):
        print(' 0', end='')
    for i in range(n // 2 + 1, n):
        print(' {}'.format(m), end='')
print()
```

## 1854. 
### 题目描述

给定一个长度为n的数组，求出数组中第k小的数。

### 输入格式

第一行包含两个整数n和k。

第二行包含n个整数，表示数组中的数。

### 输出格式

输出一个整数，表示数组中第k小的数。

### 数据范围

1≤n≤105,
1≤k≤n,
−109≤数组中的数≤109

### 输入样例：

```
5 3
2 4 1 5 3
```

### 输出样例：

```
3
```

### 题解

```python
import sys

n, k = map(int, sys.stdin.readline().split())

nums = list(map(int, sys.stdin.readline().split()))

nums.sort()

print(nums[k - 1])
```

## 1855. 
### 题目描述

给定一个长度为n的整数数列，请你求出数列的最小公倍数。

### 输入格式

第一行包含整数n。

第二行包含n个整数，表示整个数列。

### 输出格式

输出一个整数，表示数列的最小公倍数。

### 数据范围

1≤n≤1000,
1≤数列中的数≤1000

### 输入样例：

```
6
5 1 2 3 4 5
```

### 输出样例：

```
60
```

### 题解

```python
import sys

n = int(sys.stdin.readline())

nums = list(map(int, sys.stdin.readline().split()))

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

def lcm(a, b):
    return a * b // gcd(a, b)

ans = nums[0]
for i in range(1, n):
    ans = lcm(ans, nums[i])

print(ans)
```

## 1856. 
### 题目描述

给定一个长度为n的整数数列，请你求出数列中的最大斐波那契数。

斐波那契数列的定义如下：

F1=1,F2=1,F3=2,F4=3,F5=5,F6=8,F7=13,F8=21,F9=34,F10=55,F11=89,F12=144,F13=233,F14=377,F15=610,F16=987,F17=1597,F18=2584,F19=4181,F20=6765,F21=10946,F22=17711,F23=28657,F24=46368,F25=75025,F26=121393,F27=196418,F28=317811,F29=514229,F30=832040,F31=1346269,F32=2178309,F33=3524578,F34=5702887,F35=9227465,F36=14930352,F37=24157817,F38=39088169,F39=63245986,F40=102334155,F41=16

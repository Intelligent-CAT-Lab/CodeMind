

```python
s = input()
co = [[0 for i in range(101)] for j in range(2)]
x = 0
y = 0
k = 0
co[0][k] = x
co[1][k] = y
k += 1
for i in range(len(s)):
    if s[i] == 'L':
        x -= 1
    elif s[i] == 'R':
        x += 1
    elif s[i] == 'U':
        y += 1
    else:
        y -= 1
    co[0][k] = x
    co[1][k] = y
    k += 1
flag = True
for i in range(k - 3):
    for j in range(i + 3, k):
        dx = co[0][i] - co[0][j]
        dy = co[1][i] - co[1][j]
        if dx < 0:
            dx *= (-1)
        if dy < 0:
            dy *= (-1)
        if (dx <= 1 and dy == 0) or (dy <= 1 and dx == 0):
            flag = False
            break
    if not flag:
        break
if flag:
    print("OK")
else:
    print("BUG")
```

## 9. 1005. 数组元素循环右移问题

### 题目描述

有一个整数val和一个数组a，请设计一个复杂度为O(n)的算法，将数组a循环右移k个位置，即将a中的最后k个数移动到数组的最前面。

### 输入描述

输入有两行，第一行包含一个整数n和一个整数k，分别表示数组长度和需要移动的位置。第二行包含n个整数，表示数组内的数。

### 输出描述

输出有一行，包含n个整数，表示右移k个位置后的数组。

### 样例输入

```
5 2
1 2 3 4 5
```

### 样例输出

```
4 5 1 2 3
```

### 思路

1. 先将数组的前n-k个元素逆序
2. 再将数组的后k个元素逆序
3. 最后将整个数组逆序

### 代码

```python
n, k = map(int, input().split())
a = list(map(int, input().split()))

def reverse(a, start, end):
    while start < end:
        a[start], a[end] = a[end], a[start]
        start += 1
        end -= 1

reverse(a, 0, n - k - 1)
reverse(a, n - k, n - 1)
reverse(a, 0, n - 1)

print(' '.join(map(str, a)))
```

## 10. 1006. 素数对

### 题目描述

给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。如，输入为10, 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）

### 输入描述

输入包括一个整数n,(3 ≤ n < 1000)

### 输出描述

输出对数

### 样例输入

```
10
```

### 样例输出

```
2
```

### 思路

1. 先判断输入的数是否为素数
2. 再判断输入的数减去素数是否为素数

### 代码

```python
n = int(input())

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

count = 0
for i in range(2, n // 2 + 1):
    if is_prime(i) and is_prime(n - i):
        count += 1
print(count)
```

## 11. 1007. 等差数列

### 题目描述

如果一个数列S满足对于所有的合法的i,都有S[i + 1] = S[i] + d, 这里的d也可以是负数和零,我们就称数列S为等差数列。

小易现在有一个长度为n的数列x,小易想把x变为一个等差数列。小易允许在数列上做交换任意两个位置的数值的操作,并且交换操作允许交换多次。但是有些数列通过交换还是不能变成等差数列,小易需要判别一个数列是否能通过交换操作变成等差数列

### 输入描述

输入包括两行,第一行包含整数n(2 ≤ n ≤ 50),即数列的长度。
第二行n个元素x[i](0 ≤ x[i] ≤ 1000),即数列中的每个整数。

### 输出描述

如果可以变成等差数列输出"Possible",否则输出"Impossible"。

### 样例输入

```
3
3 1 2
```

### 样例输出

```
Possible
```

### 思路

1. 先将数组排序
2. 再判断数组是否为等差数列

### 代码

```python
n = int(input())
x = list(map(int, input().split()))
x.sort()
d = x[1] - x[0]
for i in range(1, n):
    if x[i] - x[i - 1] != d:
        print("Impossible")
        break
else:
    print("Possible")
```

## 12. 1008. 合并表记录

### 题目描述

数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。

### 输入描述

先输入键值对的个数
然后输入成对的index和value值，以空格隔开

### 输出描述

输出合并后的键值对（多行）

### 样例输入

```
4
0 1
0 2
1 2
3 4
```

### 样

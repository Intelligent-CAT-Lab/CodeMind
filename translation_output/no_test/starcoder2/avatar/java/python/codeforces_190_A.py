
```
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

## 191A - Helpful Maths

### 题目大意

给出一个字符串，里面有加号和数字，将字符串里面的数字从小到大排序，输出排序后的字符串。

### 解题思路

将字符串里面的数字提取出来，排序后再拼接成字符串。

### 代码

```
s = input()
s = s.replace('+', ' ')
s = s.split()
s = sorted(s)
print('+'.join(s))
```

## 191B - Next Test

### 题目大意

给出一个数组，求出数组中第一个不连续的数字的下标。

### 解题思路

遍历数组，如果当前数字和下标不相等，则输出下标。

### 代码

```
n = int(input())
a = list(map(int, input().split()))
for i in range(n):
    if a[i] != i + 1:
        print(i + 1)
        break
```

## 192A - Funky Numbers

### 题目大意

给出一个数字，求出是否存在两个数字，它们的和等于给出的数字，并且这两个数字的乘积是完全平方数。

### 解题思路

遍历1到给出的数字，如果当前数字是完全平方数，则判断给出的数字减去当前数字是否是完全平方数。

### 代码

```
n = int(input())
for i in range(1, n + 1):
    if int(i ** 0.5) ** 2 == i:
        if int((n - i) ** 0.5) ** 2 == n - i:
            print("YES")
            break
else:
    print("NO")
```

## 193A - Cutting Figure

### 题目大意

给出一个矩形，矩形的长和宽都为偶数，将矩形切成4个正方形，求出切割的方案数。

### 解题思路

如果矩形的长和宽相等，则切割方案数为1，否则切割方案数为2。

### 代码

```
a, b = map(int, input().split())
if a == b:
    print(1)
else:
    print(2)
```

## 194A - Exams

### 题目大意

给出一个数字n，求出有多少种方案，可以将n分解成两个数字的和，并且这两个数字的乘积是完全平方数。

### 解题思路

遍历1到n，如果当前数字是完全平方数，则判断n减去当前数字是否是完全平方数。

### 代码

```
n = int(input())
cnt = 0
for i in range(1, n + 1):
    if int(i ** 0.5) ** 2 == i:
        if int((n - i) ** 0.5) ** 2 == n - i:
            cnt += 1
print(cnt)
```

## 195A - Stones on the Table

### 题目大意

给出一个字符串，字符串里面有若干个字母，求出最少需要删除多少个字母，才能使得字符串里面没有相邻的相同字母。

### 解题思路

遍历字符串，如果当前字母和前一个字母相同，则删除当前字母。

### 代码

```
n = int(input())
s = input()
cnt = 0
for i in range(1, n):
    if s[i] == s[i - 1]:
        cnt += 1
print(cnt)
```

## 196A - Vasya and Digital Root

### 题目大意

给出一个数字，求出最少需要删除多少个数字，才能使得剩下的数字的数根是1。

### 解题思路

数根是将数字的各个位数相加，如果和大于9，则继续相加，直到和小于等于9。

### 代码

```
n = input()
while True:
    s = 0
    for i in n:
        s += int(i)
    if s <= 9:
        break
    n = str(s)
if s == 1:
    print(0)
else:
    print(len(n) - 1)
```

## 197A - Plate Game

### 题目大意

给出一个数字n，求出有多少种方案，可以将n分解成两个数字的和，并且这两个数字的和是完全平方数。

### 解题思路

遍历1到n，如果当前数字是完全平方数，则判断n减去当前数字是否是完全平方数。

### 代码

```
n = int(input())
cnt = 0
for i in range(1, n + 1):
    if int(i ** 0.5) ** 2 == i:
        if int((n - i) ** 0.5) ** 2 == n - i:
            cnt += 1
print(cnt)
```

## 198A - Hexadecimal's Numbers

### 题目大意

给出一个数字n，求出有多少种方案，可以将n分解成两个数字的和，并且这两个数字的和是16进制数。

### 解题思路

遍历1到n，如果当前数字是16进制数，则判断n减去当前数字是否是16进制数。

### 代码

```
n = int(input())
cnt = 0
for i in range(1, n + 1):
    if int(str(i), 16) == i:
        if int(str(n - i), 16) == n - i:
            cnt += 1
print(cnt)
```

## 199A - Hexadecimal's Numbers

### 题目大意

给出一个数字n，求出有多少种方案，可以将n分解成两个数字的和，并且这两个数字的和是16进制数。

### 解题思路

遍历1到n，如果当前数字是16进制数，则判断n减去当前数字是否是16进制数。

### 代码

```
n = int(input())
cnt = 0
for i in range(1, n + 1):
    if int(str(i), 16) == i:
        if int(str(n - i), 16) == n - i:
            cnt += 1
print(cnt)
```

## 200A - New Year Candles

### 题目大意

给出一个数字n，求出最少需要多少个蜡烛，才能使得蜡烛的个数是偶数。

### 解题思路

如果n是偶数，则输出n，否则输出n + 1。

### 代码

```
n = int(input())
if n % 2 == 0:
    print(n)
else:
    print(n + 1

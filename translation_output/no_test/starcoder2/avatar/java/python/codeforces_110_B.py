
```
n = int(input())

if n == 1:
    print('a')
elif n == 2:
    print('ab')
elif n == 3:
    print('abc')
else:
    for i in range(n // 4):
        print('abcd', end='')
    t = n % 4
    if t == 1:
        print('a')
    elif t == 2:
        print('ab')
    elif t == 3:
        print('abc')
```

## 111A. Petya and Strings

### 题目描述

Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

### 输入格式

Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

### 输出格式

If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

### 样例输入

```
aaaa
aaaA
```

### 样例输出

```
0
```

### 样例输入

```
abs
Abz
```

### 样例输出

```
-1
```

### 样例输入

```
abcdefg
AbCdEfF
```

### 样例输出

```
1
```

### 题解

```python
s1 = input().lower()
s2 = input().lower()

if s1 < s2:
    print('-1')
elif s1 > s2:
    print('1')
else:
    print('0')
```

## 112A. Petya and Strings

### 题目描述

Petya loves presents. His mum bought him two strings of the same size for his birthday. The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

### 输入格式

Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

### 输出格式

If the first string is less than the second one, print "-1". If the second string is less than the first one, print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration when the strings are compared.

### 样例输入

```
aaaa
aaaA
```

### 样例输出

```
0
```

### 样例输入

```
abs
Abz
```

### 样例输出

```
-1
```

### 样例输入

```
abcdefg
AbCdEfF
```

### 样例输出

```
1
```

### 题解

```python
s1 = input().lower()
s2 = input().lower()

if s1 < s2:
    print('-1')
elif s1 > s2:
    print('1')
else:
    print('0')
```

## 113A. Holes

### 题目描述

A hole is a pattern in the ground consisting of an empty space surrounded by solid ground. The figure below contains four holes of different sizes.

![img](https://cdn.luogu.com.cn/upload/vjudge_pic/CF113A/11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111

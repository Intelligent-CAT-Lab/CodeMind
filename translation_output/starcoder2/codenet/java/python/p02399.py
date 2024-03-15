
```
a, b = map(int, input().split())
d = a//b
r = a%b
f = a/b
print(d, r, f)
```

## 1008

### 题目描述

Read two double values of double precision, corresponding to two points in the plane. After this, calculate and show the distance between these two points. If the distance is greater than 1000, show the message `OUT OF RANGE` instead.

### 输入描述

The input file contains two lines of data. The first one contains two double values `x1` and `y1` and the second one also contains two double values with one digit after the decimal point.

### 输出描述

Calculate and print the distance value with 4 digits after the decimal point. If the distance value is greater than 1000, print the message `OUT OF RANGE` instead.

### 输入例子

```
1.0 7.0
5.0 9.0
```

### 输出例子

```
4.4721
```

### 题目分析

### 代码

```
x1, y1 = map(float, input().split())
x2, y2 = map(float, input().split())

distance = ((x1 - x2) ** 2 + (y1 - y2) ** 2) ** 0.5

if distance > 1000:
    print('OUT OF RANGE')
else:
    print(f'{distance:.4f}')
```

## 1010

### 题目描述

Read an integer `N` that is the number of test cases. Each test case is a line of input containing an integer `X` (1 ≤ `X` ≤ 1000) that represents the size of a group of students. Make a frequency table of your input data, like the one you would use to describe a frequency distribution in statistics.

### 输入描述

The first line of input has an integer `N`, that is the number of test cases. Each test case contains an integer `X` (1 ≤ `X` ≤ 1000).

### 输出描述

For each test case, print the frequency table for each `X` in the input.

### 输入例子

```
5
100
400
300
300
500
```

### 输出例子

```
100 : 1
400 : 1
300 : 2
500 : 1
```

### 题目分析

### 代码

```
n = int(input())

d = {}

for i in range(n):
    x = int(input())
    if x in d:
        d[x] += 1
    else:
        d[x] = 1

for k, v in d.items():
    print(f'{k} : {v}')
```

## 1011

### 题目描述

Read an integer `N` that is the number of test cases. Each test case is a line of input containing an integer `X` (1 ≤ `X` ≤ 1000) that represents the size of a group of students. Make a frequency table of your input data, like the one you would use to describe a frequency distribution in statistics.

### 输入描述

The first line of input has an integer `N`, that is the number of test cases. Each test case contains an integer `X` (1 ≤ `X` ≤ 1000).

### 输出描述

For each test case, print the frequency table for each `X` in the input.

### 输入例子

```
5
100
400
300
300
500
```

### 输出例子

```
100 : 1
400 : 1
300 : 2
500 : 1
```

### 题目分析

### 代码

```
n = int(input())

d = {}

for i in range(n):
    x = int(input())
    if x in d:
        d[x] += 1
    else:
        d[x] = 1

for k, v in d.items():
    print(f'{k} : {v}')
```

## 1012

### 题目描述

Read an integer `N` that is the number of test cases. Each test case is a line of input containing an integer `X` (1 ≤ `X` ≤ 1000) that represents the size of a group of students. Make a frequency table of your input data, like the one you would use to describe a frequency distribution in statistics.

### 输入描述

The first line of input has an integer `N`, that is the number of test cases. Each test case contains an integer `X` (1 ≤ `X` ≤ 1000).

### 输出描述

For each test case, print the frequency table for each `X` in the input.

### 输入例子

```
5
100
400
300
300
500
```

### 输出例子

```
100 : 1
400 : 1
300 : 2
500 : 1
```

### 题目分析

### 代码

```
n = int(input())

d = {}

for i in range(n):
    x = int(input())
    if x in d:
        d[x] += 1
    else:
        d[x] = 1

for k, v in d.items():
    print(f'{k} : {v}')
```

## 1013

### 题目描述

Read an integer `N` that is the number of test cases. Each test case is a line of input containing an integer `X` (1 ≤ `X` ≤ 1000) that represents the size of a group of students. Make a frequency table of your input data, like the one you would use to describe a frequency distribution in statistics.

### 输入描述

The first line of input has an integer `N`, that is the number of test cases. Each test case contains an integer `X` (1 ≤ `X` ≤ 1000).

### 输出描述

For each test case, print the frequency table for each `X` in the input.

### 输入例子

```
5
100
400
300
300
500
```

### 输出例子

```
100 : 1
400 : 1
300 : 2
500 : 1
```

### 题目分析

### 代码

```
n = int(input())

d = {}

for i in range(n):
    x = int(input())
    if x in d:
        d[x] += 1
    else:
        d[x] = 1

for k, v in d.items():
    print(f'{k} : {v}')
```

## 1014

### 题目描述

Read an integer `N` that is the number of test cases. Each test case is a line of input containing an integer `X` (1 ≤ `X` ≤ 1000) that represents the size of a group of students. Make a frequency table of your input data, like the one you would use to describe a frequency distribution in statistics.

### 输入描述

The first line of input has an integer `N`, that is the number of test cases. Each test case contains an integer `X` (1 ≤ `X` ≤ 1000).

### 输出描述

For each test case, print the frequency table for each `X` in the input.

### 输入例子

```
5
100

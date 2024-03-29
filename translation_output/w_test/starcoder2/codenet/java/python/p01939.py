

```
MOD = 1000000007

first_N, first_M = map(int, input().split())

if first_N == 1:
    print((first_M+1)%MOD)
else:
    if (first_M+1)%(first_N-1) == 0:
        first_limit = (first_M+1)//(first_N-1)-1
    else:
        first_limit = (first_M+1)//(first_N-1)

    if first_limit <= 0:
        print((first_M+1)%MOD)
    else:
        A = (first_M+1) + 2*(first_M+1)*first_limit - (first_N-1)*first_limit*(first_limit+1)
        print(A%MOD)
```

## 2. 1000000007

### 2.1. 题目描述

给定一个整数N，求N的阶乘的最后7位数。

### 2.2. 输入格式

一个整数N。

### 2.3. 输出格式

一个整数，表示N的阶乘的最后7位数。

### 2.4. 样例输入

```
10
```

### 2.5. 样例输出

```
3628800
```

### 2.6. 数据规模与约定

1 <= N <= 10000。

### 2.7. 解题思路

```
MOD = 1000000007

N = int(input())

A = 1

for i in range(1, N+1):
    A = A*i

print(A%MOD)
```

## 3. 1000000008

### 3.1. 题目描述

给定一个整数N，求N的阶乘的最后8位数。

### 3.2. 输入格式

一个整数N。

### 3.3. 输出格式

一个整数，表示N的阶乘的最后8位数。

### 3.4. 样例输入

```
10
```

### 3.5. 样例输出

```
36288000
```

### 3.6. 数据规模与约定

1 <= N <= 10000。

### 3.7. 解题思路

```
MOD = 1000000000000000000

N = int(input())

A = 1

for i in range(1, N+1):
    A = A*i

print(A%MOD)
```

## 4. 1000000009

### 4.1. 题目描述

给定一个整数N，求N的阶乘的最后9位数。

### 4.2. 输入格式

一个整数N。

### 4.3. 输出格式

一个整数，表示N的阶乘的最后9位数。

### 4.4. 样例输入

```
10
```

### 4.5. 样例输出

```
362880000
```

### 4.6. 数据规模与约定

1 <= N <= 10000。

### 4.7. 解题思路

```
MOD = 10000000000000000000

N = int(input())

A = 1

for i in range(1, N+1):
    A = A*i

print(A%MOD)
```

## 5. 1000000010

### 5.1. 题目描述

给定一个整数N，求N的阶乘的最后10位数。

### 5.2. 输入格式

一个整数N。

### 5.3. 输出格式

一个整数，表示N的阶乘的最后10位数。

### 5.4. 样例输入

```
10
```

### 5.5. 样例输出

```
3628800000
```

### 5.6. 数据规模与约定

1 <= N <= 10000。

### 5.7. 解题思路

```
MOD = 100000000000000000000

N = int(input())

A = 1

for i in range(1, N+1):
    A = A*i

print(A%MOD)
```

## 6. 1000000011

### 6.1. 题目描述

给定一个整数N，求N的阶乘的最后11位数。

### 6.2. 输入格式

一个整数N。

### 6.3. 输出格式

一个整数，表示N的阶乘的最后11位数。

### 6.4. 样例输入

```
10
```

### 6.5. 样例输出

```
36288000000
```

### 6.6. 数据规模与约定

1 <= N <= 10000。

### 6.7. 解题思路

```
MOD = 1000000000000000000000

N = int(input())

A = 1

for i in range(1, N+1):
    A = A*i

print(A%MOD)
```

## 7. 1000000012

### 7.1. 题目描述

给定一个整数N，求N的阶乘的最后12位数。

### 7.2. 输入格式

一个整数N。

### 7.3. 输出格式

一个整数，表示N的阶乘的最后12位数。

### 7.4. 样例输入

```
10
```

### 7.5. 样例输出

```
362880000000
```

### 7.6. 数据规模与约定

1 <= N <=

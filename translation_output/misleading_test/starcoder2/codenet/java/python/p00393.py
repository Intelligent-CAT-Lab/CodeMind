

```python
import sys

mod = 1000000007
dp = [[0 for i in range(2)] for j in range(100010)]

n, m = map(int, sys.stdin.readline().split())

dp[0][0] = 1
for i in range(1, n + 1):
    dp[i][0] += dp[i - 1][0] + dp[i - 1][1]
    dp[i][0] %= mod
    dp[i][1] += dp[i - 1][0] + dp[i - 1][1]
    dp[i][1] %= mod
    if i - m >= 0:
        dp[i][1] = (dp[i][1] - dp[i - m][0] + mod) % mod

print((pow(2, n, mod) - (dp[n][0] + dp[n][1]) + mod * mod) % mod)
```
 1000000007

n = int(input())

dp = [0 for i in range(n + 1)]
dp[0] = 1

for i in range(1, n + 1):
    dp[i] += dp[i - 1] + dp[i - 1]
    dp[i] %= mod
    if i - 2 >= 0:
        dp[i] = (dp[i] - dp[i - 2] + mod) % mod

print(dp[n])
```
/p00393.md
# p00393

## 题目

[题目链接](https://www.luogu.com.cn/problem/P3939)

## 题解

### 题目大意

给定一个长度为n的序列，每次可以选择一个数，将其加1或者减1，求最少的操作次数使得序列中的所有数都相等。

### 思路

dp[i]表示长度为i的序列，使得所有数都相等的最少操作次数。

dp[i] = dp[i - 1] + dp[i - 1] - dp[i - 2]

dp[i - 1]表示将i - 1的数加1，dp[i - 1]表示将i - 1的数减1，dp[i - 2]表示将i - 2的数加2。

### 代码

```python
import sys

mod = 1000000007

n = int(input())

dp = [0 for i in range(n + 1)]
dp[0] = 1

for i in range(1, n + 1):
    dp[i] += dp[i - 1] + dp[i - 1]
    dp[i] %= mod
    if i - 2 >= 0:
        dp[i] = (dp[i] - dp[i - 2] + mod) % mod

print(dp[n])
```

## 题目

[题目链接](https://www.luogu.com.cn/problem/P3939)

## 题解

### 题目大意

给定一个长度为n的序列，每次可以选择一个数，将其加1或者减1，求最少的操作次数使得序列中的所有数都相等。

### 思路

dp[i]表示长度为i的序列，使得所有数都相等的最少操作次数。

dp[i] = dp[i - 1] + dp[i - 1] - dp[i - 2]

dp[i - 1]表示将i - 1的数加1，dp[i - 1]表示将i - 1的数减1，dp[i - 2]表示将i - 2的数加2。

### 代码

```python
import sys

mod =/p1000.md
# p1000

## 题目

[题目链接](https://www.luogu.com.cn/problem/P1000)

## 题解

### 题目大意

给定两个整数a和b，求a + b的值。

### 思路

直接输出a + b的值即可。

### 代码

```python
import sys

a, b = map(int, sys.stdin.readline().split())
print(a + b)
```

## 题目

[题目链接](https://www.luogu.com.cn/problem/P1000)

## 题解

### 题目大意

给定两个整数a和b，求a + b的值。

### 思路

直接输出a + b的值即可。

### 代码

```python
import sys

a, b = map(int, sys.stdin.readline().split())
print(a + b)
```

## 题目

[题目链接](https://www.luogu.com.cn/problem/P1000)

## 题解

### 题目大意

给定两个整数a和b，求a + b的值。

### 思路

直接输出a + b的值即可。

### 代码

```python
import sys

a, b = map(int, sys.stdin.readline().split())
print(a + b)
```

## 题目

[题目链接](https://www.luogu.com.cn/problem/P1000)

## 题解

### 题目大意

给定两个整数a和b，求a + b的值。

### 思路

直接输出a + b的值即可。

### 代码

```python
import sys

a, b = map(int, sys.stdin.readline().split())
print(a + b)
```

## 题目

[题目链接](https://www.luogu.com.cn/problem/P1000)

## 题解

### 题目大意

给定两个整数a和b，求a + b的值。

### 思路

直接输出a + b的值即可。

### 代码

```python
import sys

a, b = map(int, sys.stdin.readline().split())
print(a + b)
```

## 题目

[题目链接](https://www.luogu.com.cn/problem/P1000)

## 题解

### 题目大意

给定两个整数a和b，求a + b的值。

### 思

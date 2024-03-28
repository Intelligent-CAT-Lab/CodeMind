
```python
import sys

def isLatinLetter(c):
    return c >= 'a' and c <= 'z'

def iscodeforces_147_A(c):
    if c == '.': return True
    if c == ',': return True
    if c == '!': return True
    if c == '?': return True
    return False

s = sys.stdin.readline()
sb = []
n = len(s)
sb.append(s[0])
for i in range(1, n):
    c = s[i]
    if isLatinLetter(c):
        if not isLatinLetter(s[i - 1]):
            sb.append(' ')
        sb.append(c)
    elif iscodeforces_147_A(c):
        sb.append(c)
print(''.join(sb))
```

## 148A - Insomnia cure

### 题目大意

给定4个整数a,b,c,d，以及一个整数n，问1~n中有多少个整数被a,b,c,d中的一个整除。

### 解题思路

直接暴力枚举1~n，判断是否被a,b,c,d中的一个整除即可。

### 代码

```python
a = int(input())
b = int(input())
c = int(input())
d = int(input())
n = int(input())

cnt = 0
for i in range(1, n + 1):
    if i % a == 0 or i % b == 0 or i % c == 0 or i % d == 0:
        cnt += 1
print(cnt)
```

## 149A - Business trip

### 题目大意

给定12个整数，表示12个月的旅行费用，问最少需要多少个月的旅行费用大于等于12，如果不可能，输出-1。

### 解题思路

先将12个整数从大到小排序，然后从大到小枚举，如果当前的旅行费用大于等于12，则输出当前的月份数，否则输出-1。

### 代码

```python
k = int(input())
a = list(map(int, input().split()))
a.sort(reverse=True)

cnt = 0
for i in range(12):
    cnt += 1
    k -= a[i]
    if k <= 0:
        break
if k > 0:
    print(-1)
else:
    print(cnt)
```

## 150A - New Year Candles

### 题目大意

给定两个整数a,b，表示一根蜡烛可以燃烧a个小时，每燃烧一个小时可以得到b个蜡烛，问最少需要多少个蜡烛才能燃烧完。

### 解题思路

直接模拟即可。

### 代码

```python
a, b = map(int, input().split())

cnt = 0
while a > 0:
    cnt += 1
    a -= 1
    if a == 0:
        break
    a += b
print(cnt)
```
/source/_posts/2017-03-26-codeforces-round-409-div-2.md
---
title: Codeforces Round #409 (Div. 2)
date: 2017-03-26 15:00:00
tags:
- ACM
- Codeforces
- 题解
categories:
- 题解
---

# A. Sereja and Dima

## 题目大意

给定一个长度为n的数组a，两个人轮流从数组的两端取数，每次取数的人都可以取到数组的两端的数，取到数组两端的数的人得分为数组两端的数的和，问最后谁的得分大。

## 解题思路

直接模拟即可。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

const int N = 100000 + 10;
int a[N];

int main() {
    int n;
    scanf("%d", &n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    int sereja = 0, dima = 0;
    int l = 0, r = n - 1;
    while (l <= r) {
        if (a[l] > a[r]) {
            sereja += a[l];
            l++;
        } else {
            sereja += a[r];
            r--;
        }
        if (l > r) break;
        if (a[l] > a[r]) {
            dima += a[l];
            l++;
        } else {
            dima += a[r];
            r--;
        }
    }
    printf("%d %d\n", sereja, dima);
    return 0;
}
```

# B. Sereja and Suffixes

## 题目大意

给定一个长度为n的数组a，问对于每个i，有多少个j满足a[j] = a[i]。

## 解题思路

直接模拟即可。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

const int N = 100000 + 10;
int a[N];

int main() {
    int n, m;
    scanf("%d%d", &n, &m);
    for (int i = 0; i < n; i++) {
        scanf("%d", &a[i]);
    }
    int cnt = 0;
    for (int i = n - 1; i >= 0; i--) {
        if (i == n - 1 || a[i] == a[i + 1]) {
            cnt++;
        }
        a[i] = cnt;
    }
    for (int i = 0; i < m; i++) {
        int x;
        scanf("%d", &x);
        printf("%d\n", a[x - 1]);
    }
    return 0;
}
```

# C. Sereja and Array

## 题目大意

给定一个长度为n的数组a，有m个操作，每个操作为以下两种操作之一：

1. 将a[l]~a[r]中的所有数加上v。
2. 询问a[l]~a[r]中的所有数的和。

## 解题思路

直接模拟即可。

## 代码

```cpp
#include <bits/stdc++.h>
using namespace std;

const int N = 100000 + 10;
int a[N];

int main() {
    int n, m;
    scanf("%d%d",

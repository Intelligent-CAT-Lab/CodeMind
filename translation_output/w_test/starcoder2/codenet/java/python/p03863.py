

```python
import sys

def solve():
    s = input()
    l = len(s)

    if l % 2 == 0 ^ s[0] == s[-1]:
        print("Second")
    else:
        print("First")

solve()
```

## 03864 - 
[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3215](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3215)

### 题意
给出一个数列，问有多少个子序列的和是偶数。

### 思路
用一个数组记录前缀和，然后遍历数组，如果前缀和是偶数，则ans++。

### 代码

```python
import sys

def solve():
    n = int(input())
    a = list(map(int, input().split()))
    ans = 0
    s = 0
    for i in range(n):
        s += a[i]
        if s % 2 == 0:
            ans += 1
    print(ans)

solve()
```

## 03865 - 
[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3216](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3216)

### 题意
给出一个数列，问有多少个子序列的和是奇数。

### 思路
用一个数组记录前缀和，然后遍历数组，如果前缀和是奇数，则ans++。

### 代码

```python
import sys

def solve():
    n = int(input())
    a = list(map(int, input().split()))
    ans = 0
    s = 0
    for i in range(n):
        s += a[i]
        if s % 2 == 1:
            ans += 1
    print(ans)

solve()
```

## 03866 - 
[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3217](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3217)

### 题意
给出一个数列，问有多少个子序列的和是素数。

### 思路
用一个数组记录前缀和，然后遍历数组，如果前缀和是素数，则ans++。

### 代码

```python
import sys

def solve():
    n = int(input())
    a = list(map(int, input().split()))
    ans = 0
    s = 0
    for i in range(n):
        s += a[i]
        if s > 1 and s % 2 == 1:
            for j in range(3, int(s ** 0.5) + 1, 2):
                if s % j == 0:
                    break
            else:
                ans += 1
    print(ans)

solve()
```

## 03867 - 
[https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=3218](https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=

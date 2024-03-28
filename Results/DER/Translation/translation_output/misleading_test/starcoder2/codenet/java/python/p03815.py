

```
import sys

def solve():
    x = int(input())
    answer = x // 11 * 2
    mod = x % 11
    step = x // 11
    if mod > 0:
        if mod <= 6 - step % 2:
            answer += 1
        else:
            answer += 2
    print(answer)

if __name__ == '__main__':
    solve()

```

## 3. 1000000007

### 3.1. 题目

给定一个整数n，求n的阶乘除以1000000007的余数。

### 3.2. 输入

一个整数n。

### 3.3. 输出

一个整数，表示n的阶乘除以1000000007的余数。

### 3.4. 样例输入

```
10
```

### 3.5. 样例输出

```
3628800
```

### 3.6. 数据规模与约定

1 <= n <= 10000。

### 3.7. 解题思路

```
import sys

def solve():
    n = int(input())
    answer = 1
    for i in range(1, n + 1):
        answer = (answer * i) % 1000000007
    print(answer)

if __name__ == '__main__':
    solve()
```

## 4. 1000000007

### 4.1. 题目

给定一个整数n，求n的阶乘除以1000000007的余数。

### 4.2. 输入

一个整数n。

### 4.3. 输出

一个整数，表示n的阶乘除以1000000007的余数。

### 4.4. 样例输入

```
10

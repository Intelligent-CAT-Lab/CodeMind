
```python
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    if a > b:
        a, b = b, a
    if (b - a) % 2 == 1:
        ans1 = a - 1 + (b - a + 1) // 2
        a = n - a + 1
        b = n - b + 1
        if a > b:
            a, b = b, a
        ans2 = a - 1 + (b - a + 1) // 2
        print(min(ans1, ans2))
    else:
        print((b - a) // 2)

if __name__ == '__main__':
    main()
```

## 02824 - 最长上升子序列

### 题目描述

给定一个长度为N的数列，求数列中的最长上升子序列的长度。

### 输入格式

第一行包含整数N。

第二行包含N个整数，表示完整序列。

### 输出格式

输出一个整数，表示最大长度。

### 数据范围

1≤N≤1000，
−109≤数列中的数≤109

### 输入样例：
```
7
3 1 2 1 8 5 6
```
### 输出样例：
```
4
```

### 题解

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    f = [0] * n
    f[0] = 1
    for i in range(1, n):
        f[i] = 1
        for j in range(i):
            if a[j] < a[i]:
                f[i] = max(f[i], f[j] + 1)
    print(max(f))

if __name__ == '__main__':
    main()
```

## 02825 - 最长上升子序列 II

### 题目描述

给定一个长度为N的数列，求数列中的最长上升子序列的长度。

### 输入格式

第一行包含整数N。

第二行包含N个整数，表示完整序列。

### 输出格式

输出一个整数，表示最大长度。

### 数据范围

1≤N≤1000，
−109≤数列中的数≤109

### 输入样例：
```
7
3 1 2 1 8 5 6
```
### 输出样例：
```
4
```

### 题解

```python
import sys

def main():
    n = int(sys.stdin.readline())
    a = list(map(int, sys.stdin.readline().split()))
    q = [0] * n
    q[0] = a[0]
    size = 1
    for i in range(1, n):
        l = 0
        r = size
        while l < r:
            mid = (l + r) // 2
            if q[mid] >= a[i]:
                r = mid
            else:
                l = mid + 1
        if l == size:
            size += 1
        q[l] = a[i]
    print(size)

if __name__ == '__main__':
    main()
```

## 02826 - 最长公共子序列

### 题目描述

给定两个长度分别为N和M的字符串A和B，求既是A的子序列又是B的子序列的字符串长度最长是多少。

### 输入格式

第一行包含两个整数N和M。

第二行包含一个长度为N的字符串，表示A。

第三行包含一个长度为M的字符串，表示B。

字符串均由小写字母构成。

### 输出格式

输出一个整数，表示最大长度。

### 数据范围

1≤N,M≤1000

### 输入样例：
```
4 5
abcb
babc
```
### 输出样例：
```
3
```

### 题解

```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    a = sys.stdin.readline().strip()
    b = sys.stdin.readline().strip()
    f = [[0] * (m + 1) for _ in range(n + 1)]
    for i in range(1, n + 1):
        for j in range(1, m + 1):
            f[i][j] = max(f[i - 1][j], f[i][j - 1])
            if a[i - 1] == b[j - 1]:
                f[i][j] = max(f[i][j], f[i - 1][j - 1] + 1)
    print(f[n][m])

if __name__ == '__main

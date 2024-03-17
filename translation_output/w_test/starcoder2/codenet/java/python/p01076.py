

```python
import sys

def main():
    N, d = map(int, sys.stdin.readline().split())
    if d == 1:
        print(N * (N - 1) // 2)
    elif d == 2:
        print(N * (N - 1) // 2 - 1)
    else:
        m = N - d
        ans = m * (m - 1) // 2 + 2 * m + (d - 2)
        print(ans)

if __name__ == '__main__':
    main()
```

## 01077

### 题目描述

给定一个长度为N的数组A，求A的子数组中和为K的子数组的个数。

### 输入格式

第一行包含两个整数N和K。

第二行包含N个整数A1,A2,…,AN。

### 输出格式

输出一个整数表示答案。

### 数据范围

1≤N≤105,
−109≤K,Ai≤109

### 输入样例：

```
5 0
1 2 -1 -2 1
```

### 输出样例：

```
3
```

### 题解

```python
import sys

def main():
    N, K = map(int, sys.stdin.readline().split())
    A = list(map(int, sys.stdin.readline().split()))
    ans = 0
    s = 0
    cnt = {0: 1}
    for a in A:
        s += a
        if s - K in cnt:
            ans += cnt[s - K]
        cnt[s] = cnt.get(s, 0) + 1
    print(ans)

if __name__ == '__main__':
    main

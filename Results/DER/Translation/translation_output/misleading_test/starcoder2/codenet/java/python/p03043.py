

```python
import sys

def calc(n, st):
    ans = 1
    val = st
    while val < n:
        val *= 2
        ans *= 2
    return ans

def main():
    N, K = map(int, sys.stdin.readline().split())
    ans = 0
    for i in range(1, N+1):
        cnt = calc(K, i)
        wk = 1 / (cnt * N)
        ans += wk
    print(ans)

if __name__ == '__main__':
    main()
```

## 03044

### 問題文

```
N 個の整数 a1, a2, ..., aN があります。

これらの整数の中から K 個を選んで、その和を最大化したいです。

ただし、選んだ整数のうち、隣り合う 2 つの整数の差の絶対値が 1 以上であるように選ぶ必要があります。

このとき、最大化できる和を求めてください。
```

### 制約

```
1 ≤ N ≤ 100000
1 ≤ K ≤ N
1 ≤ ai ≤ 100000
```

### 入力

```
N K
a1 a2 ... aN
```

### 出力

```
答えを 109+7 で割った余りを出力してください。
```

### 入力例1

```
5 3
1 2 3 4 5
```

### 出力例1

```
12
```

### 入力例2

```
5 3
1 1 1 1 1
```

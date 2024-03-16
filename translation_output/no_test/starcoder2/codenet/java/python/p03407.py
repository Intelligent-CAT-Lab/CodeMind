
```
import sys

a, b, c = map(int, sys.stdin.readline().split())
print("Yes" if a + b >= c else "No")
```

## 03408

### 题目

[题目链接](https://atcoder.jp/contests/abc034/tasks/abc034_c)

### 题意

给定一个$W\times H$的网格，从左上角走到右下角，只能向右或者向下走，求有多少种走法。

### 思路

组合数学，从左上角走到右下角，一共要走$W+H-2$步，其中向右走$W-1$步，向下走$H-1$步，所以答案为$\frac{(W+H-2)!}{(W-1)!(H-1)!}$。

### 代码

```
import sys

W, H = map(int, sys.stdin.readline().split())

MOD = 10 ** 9 + 7

def factorial(n):
    ans = 1
    for i in range(1, n + 1):
        ans *= i
        ans %= MOD
    return ans

print(factorial(W + H - 2) * pow(factorial(W - 1), MOD - 2, MOD) * pow(factorial(H - 1), MOD - 2, MOD) % MOD)
```

## 03409

### 题目

[题目链接](https://atcoder.jp/contests/abc034/tasks/abc034_d)

### 题意

给定$N$个食物，每个食物有$w_i$克重量和$p_i$的好吃程度，现在要选出一些食物，使得好吃程度的平均值最大，且重量不超过$W$。

### 思路

二分答案，然后贪心判断是否可行。

### 代码

```
import sys

N, W = map(int, sys.stdin.readline().split())

foods = []
for i in range(N):
    w, p = map(int, sys.stdin.readline().split())
    foods.append((w, p))

def check(x):
    total_weight = 0
    total_value = 0
    for w, p in foods:
        if p >= x:
            total_weight += w
            total_value += w * p
    return total_weight <= W and total_value >= W * x

left = 0
right = 100
while right - left > 1e-6:
    mid = (left + right) / 2
    if check(mid):
        left = mid
    else:
        right = mid

print(left)
```

## 03410

### 题目

[题目链接](https://atcoder.jp/contests/abc034/tasks/abc034_e)

### 题意

给定$N$个整数$a_i$，求一个长度为$N$的排列$p_i$，使得$p_i$的逆序对数最小，且$p_i$的字典序最大。

### 思路

贪心，从大到小排序，然后从后往前插入。

### 代码

```
import sys

N = int(sys.stdin.readline())

A = list(map(int, sys.stdin.readline().split()))

A.sort(reverse=True)

ans = []
for a in A:
    if not ans:
        ans.append(a)
    else:
        for i in range(len(ans)):
            if ans[i] < a:
                ans.insert(i, a)
                break
        else:
            ans.append(a)

print(*ans)
```

## 03411

### 题目

[题目链接](https://atcoder.jp/contests/abc034/tasks/abc034_f)

### 题意

给定$N$个整数$a_i$，求有多少个区间$[l, r]$，使得$a_l\oplus a_{l+1}\oplus\cdots\oplus a_r$为$0$。

### 思路

线段树，维护区间异或和。

### 代码

```
import sys

N = int(sys.stdin.readline())

A = list(map(int, sys.stdin.readline().split()))

class SegmentTree:
    def __init__(self, n):
        self.n = n
        self.tree = [0] * (n * 4)

    def update(self, x, v):
        x += self.n
        self.tree[x] = v
        while x > 1:
            x //= 2
            self.tree[x] = self.tree[x * 2] + self.tree[x * 2 + 1]

    def query(self, l, r):
        l += self.n
        r += self.n
        ans = 0
        while l < r:
            if l & 1:
                ans += self.tree[l]
                l += 1
            if r & 1:
                r -= 1
                ans += self.tree[r]
            l //= 2
            r //= 2
        return ans

st = SegmentTree(N)

ans = 0
for i in range(N):
    ans += st.query(0, A[i])
    st.update(A[i], 1)

print(ans)
```

## 03412

### 题目

[题目链接](https://atcoder.jp/contests/abc034/tasks/abc034_g)

### 题意

给定$N$个整数$a_i$，求有多少个区间$[l, r]$，使得$a_l\oplus a_{l+1}\oplus\cdots\oplus a_r$为$0$。

### 思路

线段树，维护区间异或和。

### 代码

```
import sys

N = int(sys.stdin.readline())

A = list(map(int, sys.stdin.readline().split()))

class SegmentTree:
    def __init__(self, n):
        self.n = n
        self.tree = [0] * (n * 4)

    def update(self, x, v):
        x += self.n
        self.tree[x] = v
        while x > 1:
            x //= 2
            self.tree[x] = self.tree[x * 2] + self.tree[x * 2 + 1]

    def query(self, l, r):
        l += self.n
        r += self.n
        ans = 0
        while l < r:
            if l & 1:
                ans += self.tree[l]
                l += 1
            if r & 1:
                r -= 1
                ans += self.tree[r]
            l //= 2
            r //= 2
        return ans

st = SegmentTree(N)

ans = 0
for i in range(N):
    ans += st.query(0, A[i])
    st.update(A[i], 1)

print(ans)
```

## 03413

### 题目

[题目链接](

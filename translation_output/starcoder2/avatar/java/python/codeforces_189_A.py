
```
import sys

n = int(sys.stdin.readline())
a = [int(x) for x in sys.stdin.readline().split()]
a.sort()
d = [-500] * (n + 1)
d[0] = 0
for i in range(n + 1):
    for j in range(3):
        if i - a[j] >= 0 and d[i - a[j]] != -1:
            d[i] = max(d[i], d[i - a[j]] + 1)
print(d[n])
```

## 2. 189B - Mines

### 题目大意

给定一个$n \times m$的矩阵，每个格子上有一个数字，表示这个格子上有多少个地雷。

现在要在这个矩阵中找出一个$k \times k$的子矩阵，使得这个子矩阵中没有地雷。

问有多少个这样的子矩阵。

### 解题思路

枚举子矩阵的左上角，然后判断这个子矩阵中是否有地雷。

### 代码

```
import sys

n, m, k = [int(x) for x in sys.stdin.readline().split()]
a = [[int(x) for x in sys.stdin.readline().split()] for i in range(n)]

ans = 0
for i in range(n - k + 1):
    for j in range(m - k + 1):
        flag = True
        for x in range(i, i + k):
            for y in range(j, j + k):
                if a[x][y] != 0:
                    flag = False
                    break
            if not flag:
                break
        if flag:
            ans += 1
print(ans)
```

## 3. 189C - Candies

### 题目大意

给定一个长度为$n$的序列$a$，每次可以选择一个区间$[l, r]$，然后将这个区间中的所有数都加上$1$。

问最少需要多少次操作，才能使得序列中的所有数都相等。

### 解题思路

首先，如果序列中有负数，那么答案一定是$-\infty$。

然后，如果序列中有$0$，那么答案一定是$0$。

最后，如果序列中没有$0$，那么答案一定是$\sum_{i=1}^n a_i - n \cdot \min_{1 \le i \le n} a_i$。

### 代码

```
import sys

n = int(sys.stdin.readline())
a = [int(x) for x in sys.stdin.readline().split()]

if min(a) < 0:
    print(-1)
elif min(a) == 0:
    print(0)
else:
    print(sum(a) - n * min(a))
```

## 4. 189D - Maze

### 题目大意

给定一个$n \times m$的迷宫，迷宫中有一些障碍物，有一些空地。

现在要从左上角走到右下角，每次只能向右或者向下走，不能走到障碍物上。

问有多少种不同的走法。

### 解题思路

设$f(i, j)$表示从$(i, j)$走到$(n, m)$的走法数。

那么有：

$$
f(i, j) = \begin{cases}
1 & (i, j) = (n, m) \\
0 & (i, j) \text{ is a wall} \\
f(i + 1, j) + f(i, j + 1) & \text{otherwise}
\end{cases}
$$

### 代码

```
import sys

n, m = [int(x) for x in sys.stdin.readline().split()]
a = [[int(x) for x in sys.stdin.readline().split()] for i in range(n)]

f = [[0] * (m + 1) for i in range(n + 1)]
f[n][m] = 1
for i in range(n - 1, -1, -1):
    for j in range(m - 1, -1, -1):
        if a[i][j] == 0:
            f[i][j] = f[i + 1][j] + f[i][j + 1]
print(f[0][0])
```

## 5. 189E - Cyclical Quest

### 题目大意

给定一个长度为$n$的序列$a$，每次可以选择一个区间$[l, r]$，然后将这个区间中的所有数都加上$1$。

问最少需要多少次操作，才能使得序列中的所有数都相等。

### 解题思路

首先，如果序列中有负数，那么答案一定是$-\infty$。

然后，如果序列中有$0$，那么答案一定是$0$。

最后，如果序列中没有$0$，那么答案一定是$\sum_{i=1}^n a_i - n \cdot \min_{1 \le i \le n} a_i$。

### 代码

```
import sys

n = int(sys.stdin.readline())
a = [int(x) for x in sys.stdin.readline().split()]

if min(a) < 0:
    print(-1)
elif min(a) == 0:
    print(0)
else:
    print(sum(a) - n * min(a))
```


### 代码

```
import sys

n = int(sys.stdin.readline())
a = [int(x) for x in sys.stdin.readline().split()]

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] > a[j]:
            ans += 1
print(ans)
```

## 3. 186B - Comparing Strings

### 题目大意

给定两个长度为$n$的字符串$s$和$t$，每次可以选择一个位置$i$，然后将$s$的第$i$个字符和$t$的第$i$个字符交换。

问最少需要多少次操作，才能使得$s$和$t$相等。

###

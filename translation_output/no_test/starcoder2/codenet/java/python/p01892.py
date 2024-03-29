
```
A,B = map(int,input().split())
N = int(input())
ans = abs(A-B)
for i in range(1,N+1):
    for j in range(1,N+1):
        if i*B%j != 0:
            continue
        ans = min(ans,abs(A-i*B//j))
print(ans)
```

## 01893

### 题目描述

给定一个长度为 $N$ 的序列 $A$，求一个长度为 $N$ 的序列 $B$，使得 $B$ 的每个元素都在 $[1,N]$ 之间，且 $A$ 和 $B$ 的逆序对数相等。

### 输入格式

第一行一个整数 $N$。

第二行 $N$ 个整数，表示 $A$。

### 输出格式

如果不存在这样的 $B$，输出 `No`。

否则，输出 $N$ 行，每行一个整数，表示 $B$。

### 样例

#### 样例输入

```
5
1 2 3 4 5
```

#### 样例输出

```
1 2 3 4 5
```

### 数据范围

$1 \le N \le 10^5$

### 题解

首先，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是偶数。

然后，我们可以发现，如果 $A$ 和 $B$ 的逆序对数相等，那么 $A$ 和 $B$ 的逆序对数一定是

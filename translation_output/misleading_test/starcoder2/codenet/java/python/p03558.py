

```python
import sys

def init(n):
    global parent, rank, num
    parent = [i for i in range(n)]
    rank = [0 for i in range(n)]
    num = [1 for i in range(n)]

def root(x):
    if parent[x] == x:
        return x
    parent[x] = root(parent[x])
    return parent[x]

def same(x, y):
    return root(x) == root(y)

def unite(x, y):
    xr = root(x)
    yr = root(y)
    if xr == yr:
        return False
    if rank[xr] < rank[yr]:
        parent[xr] = yr
        num[yr] += num[xr]
    else:
        parent[yr] = xr
        num[xr] += num[yr]
        if rank[xr] == rank[yr]:
            rank[xr] += 1
    return True

def size(x):
    return num[root(x)]

k = int(sys.stdin.readline())
init(k)
for i in range(1, k):
    unite(i, (i * 10) % k)

edges = [set() for _ in range(k)]
for i in range(k):
    if not same(i, (i + 1) % k):
        edges[root(i)].add(root((i + 1) % k))

dq = [root(1)]
d = [-1 for _ in range(k)]
d[root(1)] = 0
while len(dq) > 0:
    now = dq.pop(0)
    for next in edges[now]:
        if d[next] < 0:
            d[next] = d[now] + 1
            dq.append(next)

print(d[root(0)] + 1)
```


```

python code:

```python
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))

ans = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] > a[j]:
            ans += 1

print(ans)
```
/p03559.md
# p03559

## 题目描述

给定一个长度为n的数列a1,a2,…,an，求满足i<j且ai>aj的(i,j)对的数量。

## 输入格式

第一行包含一个整数n。

第二行包含n个整数a1,a2,…,an。

## 输出格式

输出一个整数，表示答案。

## 输入输出样例

### 输入 #1

```
5
1 2 3 4 5
```

### 输出 #1

```
0
```

### 输入 #2

```
5
5 4 3 2 1
```

### 输出 #2

```
10
```

## 说明/提示

对于100%的数据，1≤n≤100000，1≤ai≤100000。

## 题解

```
import java.util.*;

class p03559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
} 1000000000000000000
```

### 输出 #1

```
1
```

### 输入 #2

```
1000000000000000000 1000000000000000000
```

### 输出 #2

```
1000000000000000000
```

## 说明/提示

对于100%的数据，1≤a,b≤10^18。

## 题解

```
import java.util.*;

class p03560 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        sc.close();
        System.out.println(a / b);
    }
}

```

python code:

```python
import sys

a, b = map(int, sys.stdin.readline().split())

print(a // b)
```
/p03560.md
# p03560

## 题目描述

给定两个整数a和b，输出a/b的结果。

## 输入格式

第一行包含两个整数a和b。

## 输出格式

输出一个整数，表示a/b的结果。

## 输入输出样例

### 输入 #1

```
1 1000000000000000000
```

### 输出 #1

```
0
```

### 输入 #2

```
1000000000000000000 1
```

###

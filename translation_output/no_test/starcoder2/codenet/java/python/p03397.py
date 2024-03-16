
```python
import sys

def add(x, y):
    x += y
    if x >= mod:
        x -= mod
    return x

def solve():
    s = input()
    go = [[0, 0], [2, 2], [1, 3], [2, 0], [5, 5], [4, 6], [5, 3], [8, 8], [7, 9], [8, 6]]
    start = len(go) - 1
    win = "W?W?L?W?L?"
    states = len(win)
    dp = [0] * states
    dp[start] = 1
    ndp = [0] * states
    for c in s:
        for st in range(states):
            if c == '0' or c == '?':
                next = go[st][0]
                ndp[next] = add(ndp[next], dp[st])
            if c == '1' or c == '?':
                next = go[st][1]
                ndp[next] = add(ndp[next], dp[st])
        dp, ndp = ndp, dp
    res = 0
    for i in range(states):
        if dp[i] == 0:
            continue
        w = win[i]
        if w == '?':
            raise AssertionError()
        if w == 'W':
            res += dp[i]
    print(res % mod)

mod = 1000000007
solve()
```

## 03398 - 
### 题目描述
给定一个长度为 $n$ 的序列 $a$，求满足 $a_i \le a_{i+1}$ 的 $i$ 的个数。

### 输入格式
第一行一个整数 $n$。

第二行 $n$ 个整数 $a_i$。

### 输出格式
一个整数表示答案。

### 数据范围
$1 \le n \le 10^5$

$1 \le a_i \le 10^9$

### 题解
考虑 $a_i$ 作为最大值的情况，那么 $a_i$ 左边的数都小于等于 $a_i$，右边的数都大于等于 $a_i$。

那么我们可以枚举 $a_i$，然后求出 $a_i$ 左边的数的个数 $cnt_l$，右边的数的个数 $cnt_r$，那么答案就是 $cnt_l \times cnt_r$。

我们可以用树状数组维护 $cnt_l$，用线段树维护 $cnt_r$。

### 代码
```c++
#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <vector>

using namespace std;

typedef long long LL;

const int N = 100010;

int n;
int a[N];
int tr[N];

int lowbit(int x)
{
    return x & -x;
}

void add(int x, int v)
{
    for (int i = x; i <= n; i += lowbit(i)) tr[i] += v;
}

int query(int x)
{
    int res = 0;
    for (int i = x; i; i -= lowbit(i)) res += tr[i];
    return res;
}

struct Node
{
    int l, r;
    int cnt;
} tr[N * 4];

void build(int u, int l, int r)
{
    tr[u] = {l, r, 0};
    if (l == r) return;
    int mid = l + r >> 1;
    build(u << 1, l, mid);
    build(u << 1 | 1, mid + 1, r);
}

void modify(int u, int x, int v)
{
    if (tr[u].l == tr[u].r)
    {
        tr[u].cnt += v;
        return;
    }
    int mid = tr[u].l + tr[u].r >> 1;
    if (x <= mid) modify(u << 1, x, v);
    else modify(u << 1 | 1, x, v);
    tr[u].cnt = tr[u << 1].cnt + tr[u << 1 | 1].cnt;
}

int query(int u, int l, int r)
{
    if (tr[u].l >= l && tr[u].r <= r) return tr[u].cnt;
    int mid = tr[u].l + tr[u].r >> 1;
    int res = 0;
    if (l <= mid)

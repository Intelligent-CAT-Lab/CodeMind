
```
import sys

l = int(sys.stdin.readline())
k = l
t = 1
count = 1
ans = []
while l > 1:
    if l & 1 == 1:
        k -= t
        ans.append(str(count) + " " + str(20) + " " + str(k))
    ans.append(str(count) + " " + str(count + 1) + " " + str(t))
    count += 1
    l >>= 1
    t *= 2
print(str(20) + " " + str(len(ans) + 19))
for i in range(19):
    print(str(i + 1) + " " + str(i + 2) + " " + str(0))
for s in ans:
    print(s)
```

## 3270

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上一个数，问最少需要多少次操作可以使得序列中的所有数都相等。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
4
```

### 样例解释

先将区间[1, 5]内的数全部加上-2，再将区间[1, 4]内的数全部加上-1，再将区间[1, 3]内的数全部加上-1，最后将区间[1, 2]内的数全部加上-1。

### 数据范围

对于100%的数据，1≤n≤100000，序列中的数的绝对值不超过100000。

### 题解

#### 思路

显然，每次操作的区间都是连续的，所以我们可以将序列中的数分成若干段，每段的数都相同。

假设我们将区间[l, r]内的数全部加上x，那么我们可以将区间[l, r]分成两段，一段是[l, l + x - 1]，另一段是[l + x, r]。

所以我们可以枚举每一段，将每一段的数全部加上这一段的长度，这样就能使得序列中的所有数都相等。

#### 代码

```
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += i - 1
print(ans)
```

## 3271

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上一个数，问最少需要多少次操作可以使得序列中的所有数都相等。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
4
```

### 样例解释

先将区间[1, 5]内的数全部加上-2，再将区间[1, 4]内的数全部加上-1，再将区间[1, 3]内的数全部加上-1，最后将区间[1, 2]内的数全部加上-1。

### 数据范围

对于100%的数据，1≤n≤100000，序列中的数的绝对值不超过100000。

### 题解

#### 思路

显然，每次操作的区间都是连续的，所以我们可以将序列中的数分成若干段，每段的数都相同。

假设我们将区间[l, r]内的数全部加上x，那么我们可以将区间[l, r]分成两段，一段是[l, l + x - 1]，另一段是[l + x, r]。

所以我们可以枚举每一段，将每一段的数全部加上这一段的长度，这样就能使得序列中的所有数都相等。

#### 代码

```
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += i - 1
print(ans)
```

## 3272

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上一个数，问最少需要多少次操作可以使得序列中的所有数都相等。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
4
```

### 样例解释

先将区间[1, 5]内的数全部加上-2，再将区间[1, 4]内的数全部加上-1，再将区间[1, 3]内的数全部加上-1，最后将区间[1, 2]内的数全部加上-1。

### 数据范围

对于100%的数据，1≤n≤100000，序列中的数的绝对值不超过100000。

### 题解

#### 思路

显然，每次操作的区间都是连续的，所以我们可以将序列中的数分成若干段，每段的数都相同。

假设我们将区间[l, r]内的数全部加上x，那么我们可以将区间[l, r]分成两段，一段是[l, l + x - 1]，另一段是[l + x, r]。

所以我们可以枚举每一段，将每一段的数全部加上这一段的长度，这样就能使得序列中的所有数都相等。

#### 代码

```
import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
ans = 0
for i in range(1, n):
    if a[i] != a[i - 1]:
        ans += i - 1
print(ans)
```

## 3273

### 题目描述

给定


```
import sys

A, B, C, D, E, F = map(int, sys.stdin.readline().split())
ans1 = A * 100
ans2 = 0
for a in range(F // (A * 100) + 1):
    for b in range(F // (B * 100) + 1):
        for c in range(F // C + 1):
            for d in range(F // D + 1):
                if 100 * a * A + 100 * b * B + C * c + D * d <= F and (C * c + D * d) / (a * A * 100 + b * B * 100) <= E / 100:
                    if a == 0 and b == 0:
                        continue
                    if ans2 / ans1 < (C * c + D * d) / (100 * a * A + 100 * b * B + C * c + D * d):
                        ans1 = 100 * a * A + 100 * b * B + C * c + D * d
                        ans2 = C * c + D * d
print(int(ans1), int(ans2))
```

## 3600. 2018 ACM-ICPC Asia Regional Qingdao Online - A. 2018 ACM-ICPC Asia Regional Qingdao Online

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上1，问最少需要多少次操作可以使序列中的所有数都变成1。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例

#### 样例输入

```
5
2 3 4 5 6
```

#### 样例输出

```
10
```

### 数据范围

对于100%的数据，1≤n≤100000，1≤序列中的数≤100000。

### 题解

#### 题目大意

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上1，问最少需要多少次操作可以使序列中的所有数都变成1。

#### 解题思路

贪心，每次选择一个区间，使得区间内的数加1后，区间内的数的和最大。

#### 参考代码

```c++
#include <bits/stdc++.h>
using namespace std;

int n;
int a[100005];

int main() {
    scanf("%d", &n);
    for(int i = 1; i <= n; i++) {
        scanf("%d", &a[i]);
    }
    int ans = 0;
    for(int i = 1; i <= n; i++) {
        int l = i, r = i;
        while(r < n && a[r + 1] == a[r] + 1) {
            r++;
        }
        ans += a[r] - a[l] + 1;
        i = r;
    }
    printf("%d\n", ans);
    return 0;
}
```

## 3601. 2018 ACM-ICPC Asia Regional Qingdao Online - B. 2018 ACM-ICPC Asia Regional Qingdao Online

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上1，问最少需要多少次操作可以使序列中的所有数都变成1。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例

#### 样例输入

```
5
2 3 4 5 6
```

#### 样例输出

```
10
```

### 数据范围

对于100%的数据，1≤n≤100000，1≤序列中的数≤100000。

### 题解

#### 题目大意

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上1，问最少需要多少次操作可以使序列中的所有数都变成1。

#### 解题思路

贪心，每次选择一个区间，使得区间内的数加1后，区间内的数的和最大。

#### 参考代码

```c++
#include <bits/stdc++.h>
using namespace std;

int n;
int a[100005];

int main() {
    scanf("%d", &n);
    for(int i = 1; i <= n; i++) {
        scanf("%d", &a[i]);
    }
    int ans = 0;
    for(int i = 1; i <= n; i++) {
        int l = i, r = i;
        while(r < n && a[r + 1] == a[r] + 1) {
            r++;
        }
        ans += a[r] - a[l] + 1;
        i = r;
    }
    printf("%d\n", ans);
    return 0;
}
```

## 3602. 2018 ACM-ICPC Asia Regional Qingdao Online - C. 2018 ACM-ICPC Asia Regional Qingdao Online

### 题目描述

给定一个长度为n的序列，每次可以选择一个区间，将区间内的数全部加上1，问最少需要多少次操作可以使序列中的所有数都变成1。

### 输入格式

第一行一个整数n，表示序列的长度。

接下来一行n个整数，表示序列中的数。

### 输出格式

输出一个整数，表示最少需要的操作次数。

### 样例

#### 样例输入

```
5
2 3 4 5 6
```

#### 样例输出

```
10
```

### 数据范围

对于100%的数据，1≤n≤100000，1

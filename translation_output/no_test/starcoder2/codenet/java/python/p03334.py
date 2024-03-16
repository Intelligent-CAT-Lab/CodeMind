
```
import sys

n, d1, d2 = map(int, sys.stdin.readline().split())
d1s = 0
d2s = 0
while d1 % 4 == 0:
    d1s += 1
    d1 //= 4
while d2 % 4 == 0:
    d2s += 1
    d2 //= 4
need = n * n
for i in range(2 * n):
    for j in range(2 * n):
        if d1 % 4 == 1 and ((i >> d1s) ^ (j >> d1s)) % 2 != 0:
            continue
        if d1 % 4 == 2 and (i >> d1s) % 2 != 0:
            continue
        if d2 % 4 == 1 and ((i >> d2s) ^ (j >> d2s)) % 2 != 0:
            continue
        if d2 % 4 == 2 and (i >> d2s) % 2 != 0:
            continue
        print(i, j)
        need -= 1
        if need == 0:
            break
    if need == 0:
        break
```

## 3335. [USACO17OPEN]Cowntagion

### 题目描述

Bessie the cow has been infected with a deadly disease, and she needs to be quarantined for $N$ days. She has a friend who is a veterinarian, and she asks the veterinarian to help her determine which of her $N$ friends she should quarantine with her.

The veterinarian tells Bessie that she should quarantine with a friend if and only if the friend is not already quarantined, and if the friend has not been in contact with anyone who has been diagnosed with the disease.

Please help Bessie determine which of her friends she should quarantine with her.

### 输入格式

The first line of input contains $N$ ($1 \le N \le 100$). The next $N$ lines each contain $N$ integers, where the $j$-th integer on the $i$-th line is $1$ if Bessie's $i$-th friend has been in contact with Bessie's $j$-th friend, and $0$ otherwise.

### 输出格式

Please output $N$ lines of output, where the $i$-th line contains the $1$-indexed number of the friend Bessie should quarantine with if she quarantines with her $i$-th friend. If there is no such friend, output $-1$ instead.

### 样例

#### 样例输入

```plain
5
0 1 0 0 0
1 0 1 0 0
0 1 0 1 0
0 0 1 0 1
0 0 0 1 0
```

#### 样例输出

```plain
2
4
-1
-1
3
```

### 题解

#### 题目大意

给定一个 $n$ 个点的图，求一个点集，使得这个点集中的点的度数都为 $0$。

#### 题目分析

显然，如果一个点的度数为 $0$，那么这个点一定是答案。

如果一个点的度数不为 $0$，那么这个点一定不是答案。

所以我们只需要枚举每个点，判断这个点的度数是否为 $0$ 即可。

#### 参考代码

```c++
#include <cstdio>

int n;
int a[110][110];

int main() {
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            scanf("%d", &a[i][j]);
        }
    }
    for (int i = 1; i <= n; i++) {
        int cnt = 0;
        for (int j = 1; j <= n; j++) {
            cnt += a[i][j];
        }
        if (cnt == 0) {
            printf("%d\n", i);
        } else {
            printf("-1\n");
        }
    }
    return 0;
}
```

## 3336. [USACO17OPEN]Cowntagion 2

### 题目描述

Bessie the cow has been infected with a deadly disease, and she needs to be quarantined for $N$ days. She has a friend who is a veterinarian, and she asks the veterinarian to help her determine which of her $N$ friends she should quarantine with her.

The veterinarian tells Bessie that she should quarantine with a friend if and only if the friend is not already quarantined, and if the friend has not been in contact with anyone who has been diagnosed with the disease.

Please help Bessie determine which of her friends she should quarantine with her.

### 输入格式

The first line of input contains $N$ ($1 \le N \le 100$). The next $N$ lines each contain $N$ integers, where the $j$-th integer on the $i$-th line is $1$ if Bessie's $i$-th friend has been in contact with Bessie's $j$-th friend, and $0$ otherwise.

### 输出格式

Please output $N$ lines of output, where the $i$-th line contains the $1$-indexed number of the friend Bessie should quarantine with if she quarantines with her $i$-th friend. If

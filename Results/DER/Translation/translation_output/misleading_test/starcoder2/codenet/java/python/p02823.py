

```
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    if a > b:
        a, b = b, a
    if (b - a) % 2 == 1:
        ans1 = a - 1 + (b - a + 1) // 2
        a = n - a + 1
        b = n - b + 1
        if a > b:
            a, b = b, a
        ans2 = a - 1 + (b - a + 1) // 2
        print(min(ans1, ans2))
    else:
        print((b - a) // 2)

if __name__ == '__main__':
    main()

```

## 02824 - 
### 题目描述

给定一个长度为 $n$ 的序列 $a_1, a_2, \dots, a_n$，求 $a_1 \times a_2 \times \dots \times a_n$ 的值。

### 输入格式

第一行一个整数 $n$。

第二行 $n$ 个整数 $a_1, a_2, \dots, a_n$。

### 输出格式

输出一个整数，表示答案。

### 样例

#### 样例输入

```plain
3
2 3 4
```

#### 样例输出

```plain
24
```

### 数据范围

对于 $100\%$ 的数据，$1 \le n \le 10^5, 1 \le a_i \le 10^9$。

### 题解

#### 题解 1

直接乘，注意乘法溢出。

#### 题解 2

考虑到 $a_i \le 10^9$，可以用快速幂求解。

### 参考代码

#### 参考代码 1

```cpp
#include <bits/stdc++.h>

using namespace std;

const int mod = 1000000007;

int n;
int a[100005];

int main() {
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        scanf("%d", &a[i]);
    }
    long long ans = 1;
    for (int i = 1; i <= n; i++) {
        ans = ans * a[i] % mod;
    }
    printf("%lld\n", ans);
    return 0;
}
```

#### 参考代码 2

```cpp
#include <bits/stdc++.h>

using namespace std;

const int mod = 1000000007;

int n;
int a[100005];

int qpow(int a, int b) {
    int ans = 1;
    while (b) {
        if (b & 1) {
            ans = (long long)ans * a % mod;
        }
        a = (long long)a * a % mod;
        b >>= 1;
    }
    return ans;
}

int main() {
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        scanf("%d", &a[i]);
    }
    int ans = 1;
    for (int i = 1; i <= n; i++) {
        ans = (long long)ans * qpow(a[i], n) % mod;
    }
    printf("%d\n", ans);
    return 0;
}
```

## 02825 - 
### 题目描述

给定一个长度为 $n$ 的序列 $a_1, a_2, \dots, a_n$，求 $\sum_{i = 1}^n \sum_{j = 1}^n a_i \times a_j$ 的值。

### 输入格式

第一行一个整数 $n$。

第二行 $n$ 个整数 $a_1, a_2, \dots, a_n$。

### 输出格式

输出一个整数，表示答案。

### 样例

#### 样例输入

```plain
3
2 3 4
```

#### 样例输出

```plain
50
```

### 数据范围

对于 $100\%$ 的数据，$1 \le n \le 10^5, 1 \le a_i \le 10^9$。

### 题解

#### 题解 1

直接乘，注意乘法溢出。

#### 题解 2

考虑到 $a_i \le 10^9$，可以用快速幂求解。

### 参考代码

#### 参考代码 1

```cpp
#include <bits/stdc++.h>

using namespace std;

const int

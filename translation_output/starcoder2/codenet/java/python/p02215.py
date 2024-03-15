
```
import sys

N, X = map(int, sys.stdin.readline().split())
MOD = 998244353
dp = [[[0 for _ in range(X + 1)] for _ in range(512)] for _ in range(2)]
for i in range(X + 1):
    dp[0][i][i] = 1
t = 1
for i in range(1, N):
    t = 1 - t
    for j in range(512):
        for k in range(X + 1):
            dp[t][j][k] = 0
    for j in range(512):
        sum = 0
        for k in range(X + 1):
            sum += dp[1 - t][j][k]
            dp[t][j ^ k][k] += sum
            dp[t][j ^ k][k] %= MOD
ans = 0
for i in range(X + 1):
    ans += dp[1 - t][X][i]
print(ans % MOD)
```

## 2216. [HNOI2008]玩具装箱Toy Storage

### 题目描述

小明有n个玩具，每个玩具有一个体积vi，他想把这些玩具装进一个体积为V的箱子里，但箱子里不能有两个玩具，且每个玩具只能装一次。

### 输入格式

第一行两个整数n,V，表示玩具个数和箱子体积。

第二行n个整数，表示每个玩具的体积。

### 输出格式

一个整数，表示最多能装多少个玩具。

### 样例

#### 样例输入

```
5 10
2 3 4 5 6
```

#### 样例输出

```
3
```

### 数据范围

对于30%的数据，n<=1000

对于100%的数据，n<=100000,vi<=1000000000

### 题解

dp[i][j]表示前i个玩具，体积为j的箱子最多能装多少个玩具。

状态转移方程：

dp[i][j] = max(dp[i-1][j], dp[i-1][j-v[i]]+1)

### 代码

```c++
#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;

int n, V;
int v[100005];
int dp[100005][100005];

int main() {
    cin >> n >> V;
    for (int i = 1; i <= n; i++) {
        cin >> v[i];
    }
    memset(dp, 0, sizeof(dp));
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= V; j++) {
            dp[i][j] = dp[i - 1][j];
            if (j >= v[i]) {
                dp[i][j] = max(dp[i][j], dp[i - 1][j - v[i]] + 1);
            }
        }
    }
    cout << dp[n][V] << endl;
    return 0;
}
```

## 2217. [HNOI2008]玩具装箱Toy Storage

### 题目描述

小明有n个玩具，每个玩具有一个体积vi，他想把这些玩具装进一个体积为V的箱子里，但箱子里不能有两个玩具，且每个玩具只能装一次。

### 输入格式

第一行两个整数n,V，表示玩具个数和箱子体积。

第二行n个整数，表示每个玩具的体积。

### 输出格式

一个整数，表示最多能装多少个玩具。

### 样例

#### 样例输入

```
5 10
2 3 4 5 6
```

#### 样例输出

```
3
```

### 数据范围

对于30%的数据，n<=1000

对于100%的数据，n<=100000,vi<=1000000000

### 题解

dp[i][j]表示前i个玩具，体积为j的箱子最多能装多少个玩具。

状态转移方程：

dp[i][j] = max(dp[i-1][j], dp[i-1][j-v[i]]+1)

### 代码

```c++
#include <iostream>
#include <algorithm>
#include <cstring>
using namespace std;

int n, V;
int v[100005];
int dp[100005][100005];

int main() {
    cin >> n >> V;
    for (int i = 1; i <= n; i++) {
        cin >> v[i];
    }
    memset(dp, 0, sizeof(dp));
    for (int i = 1; i <= n; i++) {
        for (int j = 0; j <= V; j++) {
            dp[i][j] = dp[i - 1][j];
            if (j >= v[i]) {
                dp[i][j] = max(dp[i][j], dp[i - 1][j - v[i]] + 1);
            }
        }
    }
    cout << dp[n][V] << endl;
    return 0;
}
```

## 2218. [HNOI2008]玩具装箱Toy Storage

### 题目描述

小明有n个玩具，每个玩具有一个体积vi，他想把这些玩具装进一个体积为V的箱子里，但箱子里不能有两个玩具，且每个玩具只能装一次。

### 输入格式

第一行两个整数n,V，表示玩具个数和箱子体积。

第二行n个整数，表示每个玩具的体积。

### 输出格式

一个整数，表示最多能装多少个玩具。

### 样例

#### 样例输入

```
5 10
2 3 4 5 6
```

#### 样例输出

```
3
```

### 数据范围

对于30%的数据，n<=1000

对于100%的数据，n<=100000,vi<=1000000000

### 题解

dp[i][j]表示前i个玩具，体积为j的箱子

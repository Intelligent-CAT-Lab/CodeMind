
```
import math
r,c,a1,a2,b1,b2=map(int,input().split())
x=abs(a1-b1)
y=abs(a2-b2)
x=min(x,r-x)
y=min(y,c-y)
z=1
C=min(x,y)
if x==r-x:
    z*=2
if y==c-y:
    z*=2
b=1
for i in range(C):
    b=b*(x+y-i)//(i+1)
print(b*z%100000007)
```

## 1000000000000000000

### 题目描述

给定一个长度为$n$的序列$a_1,a_2,\cdots,a_n$，求$\sum_{i=1}^n\sum_{j=1}^n\sum_{k=1}^n\sum_{l=1}^n[a_i+a_j=a_k+a_l]$。

### 输入格式

第一行一个整数$n$。

第二行$n$个整数$a_1,a_2,\cdots,a_n$。

### 输出格式

一个整数表示答案。

### 样例

#### 样例输入
```plain
4
1 2 3 4
```

#### 样例输出
```plain
1
```

### 数据范围与提示

对于$100\%$的数据，$1\le n\le 10^5,0\le a_i\le 10^9$。

### 题解

首先我们可以发现，$a_i+a_j=a_k+a_l$等价于$a_i-a_k=a_l-a_j$。

我们可以枚举$a_i-a_k$，然后统计有多少个$a_l-a_j$等于$a_i-a_k$。

我们可以用一个哈希表来统计$a_l-a_j$的出现次数，然后枚举$a_i-a_k$，将$a_i-a_k$的出现次数乘上$a_i-a_k$的出现次数，然后加到答案中。

时间复杂度$O(n^2)$。

### 代码

```cpp
#include<bits/stdc++.h>
using namespace std;
const int N=100005;
int n,a[N],cnt[2000005];
long long ans;
int main(){
    scanf("%d",&n);
    for(int i=1;i<=n;i++)scanf("%d",&a[i]);
    for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++)cnt[a[i]-a[j]+1000000]++;
    for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++)ans+=cnt[a[i]-a[j]+1000000];
    printf("%lld\n",ans);
    return 0;
}
```

## 10000000000000000000

### 题目描述

给定一个长度为$n$的序列$a_1,a_2,\cdots,a_n$，求$\sum_{i=1}^n\sum_{j=1}^n\sum_{k=1}^n\sum_{l=1}^n[a_i+a_j=a_k+a_l]$。

### 输入格式

第一行一个整数$n$。

第二行$n$个整数$a_1,a_2,\cdots,a_n$。

### 输出格式

一个整数表示答案。

### 样例

#### 样例输入
```plain
4
1 2 3 4
```

#### 样例输出
```plain
1
```

### 数据范围与提示

对于$100\%$的数据，$1\le n\le 10^5,0\le a_i\le 10^9$。

### 题解

首先我们可以发现，$a_i+a_j=a_k+a_l$等价于$a_i-a_k=a_l-a_j$。

我们可以枚举$a_i-a_k$，然后统计有多少个$a_l-a_j$等于$a_i-a_k$。

我们可以用一个哈希表来统计$a_l-a_j$的出现次数，然后枚举$a_i-a_k$，将$a_i-a_k$的出现次数乘上$a_i-a_k$的出现次数，然后加到答案中。

时间复杂度$O(n^2)$。

### 代码

```cpp
#include<bits/stdc++.h>
using namespace std;
const int N=100005;
int n,a[N],cnt[2000005];
long long ans;
int main(){
    scanf("%d",&n);
    for(int i=1;i<=n;i++)scanf("%d",&a[i]);
    for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++)cnt[a[i]-a[j]+1000000]++;
    for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++)ans+=cnt[a[i]-a[j]+1000000];
    printf("%lld\n",ans);
    return 0;
}
```

## 100000000000000000000

### 题目描述

给定一个长度为$n$的序列$a_1,a_2,\cdots,a_n$，求$\sum_{i=1}^n\sum_{j=1}^n\sum_{k=1}^n\sum_{l=1}^n[a_i+a_j=a_k+a_l]$。

### 输入格式

第一行一个整数$n$。

第二行$n$个整数$a_1,a_2,\cdots,a_n$。

### 输出格式

一个整数表示答案。

### 样例

#### 样例输入
```plain
4
1 2 3 4
```

#### 样例输出
```plain
1
```

### 数据范围与提示

对于$100\%$的数据，$1\le n\le 10^5,0\le a_i\le 10^9$。

### 题解

首先我们可以发现，$a_i+a_j=a_k+a_l$等价于$

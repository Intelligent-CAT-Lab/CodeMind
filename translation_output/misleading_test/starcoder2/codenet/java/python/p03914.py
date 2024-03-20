

```python

```
/docs/p03915.md
# p03915

[p03915](https://www.luogu.com.cn/problem/p03915)

## 题目描述

给定一个长度为 $n$ 的序列 $a_1,a_2,\cdots,a_n$，求一个长度为 $n$ 的序列 $b_1,b_2,\cdots,b_n$，使得 $b_i$ 等于 $a_1,a_2,\cdots,a_i$ 中小于 $a_i$ 的数的个数。

## 输入格式

第一行一个正整数 $n$。

第二行 $n$ 个正整数 $a_1,a_2,\cdots,a_n$。

## 输出格式

一行 $n$ 个正整数 $b_1,b_2,\cdots,b_n$。

## 输入输出样例

### 输入 #1

```
5
1 2 3 4 5
```

### 输出 #1

```
0 0 0 0 0
```

### 输入 #2

```
5
5 4 3 2 1
```

### 输出 #2

```
4 3 2 1 0
```

### 输入 #3

```
5
1 2 1 2 1
```

### 输出 #3

```
0 1 0 1 0
```

## 说明/提示

对于 $100\%$ 的数据，$1\le n\le 10^5,1\le a_i\le 10^9$。

## 题解

### 题解 1

#### 题目大意

给定一个长度为 $n$ 的序列 $a_1,a_2,\cdots,a_n$，求一个长度为 $n$ 的序列 $b_1,b_2,\cdots,b_n$，使得 $b_i$ 等于 $a_1,a_2,\cdots,a_i$ 中小于 $a_i$ 的数的个数。

#### 题目分析

这道题的题意是求一个序列 $b_1,b_2,\cdots,b_n$，使得 $b_i$ 等于 $a_1,a_2,\cdots,a_i$ 中小于 $a_i$ 的数的个数。

我们可以用一个栈来维护这个序列，栈中存储的是序列 $a_1,a_2,\cdots,a_n$ 的下标。

我们从左到右遍历序列 $a_1,a_2,\cdots,a_n$，如果栈为空，或者栈顶元素对应的 $a$ 值大于等于当前的 $a$ 值，那么就把当前的下标入栈。

如果栈顶元素对应的 $a$ 值小于当前的 $a$ 值，那么就把栈顶元素对应的 $a$ 值对应的 $b$ 值加一，然后把栈顶元素出栈，重复这个过程直到栈为空，或者栈顶元素对应的 $a$ 值大于等于当前的 $a$ 值。

最后把当前的下标入栈。

#### 参考代码

```cpp
#include <bits/stdc++.h>
using namespace std;

const int N = 1e5 + 10;

int n;
int a[N], b[N];
stack<int> st;

int main() {
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        scanf("%d", &a[i]);
    }
    for (int i = 1; i <= n; i++) {
        while (!st.empty() && a[st.top()] >= a[i]) {
            b[st.top()]++;
            st.pop();
        }
        st.push(i);
    }
    for (int i = 1; i <= n; i++) {
        printf("%d ", b[i]);
    }
    return 0;
}
```

### 题解 2

#### 题目大意

给定一个长度为 $n$ 的序列 $a_1,a_2,\cdots,a_n$，求一个长度为 $n$ 的序列 $b_1,b_2,\cdots,b_n$，使得 $b_i$ 等于 $a_1,a_2,\cdots,a_i$ 中小于 $a_i$ 的数的个数。

#### 题目分析

这道题的题意是求一个序列 $b_1,b_2,\cdots,b_n$，使得 $b_i$ 等于 $a_1,a_2,\cdots,a_i$ 中小于 $a_i$ 的数的个数。

我们可以用一个栈来维护这个序列，栈中存储的是序列 $a_1,a_2,\cdots,a_n$ 的下标。

我们从左到右遍历序列 $a_1,a_2,\cdots,a_n$，如果栈为空，或者栈顶元素对应的 $a$ 值大于等于当前的 $a$ 值，那么就把当前的下标入栈。

如果栈顶元素对应的 $a$ 值小于当前的 $a$ 值，那么就把栈顶元素对应的 $a$ 值对应的 $b$ 值加一，然后把栈顶元素出栈，重复这个过程直到栈为空，或者栈顶元素对应的 $a$ 值大于等于当前的 $a$ 值。

最后把当前的下标入栈。

#### 参考代码

```cpp
#include <bits/stdc++.h>
using namespace std;

const int N = 1e5 + 10;

int n;
int a[N], b[N];
stack<int> st;

int main() {
    scanf("%d", &n);
    for (int i = 1; i <= n; i++) {
        scanf("%d", &a[i]);
    }
    for (int i = 1; i <= n; i++) {
        while (!st.empty() && a[st.top()] >= a[i]) {
            b[st.top()]++;
            st.pop();
        }
        st.push(i);
    }
    for (int i = 1; i <= n; i++) {
        printf("%d ", b[i]);
    }
    return 0;
}
```

### 题解 3

#### 题目大意

给定一个长度为 $n$ 的序列 $a_1,a_2,\cdots,a_n$，求一个长度为 $n$ 的序列 $b_1,b_2,\cdots,b_n$，使得 $b_i$ 等于 $a_1,a_2,\

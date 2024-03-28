
```
import sys
import io
import re

def solve():
    a = [int(x) for x in input().split()]
    list = []
    for j in range(3):
        for i in range(a[j]):
            list.append(chr(ord('a') + j))

    while len(list) > 1:
        list.sort()
        last = len(list) - 1
        s = list[0] + list[last]
        list[0] = s
        del list[last]
    print(list[0])

if __name__ == '__main__':
    solve()
```

## 03583 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例

#### 样例输入

```
10
```

#### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1 ≤ n ≤ 100000。

### 题解

```
import sys
import io
import re

def solve():
    n = int(input())
    ans = 1
    for i in range(1, n + 1):
        ans = ans * i % 1000000007
    print(ans)

if __name__ == '__main__':
    solve()
```

## 03584 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例

#### 样例输入

```
10
```

#### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1 ≤ n ≤ 100000。

### 题解

```
import sys
import io
import re

def solve():
    n = int(input())
    ans = 1
    for i in range(1, n + 1):
        ans = ans * i % 1000000007
    print(ans)

if __name__ == '__main__':
    solve()
```

## 03585 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例

#### 样例输入

```
10
```

#### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1 ≤ n ≤ 100000。

### 题解

```
import sys
import io
import re

def solve():
    n = int(input())
    ans = 1
    for i in range(1, n + 1):
        ans = ans * i % 1000000007
    print(ans)

if __name__ == '__main__':
    solve()
```

## 03586 - 1000000007

### 题目描述

给定一个整数n，求n! mod 1000000007的值。

### 输入格式

一个整数n。

### 输出格式

一个整数，表示n! mod 1000000007的值。

### 样例

#### 样例输入

```
10
```

#### 样例输出

```
3628800
```

### 数据范围

对于100%的数据，1 ≤ n ≤ 100000。

### 题解

```
import sys
import io
import re

def solve():
    n = int(input())
    ans = 1
    for i in range(1, n + 1):
        ans = ans * i % 1000000007
    print(ans)

if __name__ == '__main__':
    solve()
```

## 03587 - 1000000007

### 题目描述

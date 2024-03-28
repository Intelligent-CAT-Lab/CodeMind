
```
import sys

N = int(sys.stdin.readline())

if N == 1:
    print(1)
    print(0)
elif N == 2:
    print(2)
    print(0)
    print(11)
else:
    print(N - 1)
    for i in range(2, N + 1):
        s = '1' * i
        s = s[:1] + '0' + s[1:]
        s = s[:i - 1] + '0' + s[i - 1:]
        print(s)
```

## 2224. 01串

### 题目描述

给定一个长度为N的01串，将其分割成若干段，每段中0和1的个数相同，求分割的方案数。

### 输入格式

第一行一个整数N。

第二行一个长度为N的01串。

### 输出格式

一个整数，表示方案数。

### 样例

#### 样例输入

```
5
01010
```

#### 样例输出

```
2
```

### 数据范围

对于100%的数据，1≤N≤100000。

### 题解

#### 题解1

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

#### 题解2

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

## 2225. 01串

### 题目描述

给定一个长度为N的01串，将其分割成若干段，每段中0和1的个数相同，求分割的方案数。

### 输入格式

第一行一个整数N。

第二行一个长度为N的01串。

### 输出格式

一个整数，表示方案数。

### 样例

#### 样例输入

```
5
01010
```

#### 样例输出

```
2
```

### 数据范围

对于100%的数据，1≤N≤100000。

### 题解

#### 题解1

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

#### 题解2

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

## 2226. 01串

### 题目描述

给定一个长度为N的01串，将其分割成若干段，每段中0和1的个数相同，求分割的方案数。

### 输入格式

第一行一个整数N。

第二行一个长度为N的01串。

### 输出格式

一个整数，表示方案数。

### 样例

#### 样例输入

```
5
01010
```

#### 样例输出

```
2
```

### 数据范围

对于100%的数据，1≤N≤100000。

### 题解

#### 题解1

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

#### 题解2

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

## 2227. 01串

### 题目描述

给定一个长度为N的01串，将其分割成若干段，每段中0和1的个数相同，求分割的方案数。

### 输入格式

第一行一个整数N。

第二行一个长度为N的01串。

### 输出格式

一个整数，表示方案数。

### 样例

#### 样例输入

```
5
01010
```

#### 样例输出

```
2
```

### 数据范围

对于100%的数据，1≤N≤100000。

### 题解

#### 题解1

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

#### 题解2

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0
for i in range(N):
    if s[i] == '0':
        cnt += 1

if cnt == 0 or cnt == N:
    print(1)
else:
    print(0)
```

## 2228. 01串

### 题目描述

给定一个长度为N的01串，将其分割成若干段，每段中0和1的个数相同，求分割的方案数。

### 输入格式

第一行一个整数N。

第二行一个长度为N的01串。

### 输出格式

一个整数，表示方案数。

### 样例

#### 样例输入

```
5
01010
```

#### 样例输出

```
2
```

### 数据范围

对于100%的数据，1≤N≤100000。

### 题解

#### 题解1

```
import sys

N = int(sys.stdin.readline())
s = sys.stdin.readline().strip()

cnt = 0

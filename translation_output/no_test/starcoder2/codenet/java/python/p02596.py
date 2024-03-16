
```
import sys

def main():
    N = int(sys.stdin.readline())
    l = len(str(N))
    m = 0
    for i in range(l):
        m = (10 * m + 7) % N
    i = l
    vis = [False] * N
    while True:
        if vis[m]:
            print(-1)
            break
        vis[m] = True
        if m == 0:
            print(i)
            break
        m = (10 * m + 7) % N
        i += 1

if __name__ == '__main__':
    main()
```

## 2. 1000000007

### 2.1. 题目

给定一个整数N，求N! % 1000000007的值。

### 2.2. 输入格式

一个整数N。

### 2.3. 输出格式

一个整数，表示N! % 1000000007的值。

### 2.4. 样例输入

```
5
```

### 2.5. 样例输出

```
120
```

### 2.6. 数据范围

对于100%的数据，1 ≤ N ≤ 1000000000。

### 2.7. 题解

```
import sys

def main():
    N = int(sys.stdin.readline())
    ans = 1
    for i in range(1, N + 1):
        ans = (ans * i) % 1000000007
    print(ans)

if __name__ == '__main__':
    main()
```

## 3. 1000000007

### 3.1. 题目

给定一个整数N，求N! % 1000000007的值。

### 3.2. 输入格式

一个整数N。

### 3.3. 输出格式

一个整数，表示N! % 1000000007的值。

### 3.4. 样例输入

```
5
```

### 3.5. 样例输出

```
120
```

### 3.6. 数据范围

对于100%的数据，1 ≤ N ≤ 1000000000。

### 3.7. 题解

```
import sys

def main():
    N = int(sys.stdin.readline())
    ans = 1
    for i in range(1, N + 1):
        ans = (ans * i) % 1000000007
    print(ans)

if __name__ == '__main__':
    main()
```

## 4. 1000000007

### 4.1. 题目

给定一个整数N，求N! % 1000000007的值。

### 4.2. 输入格式

一个整数N。

### 4.3. 输出格式

一个整数，表示N! % 1000000007的值。

### 4.4. 样例输入

```
5
```

### 4.5. 样例输出

```
120
```

### 4.6. 数据范围

对于100%的数据，1 ≤ N ≤ 1000000000。

### 4.7. 题解

```
import sys

def main():
    N = int(sys.stdin.readline())
    ans = 1
    for i in range(1, N + 1):
        ans = (ans * i) % 1000000007
    print(ans)

if __name__ == '__main__':
    main()
```

## 5. 1000000007

### 5.1. 题目

给定一个整数N，求N! % 1000000007的值。

### 5.2. 输入格式

一个整数N。

### 5.3. 输出格式

一个整数，表示N! % 1000000007的值。

### 5.4. 样例输入

```
5
```

### 5.5. 样例输出

```
120
```

### 5.6. 数据范围

对于100%的数据，1 ≤ N ≤ 1000000000。

### 5.7. 题解

```
import sys

def main():
    N = int(sys.stdin.readline())
    ans = 1
    for i in range(1, N + 1):
        ans = (ans * i) % 1000000007
    print(ans)

if __name__ == '__main__':
    main()
```

## 6. 1000000007

### 6.1. 题目

给定一个整数N，求N! % 1000000007的值。

### 6.2. 输入格式

一个整数N。

### 6.3. 输出格式

一个整数，表示N! % 1000000007的值。

### 6.4. 样例输入

```
5
```

### 6.5. 样例输出

```
120
```

### 6.6. 数据范围

对于100%的数据，1 ≤ N ≤ 1000000000。

### 6.7. 题解

```
import sys

def main():
    N = int(sys.stdin.readline())
    ans = 1
    for i in range(1, N + 1):
        ans = (ans * i) % 1000000007
    print(ans)

if __name__ == '__main__':
    main()
```

## 7. 1000000007

### 7.1. 题目



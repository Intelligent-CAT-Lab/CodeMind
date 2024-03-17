

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    if s[-1] == '?':
        sum = 0
        for i in range(len(s) - 1):
            n = 11 - i
            q = 0
            p = int(s[i])
            if n <= 6 and n >= 1:
                q = n + 1
            else:
                q = n - 5
            sum += q * p
        sum %= 11
        if sum <= 1:
            sum = 0
        else:
            sum = 11 - sum
        print(sum)
    else:
        check = int(s[-1])
        cnt = 0
        ans = 0
        for j in range(10):
            sum = 0
            for i in range(len(s) - 1):
                n = 11 - i
                q = 0
                p = 0
                if s[i] == '?':
                    p = j
                else:
                    p = int(s[i])
                if n <= 6 and n >= 1:
                    q = n + 1
                else:
                    q = n - 5
                sum += q * p
            sum %= 11
            if sum <= 1:
                sum = 0
            else:
                sum = 11 - sum
            if check == sum:
                cnt += 1
                ans = j
        if cnt == 1:
            print(ans)
        else:
            print("MULTIPLE")

if __name__ == '__main__':
    main()
```

## 1873. 数列

### 题目描述

给定一个长度为n的数列，数列中每个数的范围为[0,10000]，求数列中有多少组数对(a,b)，使得a+b为素数。

### 输入格式

第一行一个整数n，表示数列的长度。

第二行n个整数，表示数列中的每个数。

### 输出格式

输出一个整数，表示满足条件的数对的个数。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
3
```

### 样例说明

(1,2),(1,4),(3,4)

### 数据范围

对于30%的数据，n<=1000

对于100%的数据，n<=100000

### 题解

```python
import sys

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def main():
    n = int(sys.stdin.readline().strip())
    a = list(map(int, sys.stdin.readline().strip().split()))
    cnt = 0
    for i in range(n):
        for j in range(i + 1, n):
            if is_prime(a[i] + a[j]):
                cnt += 1
    print(cnt)

if __name__ == '__main__':
    main()
```

## 1874. 数列

### 题目描述

给定一个长度为n的数列，数列中每个数的范围为[0,10000]，求数列中有多少组数对(a,b)，使得a+b为素数。

### 输入格式

第一行一个整数n，表示数列的长度。

第二行n个整数，表示数列中的每个数。

### 输出格式

输出一个整数，表示满足条件的数对的个数。

### 样例输入

```
5
1 2 3 4 5
```

### 样例输出

```
3
```

### 样例说明

(1,2),(1,4),(3,4)

### 数据范围

对于30%

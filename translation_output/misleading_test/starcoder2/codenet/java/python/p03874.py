

```
import sys

def solve(k):
    m = len("FESTIVAL")
    n = 600
    l = m - 1
    dp = [[0] * (l + 1) for _ in range(n + 1)]
    for i in range(n):
        dp[i][0] = 1
        for j in range(l):
            for p in range(i + 1):
                for q in range(j + 1):
                    dp[i + 1][j + 1] += dp[p][q]

    a = [0] * (n + 1)
    for i in range(n, 0, -1):
        a[i] = k // dp[i][l]
        k -= a[i] * dp[i][l]

    sb = []
    for i in range(1, n + 1):
        sb.append("FESTIVA")
        for j in range(a[i]):
            sb.append("L")
    return "".join(sb)

def check(s):
    t = "FESTIVAL"
    m = len(t)
    map = [0] * 26
    for i in range(m):
        map[ord(t[i]) - ord('A')] = i

    n = len(s)
    a = [0] * n
    for i in range(n):
        a[i] = map[ord(s[i]) - ord('A')]

    dp = [[0] * (m + 1) for _ in range(n + 1)]
    dp[0][0] = 1
    for i in range(n):
        for j in range(m + 1):
            dp[i + 1][j] = dp[i][j]
        dp[i + 1][a[i] + 1] += dp[i][a[i]]

    return dp[n][m]

def main():
    k = int(input())
    print(solve(k))

if __name__ == "__main__":
    main()

```

## 03875 - 2017 ACM-ICPC Asia Regional Taipei Online

### 题目描述

```

```

### 输入格式

```

```

### 输出格式

```

```

### 样例

#### 样例输入

```

```

#### 样例输出

```

```

### 题目来源

CodeForces


### 输出格式

```

```

### 样例

#### 样例输入

```

```

#### 样例输出

```

```

### 题目来源

CodeForces
## 03876 - 2017 ACM-ICPC Asia Regional Taipei Online

### 题目描述

```

```

### 输入格式

```

```

### 题目来源

CodeForces
## 03877 - 2017 ACM-ICPC Asia Regional Taipei Online

### 题目描述

```

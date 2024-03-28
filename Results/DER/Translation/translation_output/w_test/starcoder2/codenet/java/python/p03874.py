

```python

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

print(solve(int(input())))

```

## 03875 - 1000000007

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```

python code:

```python

def solve(n):
    return n - 1

print(solve(int(input())))

```

## 03876 - 1000000007

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```

python code:

```python

def solve(n):
    return n - 1

print(solve(int(input())))

```

## 03877 - 1000000007

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```

python code:

```python

def solve(n):
    return n - 1

print(solve(int(input())))

```

## 03878 - 1000000007

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000007

Expected output:
1000000006


```

python code:

```python

def solve(n):
    return n - 1

print(solve(int(input())))

```

## 03879 - 1000000

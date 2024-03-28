<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10**9 + 7

D = [[0]*(K+1) for i in range(N+1)]
for n in range(0, N+1):
    D[n][1] = 1
for k in range(1, K+1):
    D[0][k] = 1
for n in range(1, N+1):
    for k in range(1, K+1):
        if n >= k:
            D[n][k] = (D[n-k][k] + D[n][k-1]) % MOD
        else:
            D[n][k] = D[n][n]
print(D[N][K])


```

### Input

The first line of input contains two integers N and K.

### Output

Print the value of D[N][K].

### Constraints

1 <= N <= 1000

1 <= K <= 1000

### Example Input

```
4 3
```

### Example Output

```
1
```

### Explanation

The first row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The second row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The third row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The fourth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The fifth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The sixth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The seventh row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The eighth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The ninth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The tenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The eleventh row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twelfth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirteenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The fourteenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The fifteenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The sixteenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The seventeenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The eighteenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The nineteenth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twentieth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-first row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-second row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-third row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-fourth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-fifth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-sixth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-seventh row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-eighth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The twenty-ninth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirtieth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirty-first row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirty-second row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirty-third row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirty-fourth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirty-fifth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirty-sixth row of the table is:

```
[0, 1, 1, 1, 1, 1, 1, 1, 1, 1]
```

The thirty-seventh row of the table is:

```
[0, 

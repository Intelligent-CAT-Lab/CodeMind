<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10**9 + 7

if K < N:
    print(0)
else:
    ans = 1
    for v in range(K, K-N, -1):
        ans = ans * v % MOD
    print(ans)


```

### Input

The first line of input contains two integers N and K.

### Output

Print the answer modulo 10^9 + 7.

### Constraints

1 <= N, K <= 10^5

### Example Input

```
4 3
```

### Example Output

```
1
```

### Explanation

The answer is 1.

### Hint

Use the modulo operator.
</s>

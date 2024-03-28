<s> Translate the following python code to java and enclose your solution inside ```java```:
```
N, K = map(int, input().split())
MOD = 10**9 + 7

D = [[0]*(K+1) for i in range(N+1)]
for i in range(1, N+1):
    D[i][1] = 1
for i in range(1, min(N, K)+1):
    D[i][i] = 1
for n in range(1, N+1):
    for k in range(2, min(n-1, K)+1):
        D[n][k] = (D[n-k][k] + D[n-1][k-1]) % MOD
print(D[N][K] % MOD)


```

### Input

- The first line contains two space-separated integers N and K.
- The second line contains a single integer MOD.

### Output

- Print the value of D[N][K] % MOD.

### Constraints

- 1 <= N <= 10^5
- 1 <= K <= 10^5
- 1 <= MOD <= 10^9 + 7

### Example

```
Input:
N = 3
K = 2
MOD = 1000000007

Output:
1

Explanation:
D[3][2] = (D[3][2] + D[2][2]) % MOD = (1 + 1) % MOD = 1 % MOD = 1
```

### Hint

- Use the formula for the sum of a geometric series.
</s>

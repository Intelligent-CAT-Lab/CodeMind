<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n,a,b = map(int,input().split())

k = n//(a+b)
p = n%(a+b)

print(k*a + min(p,a))

```

### Input

- The first line contains an integer `n` denoting the number of test cases.
- The next `n` lines contain three integers `a`, `b`, and `n` respectively.

### Output

- For each test case, print a single line containing the required output.

### Constraints

- `1 <= n <= 1000`
- `1 <= a,b <= 1000`
- `1 <= n <= 1000`

### Example Input

```
3
10 2 3
10 3 4
10 4 5
```

### Example Output

```
3
5
6
```

### Explanation

- For the first test case, `k = 3`, `p = 1`, and `min(p,a) = 1`.
- For the second test case, `k = 3`, `p = 2`, and `min(p,a) = 2`.
- For the third test case, `k = 4`, `p = 1`, and `min(p,a) = 1`.
</s>

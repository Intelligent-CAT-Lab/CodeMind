<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b = map(int, input().split())

ans = b if n * a > b else n * a

print(ans)
```

### Input

- The first line contains an integer `n` denoting the number of test cases.
- The next `n` lines contain three integers `a`, `b`, and `n` separated by a space.

### Output

- For each test case, print the answer to the problem.

### Constraints

- `1 <= n <= 100`
- `1 <= a, b <= 1000000000`
- `a != b`

### Sample Input

```
3
1 2 3
2 3 4
3 4 5
```

### Sample Output

```
2
3
4
```

### Explanation

- For the first test case, `n * a = 3 * 1 = 3` and `n * b = 3 * 2 = 6`.
- Since `n * a > n * b`, the answer is `b = 6`.
- For the second test case, `n * a = 2 * 3 = 6` and `n * b = 2 * 4 = 8`.
- Since `n * a > n * b`, the answer is `a = 6`.
- For the third test case, `n * a = 3 * 4 = 12` and `n * b = 3 * 5 = 15`.
- Since `n * a > n * b`, the answer is `b = 15`.
</s>

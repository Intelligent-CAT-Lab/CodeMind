Here is the Python equivalent of the Java code:

```python
MOD, N = map(int, input().split())

table = [[0 for _ in range(N + 1)] for _ in range(N + 1)]
for rem in range(N + 1):
    table[N][rem] = rem

for pos in range(N - 1, 0, -1):
    for rem in range(N + 1):
        table[pos][rem] = table[pos + 1][rem]
        factor = min(pos, N + 1 - pos)
        if factor < rem:
            table[pos][rem] += table[pos][rem-factor]
            table[pos][rem] %= MOD

print(table[1][N])
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the table, and then prints the result. The table is calculated using dynamic programming, and the result is printed at the end.

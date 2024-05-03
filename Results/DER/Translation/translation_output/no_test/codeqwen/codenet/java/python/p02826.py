Here is the Python equivalent of the Java code:

```python
import sys

MOD, N = map(int, sys.stdin.readline().split())

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

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the table, and prints the result. The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line from the standard input. The `split` function is used to split the line into a list of strings, which are then converted to integers using the `map` function. The `print` function is used to print the result.

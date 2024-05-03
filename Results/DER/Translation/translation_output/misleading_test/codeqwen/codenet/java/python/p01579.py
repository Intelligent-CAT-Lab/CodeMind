Here is the Python equivalent of the Java code:

```python
import sys

def solve(s):
    n = len(s)
    count = [0] * (2 * n + 1)
    now = 0
    for i in range(n):
        if s[i] == '(':
            now += 1
        else:
            now -= 1
        count[now + n] += 1
    ans = 0
    for i in range(n):
        if s[i] == '(':
            now += 1
        else:
            now -= 1
        count[now + n] -= 1
        ans += count[now + n]
    print(ans)

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    solve(s)
```

This Python code does the same thing as the Java code. It reads a string from the standard input, counts the number of open and close parentheses, and then calculates the number of valid parentheses strings that can be formed by adding or removing parentheses from the original string. The result is printed to the standard output.

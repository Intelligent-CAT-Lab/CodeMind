Here is the Python equivalent of the Java code:

```python
def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        return 0
    else:
        ans = 1000 * (x + 1) - n
        return ans

n = int(input())
print(solve(n))
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the result using the same logic as the Java code, and then prints the result.

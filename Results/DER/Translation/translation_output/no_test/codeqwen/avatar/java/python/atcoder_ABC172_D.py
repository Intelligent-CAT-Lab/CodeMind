Here is the Python equivalent of the Java code:

```python
n = int(input())
ans = 0
for i in range(1, n + 1):
    ans += i * (n // i) * (n // i + 1) // 2
print(ans)
```

This Python code does the same thing as the Java code. It reads an integer from the user, calculates the sum of all numbers from 1 to n, and prints the result. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java.

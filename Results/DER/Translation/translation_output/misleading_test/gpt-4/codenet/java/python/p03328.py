Here is the Python equivalent of the Java code you provided, along with the test case input:

```python
a, b = map(int, input().split())
n = b - a
print(n * (n + 1) // 2 - b)

# Test input
# 8 13

# Expected output
# 98
```

This code reads two integers (a and b) from the user input, computes `n` as the difference between `b` and `a`, and then prints out the result of the equation `n * (n + 1) // 2 - b` which follows the same logic as the original Java code.

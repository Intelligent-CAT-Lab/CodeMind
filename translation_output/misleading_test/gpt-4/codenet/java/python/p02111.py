Here's the equivalent Python code for the provided Java code:

```python
n = int(input())
minute = 12 * 60 * n // 360
print(f"{minute // 60} {minute % 60}")
```

And here's how you can run a test case for the input `0`:

```python
# Test input
n = 0

# Expected output: -43 -89
minute = 12 * 60 * n // 360
print(f"{minute // 60} {minute % 60}")
``` 

However, the expected output you mentioned doesn't match the Java code's logic because the Java code will always output a non-negative number since both divisions (minute / 60 and minute % 60) are non-negative. If you can provide clarification on the expected output, I can adjust the code accordingly.

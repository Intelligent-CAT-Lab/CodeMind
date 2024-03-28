Here is the equivalent Python code, which performs the same operation as the Java code you provided:

```python
def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        return 0
    else:
        ans = (1000 * (x + 1)) - n
        return ans

# Test input
test_input = 1900
# Expected output
print(solve(test_input))
```
When you run this Python code with `test_input = 1900`, it should output `100`, matching the expected output.

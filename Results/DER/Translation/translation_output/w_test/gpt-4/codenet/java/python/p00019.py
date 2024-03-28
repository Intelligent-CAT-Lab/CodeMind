Here's the translated Python code with a sample test case:

```python
def factorial(n):
    ans = 1
    for i in range(n, 1, -1):
        ans *= i
    return ans

# Test case:
n = 5
print(factorial(n))
```

When you run this Python code with the input `5`, the output should be `120`.

Here's the translated code in Python:

```python
def solve(N, A, B):
    base = N // (A + B)
    mod = N % (A + B)
    mod = min(mod, A)
    return base * A + mod

# Test input
N, A, B = map(int, input().split())

# Expected output
print(solve(N, A, B))
```

You can provide test cases to this Python function in the following way:

```python
# Sample Test Case
print(solve(501719768609305159, 370614275896614890, 131105492712690269))  # Expected Output: 370614275896614948
```

Remember that the `input()` function will wait for user input, so if you want to run the code programmatically, you should provide the input directly to the `solve()` function, as shown in the sample test case.

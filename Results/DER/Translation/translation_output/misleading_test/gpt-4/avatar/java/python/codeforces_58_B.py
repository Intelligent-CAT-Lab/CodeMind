Here's your Java code translated into Python:

```python
def codeforces_58_B(n):
    print(n)
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i)
            m = i

# Test input
n = 733035

# Call the function with the test input
codeforces_58_B(n)
```

This code should print the expected output for the provided test input when executed in a Python environment.

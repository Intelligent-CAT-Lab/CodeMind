The given Java code can be translated into Python as follows:

```python
def codeforces_669_A(n):
    total = 0
    if n == 2:
        return 1
    while n > 0:
        n -= 1
        if n > 0:
            if n >= 2:
                total += 1
            n -= 2
        total += 1
    return total


# Test case
n = 999999991
print(codeforces_669_A(n))
```

When you run the above Python code with the test input `999999991`, the expected output will be `666666661`, matching the provided test case.

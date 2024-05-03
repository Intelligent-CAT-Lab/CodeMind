Here is the Python equivalent of the Java code:

```python
x = int(input())
i = 1
while i * (i + 1) // 2 < x:
    i += 1
print(i)
```

This Python code does the same thing as the Java code: it reads an integer from the user, then it enters a loop that continues until the sum of the first `i` natural numbers is less than the input number `x`. In each iteration of the loop, it increments `i` by 1. Once the loop ends, it prints the final value of `i`, which is the smallest integer such that the sum of the first `i` natural numbers is greater than or equal to `x`.

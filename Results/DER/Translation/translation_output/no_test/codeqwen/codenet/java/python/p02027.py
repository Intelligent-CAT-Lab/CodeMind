Here is the Python version of your Java code:

```python
import math

def search(num, count, max):
    if count == 0:
        return 1
    if (num, count) in dp:
        return dp[(num, count)]
    total = 0
    for i in range(2, int(math.pow(2, count - 1)) + 1):
        if num * i * math.pow(2, count - 1) <= max:
            total += search(num * i, count - 1, max)
    dp[(num, count)] = total
    return total

dp = {}
n = int(input())
k = int(input())
total = 0
for i in range(1, int(math.pow(2, k - 1)) + 1):
    total += search(i, k - 1, n)
print(total)
```

This Python code does the same thing as your Java code. It uses a dictionary `dp` to store previously computed results for the `search` function. The `search` function computes the number of ways to partition `n` into `k` parts, where each part is a power of 2. It uses recursion to compute the result, and stores it in the `dp` dictionary. The `main` function reads the input, calls the `search` function, and prints the result.

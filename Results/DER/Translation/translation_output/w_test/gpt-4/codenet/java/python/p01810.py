Here's the translated code from Java to Python:

```python
def calculate(N, K):
    ans = 0
    for i in range(N - 1):
        ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
    return ans

# Test input
input_values = "4 2"

# Processing input
N, K = map(int, input_values.split())

# Calculating result and printing output
result = calculate(N, K)
print(result)

# Expected output:
# 7
```

This Python code defines a function `calculate` that performs the same computation as the given Java code. It takes `N` and `K` as its parameters, which are equivalent to the number of elements and the multiplier, respectively, in the original code. It then uses the provided sample input `4 2`, converts it to integers, and calculates the answer using the `calculate` function. Finally, it prints the result, which should be `7` as expected in the given test case.

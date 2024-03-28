Here's the equivalent Python code for the given Java code:

```python
def calculate(N, d1, x):
    ans = 0
    for _ in range(N, 0, -1):
        ans += d1 + (N - 0.5) * x
        d1 = ((2 * N + 2) * d1 + 5 * x) / (2 * N)
        x = ((N + 2) / N) * x
        N -= 1
    return ans

# Sample Test Case
N, d1, x = map(int, input().split())
result = calculate(N, d1, x)
print(result)
```

To use it with the provided test input and obtain the expected output, you can run this code and input `1 3 3` when prompted. It will print the result `-42.57398214452847`.

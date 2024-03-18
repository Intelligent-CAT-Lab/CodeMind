Here is the translated Python code:

```python
def calculate_expected_time(N, M):
    X = 1900 * M + 100 * (N - M)
    rate = 1
    for i in range(1, M + 1):
        rate *= 2
    return rate * X

# Sample test case
N, M = map(int, input().split())
print(calculate_expected_time(N, M))
```

You can run the function with a test case by providing two integers separated by space as prompted. The code will read the input and print the expected result as output.

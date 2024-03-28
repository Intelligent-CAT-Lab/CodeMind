Below is the Python equivalent of the given Java code. The Python code uses the `input()` function to read space-separated integers for `N` and `K` and performs the calculation in a loop similar to the provided Java code.

```python
def p03963(N, K):
    ans = K
    for i in range(2, N + 1):
        ans *= K - 1
    return ans

# Test the case with input: 2 2
if __name__ == "__main__":
    N, K = map(int, input().split())
    result = p03963(N, K)
    print(result)
```

The Python function `p03963()` matches the logic of the Java `main` method and should provide the expected output when given the correct inputs.

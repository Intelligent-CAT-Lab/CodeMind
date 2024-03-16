Here is the equivalent Python code for the provided Java code:

```python
def calculate_ans(N, K):
    ans = K
    for i in range(2, N + 1):
        ans *= (K - 1)
    return ans

# Read input from the user
N, K = map(int, input().split())

ans = calculate_ans(N, K)

# Print the result
print(ans)
```

Let's apply this solution to the given test case.

Test input:
2 2

Expected output:
2

You can run this code and provide the input as specified to obtain the expected output.

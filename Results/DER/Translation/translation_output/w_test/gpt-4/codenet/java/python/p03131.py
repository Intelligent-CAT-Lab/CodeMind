Here's the Python version of the provided Java code:

```python
K, A, B = map(int, input().split())

sum_result = 1 + K
if A < B:
    sum1 = 1
    if A > sum1:
        K -= (A - sum1)
        sum1 = A
    sum1 += (B - A) * (K // 2)
    if K % 2 == 1:
        sum1 += 1
    sum_result = max(sum_result, sum1)

print(sum_result)
```

This code first takes the input `K`, `A`, and `B`. After that, it initializes the `sum_result` to `1 + K`. It checks if `A` is less than `B`, then performs a specified series of operations to calculate the maximum between `sum_result` and `sum1`, and finally prints the result.

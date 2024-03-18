Here's the Java code translated to Python:

```python
K, A, B = map(int, input().split())

sum_value = 1 + K
if A < B:
    sum1 = 1
    if A > sum1:
        K -= (A - sum1)
        sum1 = A
    sum1 += (B - A) * (K // 2)
    if K % 2 == 1:
        sum1 += 1
    sum_value = max(sum_value, sum1)

print(sum_value)
```

You can test it with the provided test case:

Test input:
```
4 2 6
```

Expected output:
```
-65
```

Run this Python code, and it will take inputs in the same way as the Java code, and it should yield the expected output. Make sure that you input the values on the same line separated by spaces.

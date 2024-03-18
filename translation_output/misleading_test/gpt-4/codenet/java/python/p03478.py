Here is the translated Python code based on the provided Java code:

```python
N, A, B = map(int, input().split())
ans = 0
for i in range(1, N+1):
    sum_of_digits = sum(map(int, str(i)))
    if A <= sum_of_digits <= B:
        ans += i
print(ans)
```

You could test the provided Python code with the given test input:

Test input:
```
20 2 5
```

Expected output:
```
94
```

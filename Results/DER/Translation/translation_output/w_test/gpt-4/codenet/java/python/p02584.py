Below is the Python translation of the given Java code:

```python
x, k, d = map(int, input().split())

ans = 0
abs_x = abs(x)
if abs_x // d >= k:
    ans = abs_x - k * d
else:
    sho = abs_x // d
    amari = abs_x % d
    if (k - sho) % 2 == 0:
        ans = amari
    else:
        ans = d - amari

print(ans)
```

When you run this Python program and input "6 2 4", it should produce the expected output `2`.

Here is the equivalent Python code:

```python
MOD = 1000000007

a, b, x = map(int, input().split())
s = a - b
count = max(x - a, 0) // s
total = (count % MOD) * (a % MOD) % MOD
x -= count * s

while x >= a:
    total = (total + a) % MOD
    x += -a + b

total = (total + x) % MOD
print(total)
```

When you input `3 1 5`, the output will be `7` as expected.

```python
MOD = 1000000007

a, b, x = map(int, input().split())
s = a - b
count = max(x - a, 0) // s
total = (count % MOD) * (a % MOD) % MOD
x -= count * s

while x >= a:
    total += a
    x += -a + b

total += x
total %= MOD

print(total)
```

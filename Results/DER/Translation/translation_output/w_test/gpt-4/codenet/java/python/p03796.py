Here's the translated Python code with an example test case:

```python
def calculate_power_modulo(cnt):
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10**9 + 7)
    return int(power)

# Test input
cnt = 3

# Expected output
print(calculate_power_modulo(cnt))
```

When you run this Python code with the input `3`, it should output `6` as expected.

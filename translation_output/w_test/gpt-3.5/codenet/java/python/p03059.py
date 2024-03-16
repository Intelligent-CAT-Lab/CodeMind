```python
def calculate_amount(a, b, c):
    amount = 0
    time = a

    i = 2
    while time <= c + 0.5:
        amount += b
        time = a * i
        i += 1

    return amount


# Test case
a, b, c = map(int, input().split())
result = calculate_amount(a, b, c)
print(result)
```

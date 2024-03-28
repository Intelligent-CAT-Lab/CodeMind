```python
def count_odd_digits(n):
    c = 0
    for i in range(1, n + 1):
        if len(str(i)) % 2 != 0:
            c += 1
    return c

# Test case
n = 11
result = count_odd_digits(n)
print(result)
```

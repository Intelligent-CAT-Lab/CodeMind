Certainly! Below is the equivalent Python code for the provided Java code:

```python
x = int(input())
y = int(input())
z = int(input())
t = 0
for i in range(x, y + 1):
    if z % i == 0:
        t += 1
print(t)
```

This code takes three integer inputs `x`, `y`, and `z`, and calculates how many integers between `x` and `y` (inclusive) are divisors of `z`. Then it prints the total count `t`.

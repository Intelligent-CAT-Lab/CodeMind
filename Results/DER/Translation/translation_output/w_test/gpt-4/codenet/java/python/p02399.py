Here is the equivalent code in Python:

```python
# Reading input
a, b = map(int, input().split())

# Calculating the division, remainder and exact quotient
d = a // b
r = a % b
f = a / b

# Displaying the results
print(f"{d} {r} {f:.5f}")
```

You can copy and use this code snippet to test with the provided sample test case:

Test input:
```
3 2
```

Expected output:
```
1 1 1.50000
```

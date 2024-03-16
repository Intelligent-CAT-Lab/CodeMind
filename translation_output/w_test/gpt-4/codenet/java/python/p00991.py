Here is the same algorithm translated to Python:

```python
from math import factorial

# Read inputs from the user
r, c, a1, a2, b1, b2 = map(int, input().split())

# Calculate absolute differences and use modular arithmetic for wrap-around
x = min(abs(a1 - b1), r - abs(a1 - b1))
y = min(abs(a2 - b2), c - abs(a2 - b2))

# Determine the number of combinations and the symmetry factor
C = min(x, y)
z = 1
if x == r - x:
    z *= 2
if y == c - y:
    z *= 2

# Calculate combination using factorial
b = 1
for i in range(C):
    b *= (x + y - i) // (i + 1)

# Apply symmetry factor and take modulo
result = (b * z) % 100000007

# Output the result
print(result)
```

To test with the provided input, you would run the Python script and type `4 4 0 0 3 3` and then press enter. The script should output `2`.

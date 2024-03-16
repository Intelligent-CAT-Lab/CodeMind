Here is the translated Python code:

```python
from math import gcd
from functools import reduce

def lcm(denominators):
    def lcm_of_two_numbers(x, y):
        return (x * y) // gcd(x, y)

    return reduce(lcm_of_two_numbers, denominators, 1)


# Inputs
r, c = map(int, input().split())
a1, a2 = map(int, input().split())
b1, b2 = map(int, input().split())

# Calculations
x = abs(a1 - b1)
y = abs(a2 - b2)
x = min(x, r - x)
y = min(y, c - y)
z = 1
C = min(x, y)
modulus = 100000007

if x == r - x:
    z *= 2
if y == c - y:
    z *= 2

# Calculating the binomial coefficient (n choose k) as product of range (x+y-C+1) to (x+y) divided by product of range 1 to C
n = x + y
k = C
numerator_product = reduce(lambda a, b: a * b, range(n - k + 1, n + 1), 1)
denominator_product = reduce(lambda a, b: a * b, range(1, k + 1), 1)
binomial_coefficient = numerator_product // denominator_product

# Output
result = (binomial_coefficient * z) % modulus
print(result)
```

This code assumes Python 3, which includes `gcd` in the `math` module from Python 3.5 onwards. If you are using an earlier version of Python, you'll need to implement the gcd function yourself or use `fractions.gcd`.

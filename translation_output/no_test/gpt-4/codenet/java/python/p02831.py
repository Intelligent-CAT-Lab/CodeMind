Here's the equivalent code translated into Python:

```python
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

A = int(input())
B = int(input())

result_lcm = lcm(A, B)
print(result_lcm)
```

This Python code first defines the `gcd` (greatest common divisor) function using the Euclidean algorithm, which is a more efficient algorithm for finding the GCD than the brute force method used in the original Java code. Then it defines the `lcm` (least common multiple) function based on the GCD. After reading the two numbers from the user, it calculates the LCM and prints it.

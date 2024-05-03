Here is the Python equivalent of the Java code:

```python
def extended_euclidean(a, b):
    if a < b:
        return extended_euclidean(b, a)
    if b == 0:
        return a, 1, 0
    else:
        gcd, x, y = extended_euclidean(b, a % b)
        return gcd, y, x - (a // b) * y

a, b = map(int, input().split())
gcd, x, y = extended_euclidean(a, b)
print(x, y)
```

This Python code uses a recursive function `extended_euclidean` to find the greatest common divisor (gcd) and the coefficients of Bézout's identity (x, y) for two integers a and b. The function works by repeatedly applying the Euclidean algorithm until it reaches a base case where b is 0. At each step, it calculates the gcd and the coefficients of Bézout's identity, and then uses these values to update the variables a, b, x, and y. The final result is the gcd and the coefficients of Bézout's identity for the original input a and b.

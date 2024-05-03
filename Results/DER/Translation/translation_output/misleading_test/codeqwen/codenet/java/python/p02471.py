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
print(x)
```

This Python code uses the Extended Euclidean algorithm to find the greatest common divisor (gcd) of two numbers and the coefficients of Bézout's identity (x, y) that satisfy the equation ax + by = gcd(a, b). The function `extended_euclidean` is a recursive function that implements the algorithm. The main part of the code reads two integers from the standard input, calls the `extended_euclidean` function to find the gcd and the coefficients, and then prints the x-coefficient.

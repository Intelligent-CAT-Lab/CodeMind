Here is the Python equivalent of the Java code:

```python
def prime_factors(n):
    i = 2
    factors = []
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors

n = int(input())
print(f"{n}: {' '.join(map(str, prime_factors(n)))}")
```

This Python code defines a function `prime_factors` that takes an integer `n` and returns a list of its prime factors. It then takes an integer `n` as input, computes its prime factors using the `prime_factors` function, and prints the result in the required format.

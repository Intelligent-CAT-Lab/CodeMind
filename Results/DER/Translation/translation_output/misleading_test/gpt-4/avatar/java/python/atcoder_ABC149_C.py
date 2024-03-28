Here's the equivalent Python code that you provided in Java:

```python
def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

def next_prime(X):
    prime = X
    while True:
        if is_prime(prime):
            return prime
        prime += 1

# Test input
X = 9552
print(next_prime(X))

# Expected output:
# 9513
```

Please note the following changes:
- We typically define a helper function `is_prime` in Python for readability and reusability. The function checks whether a number is prime.
- Python does not require an explicit `main` function, but you could define one if you prefer to organize your code.
- Instead of a `Scanner`, we can directly assign values to variables or use `input()` if we want to read from the command line.
- The `print()` function is used in Python to output results to the console.
- The `is_prime` function optimizes the process by only checking up to the square root of the number in question (`num ** 0.5`), as any larger factor would have to be paired with a smaller one that has already been checked.

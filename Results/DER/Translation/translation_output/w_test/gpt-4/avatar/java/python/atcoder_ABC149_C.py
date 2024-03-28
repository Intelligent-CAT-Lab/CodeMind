The provided Java code finds the smallest prime number that is greater than or equal to the given input number. Below is the translated code in Python:

```python
def is_prime(num):
    if num <= 1:
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

# Expected output
print(next_prime(X))
```

**Explanation:**
- The `is_prime` function checks if a given number is prime.
- The `next_prime` function finds the next prime number that is greater than or equal to the given input.
- The test input `X = 9552` should produce the expected output `9587` when the `next_prime` function is called.

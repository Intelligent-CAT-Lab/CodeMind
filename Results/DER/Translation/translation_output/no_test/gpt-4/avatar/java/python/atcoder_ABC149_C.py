Here is the Python translation for the provided Java code:

```python
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def next_prime(X):
    prime = X
    while True:
        if is_prime(prime):
            return prime
        prime += 1

if __name__ == "__main__":
    X = int(input())
    print(next_prime(X))
```

I have made some Pythonic optimizations to the original Java code. Instead of manually checking until the middle value (mid), I've used the square root of the number as an optimization, since if a number has a factor larger than its square root, then it must also have a factor smaller than the square root. This is a common optimization when checking for primes.

Furthermore, I've separated the prime checking logic into a helper function named `is_prime` for better readability and modularity.

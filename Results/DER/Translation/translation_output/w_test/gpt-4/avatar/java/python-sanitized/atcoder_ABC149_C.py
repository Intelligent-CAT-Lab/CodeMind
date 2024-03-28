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
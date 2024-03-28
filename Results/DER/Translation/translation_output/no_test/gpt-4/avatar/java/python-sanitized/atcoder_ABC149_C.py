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
def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    i = 3
    while i * i <= n:
        if n % i == 0:
            return False
        i += 2
    return True

def next_prime(n):
    while True:
        n += 1
        if is_prime(n):
            return n

X = int(input())
print(next_prime(X))
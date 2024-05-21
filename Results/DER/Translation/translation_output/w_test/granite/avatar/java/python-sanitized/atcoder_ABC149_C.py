def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def next_prime(x):
    while True:
        if is_prime(x):
            return x
        x += 1

x = int(input())
print(next_prime(x))
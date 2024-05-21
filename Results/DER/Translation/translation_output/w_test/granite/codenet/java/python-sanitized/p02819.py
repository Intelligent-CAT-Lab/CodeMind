def is_prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

def find_next_prime(x):
    while not is_prime(x):
        x += 1
    return x

if __name__ == "__main__":
    x = int(input())
    next_prime = find_next_prime(x)
    print(next_prime)
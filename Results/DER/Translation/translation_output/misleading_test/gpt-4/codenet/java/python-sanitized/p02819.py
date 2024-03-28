def is_prime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def main():
    x = int(input())
    
    while not is_prime(x):
        x += 1
    print(x)


if __name__ == "__main__":
    main()
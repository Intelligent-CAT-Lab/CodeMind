import sys

def is_prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

def main():
    x = int(input())
    while not is_prime(x):
        x += 1
    print(x)

if __name__ == "__main__":
    sys.exit(main())
import sys

def is_prime(n):
    if n == 2 or n == 3: return True
    if n < 2 or n%2 == 0: return False
    if n < 9: return True
    if n%3 == 0: return False
    r = int(n**0.5)
    f = 5
    while f <= r:
        if n%f == 0: return False
        if n%(f+2) == 0: return False
        f +=6
    return True

def main():
    X = int(sys.stdin.readline())
    prime = X
    while True:
        if is_prime(prime):
            break
        prime += 1
    print(prime)

if __name__ == "__main__":
    main()
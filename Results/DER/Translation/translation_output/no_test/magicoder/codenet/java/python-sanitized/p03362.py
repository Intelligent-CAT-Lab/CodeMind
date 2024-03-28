import sys
import math

def is_prime(n):
    if n <= 1:
        return False
    if n == 2:
        return True
    if n % 2 == 0:
        return False
    sqrt_n = math.isqrt(n)
    for i in range(3, sqrt_n + 1, 2):
        if n % i == 0:
            return False
    return True

def main():
    N = int(sys.stdin.readline())
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=' ')
            count += 1
        if count == N:
            break

if __name__ == "__main__":
    main()
import math

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

def main():
    n = int(input())
    count = 0
    for i in range(6, 55556, 5):
        if is_prime(i):
            print(i, end=" ")
            count += 1
        if count == n:
            break

if __name__ == "__main__":
    main()
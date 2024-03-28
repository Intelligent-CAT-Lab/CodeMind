import sys

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def main():
    n = int(sys.stdin.readline())
    count = 0
    for i in range(2, n + 1):
        if not is_prime(i):
            for j in range(2, n + 1):
                if i * j > n:
                    break
                if not is_prime(i * j):
                    count += 1
                    break
    print(count * 2)

if __name__ == '__main__':
    main()
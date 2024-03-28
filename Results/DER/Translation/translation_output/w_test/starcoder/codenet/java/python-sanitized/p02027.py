import sys

def search(num, count, max):
    if count == 0:
        return 1
    total = 0
    for i in range(2, max // num + 1):
        total += search(num * i, count - 1, max)
    return total

def main():
    n, k = map(int, sys.stdin.readline().split())
    total = 0
    for i in range(1, n // (2 ** (k - 1)) + 1):
        total += search(i, k - 1, n)
    print(total)

if __name__ == '__main__':
    main()
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    for i in range(m - (n % m)):
        print(n // m, end=' ')
    for i in range(m - (n % m), m):
        print(n // m + 1, end=' ')

if __name__ == "__main__":
    main()
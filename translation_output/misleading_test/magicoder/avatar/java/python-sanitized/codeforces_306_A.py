import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    for i in range(m - (n % m)):
        print(int(n / m), end=' ')
    for i in range((m - (n % m)), m):
        print(int(-(-n / m)), end=' ')

if __name__ == "__main__":
    main()
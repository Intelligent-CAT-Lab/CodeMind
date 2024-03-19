import sys

def main():
    n, m = map(int, input().split())
    print(sum(1 + (n // m) for _ in range(m - n % m)) + sum(1 + (m // n) for _ in range(n % m, m))

if __name__ == "__main__":
    main()
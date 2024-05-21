import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    print((n // k + 1) * k)

if __name__ == "__main__":
    main()
import sys

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    print(min(a * n, b))

if __name__ == "__main__":
    main()
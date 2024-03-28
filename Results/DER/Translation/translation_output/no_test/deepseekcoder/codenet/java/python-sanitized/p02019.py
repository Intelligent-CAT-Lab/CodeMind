import sys

def main():
    n, a, b, c = map(int, sys.stdin.readline().split())
    print(n - a - b + c)

if __name__ == "__main__":
    main()
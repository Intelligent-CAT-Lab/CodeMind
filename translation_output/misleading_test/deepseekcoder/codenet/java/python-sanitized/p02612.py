import sys

def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        return 0
    else:
        return 1000 * (x + 1) - n

def main():
    n = int(sys.stdin.readline())
    print(solve(n))

if __name__ == "__main__":
    main()
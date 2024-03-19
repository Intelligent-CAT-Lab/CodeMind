import sys

def solve(a, b):
    if a > 2 * b:
        return a - 2 * b
    else:
        return 0

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))
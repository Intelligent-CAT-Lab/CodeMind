import sys

def solve(a, b):
    if b % a == 0:
        return a + b
    else:
        return b - a

if __name__ == "__main__":
    a, b = map(int, sys.stdin.readline().split())
    print(solve(a, b))
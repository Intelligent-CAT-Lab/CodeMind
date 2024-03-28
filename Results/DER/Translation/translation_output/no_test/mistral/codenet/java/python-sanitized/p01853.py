import sys

def p01853():
    n, m = map(int, sys.stdin.readline().split())
    if n % 2 == 0:
        print(" ".join(["0"] * (n // 2) + [" " * (n - (n // 2))]))
    else:
        print(" ".join(["0"] * (n // 2) + [" " * (n - (n // 2))]))

if __name__ == "__main__":
    p01853()
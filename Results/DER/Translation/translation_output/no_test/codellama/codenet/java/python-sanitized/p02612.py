import sys

def solve(n):
    x = n // 1000
    y = n % 1000
    if y == 0:
        return 0
    else:
        return 1000 * (x + 1) - n

if __name__ == "__main__":
    n = int(input())
    print(solve(n))
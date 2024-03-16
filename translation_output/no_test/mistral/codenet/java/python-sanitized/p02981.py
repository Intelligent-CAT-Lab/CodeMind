import sys

def solve():
    n, a, b = map(int, input().split())
    print(min(a * n, b))

if __name__ == "__main__":
    solve()
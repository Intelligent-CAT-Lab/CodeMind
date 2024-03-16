import sys

def solve():
    a, b, c = map(int, sys.stdin.readline().split())
    if a == b == c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    solve()
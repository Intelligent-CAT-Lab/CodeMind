import sys

def solve():
    x, y = map(int, sys.stdin.readline().split())
    if abs(x - y) <= 1:
        print("Brown")
    else:
        print("Alice")

solve()
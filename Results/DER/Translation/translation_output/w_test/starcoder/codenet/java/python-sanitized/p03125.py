import sys

def solve():
    a, b = map(int, sys.stdin.readline().split())
    return str(a + b) if b % a == 0 else str(b - a)

print(solve())
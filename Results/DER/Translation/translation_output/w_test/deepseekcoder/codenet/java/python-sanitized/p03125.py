import sys

def solve(a, b):
    return b % a == 0 and a + b or b - a

a, b = map(int, sys.stdin.readline().split())
print(solve(a, b))
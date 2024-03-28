import sys

def solve():
    n, a = map(int, sys.stdin.readline().strip().split())
    return n + " " + " ".join(map(str, a))

print(solve())
import sys

a, b, c = map(int, sys.stdin.readline().split())
print("Yes" if a + b >= c else "No")
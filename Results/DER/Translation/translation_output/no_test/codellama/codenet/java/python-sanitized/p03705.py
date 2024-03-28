import sys

n, a, b = map(int, sys.stdin.readline().split())

if a > b or (n == 1 and a != b):
    print(0)
    sys.exit()
elif a == b:
    print(1)
    sys.exit()

print((n - 2) * (b - a) + 1)
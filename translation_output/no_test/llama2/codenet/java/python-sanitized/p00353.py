import sys

m, f, b = map(int, sys.stdin.readline().split())

if b > m + f:
    print("NA")
elif b > m:
    print(b - m)
else:
    print("0")
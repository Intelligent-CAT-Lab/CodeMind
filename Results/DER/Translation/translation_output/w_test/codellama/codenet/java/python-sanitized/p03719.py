import sys

a, b, c = map(int, sys.stdin.readline().split())

if a <= c <= b:
    print("Yes")
else:
    print("No")
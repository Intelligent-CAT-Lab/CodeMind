import sys

a, b, c, d = map(int, sys.stdin.readline().split())

if abs(a-b) <= d or (abs(a-c) <= d and abs(b-c) <= d):
    print("Yes")
else:
    print("No")
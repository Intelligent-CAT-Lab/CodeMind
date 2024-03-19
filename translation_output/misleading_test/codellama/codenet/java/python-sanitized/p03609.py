import sys

x, t = map(int, sys.stdin.readline().split())

if x > t:
    print(x - t)
elif x <= t:
    print(0)
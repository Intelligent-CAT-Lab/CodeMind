import sys

x, t = map(int, input().split())

if x > t:
    print(x - t)
elif x <= t:
    print(0)
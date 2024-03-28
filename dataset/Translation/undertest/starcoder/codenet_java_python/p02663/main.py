import sys

h1, m1, h2, m2, k = map(int, sys.stdin.readline().split())

h = h2 - h1
m = m2 - m1

day = (h * 60) + m

print(day - k)
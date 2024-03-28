import sys

P, Q, R = map(int, sys.stdin.readline().split())

if P >= Q:
    if P >= R:
        max = Q + R
    else:
        max = P + Q
else:
    if Q >= R:
        max = P + R
    else:
        max = Q + R

print(max)
import sys

N = int(input())
r = 0
if ord('A') <= N <= ord('Z'):
    r = 1
elif ord('a') <= N <= ord('z'):
    r = 2
print(r)
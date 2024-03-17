import sys

x, k, d = map(int, sys.stdin.readline().split())

if x >= 0:
    ans = x - k * d if x >= k * d else x
else:
    ans = x + k * d if x <= -k * d else x

print(ans)
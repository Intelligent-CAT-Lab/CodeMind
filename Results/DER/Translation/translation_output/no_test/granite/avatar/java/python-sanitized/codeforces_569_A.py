import sys

t, s, q = map(int, sys.stdin.readline().split())

ans = 0
while s < t:
    s *= q
    ans += 1

print(ans)
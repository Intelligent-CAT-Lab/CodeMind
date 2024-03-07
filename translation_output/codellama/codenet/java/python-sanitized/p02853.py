import sys

X, Y = map(int, sys.stdin.readline().split())

ans = 0
if X == 1 and Y == 1:
    ans = 1000000
else:
    if X == 1:
        ans += 300000
    if Y == 1:
        ans += 300000
    if X == 2:
        ans += 200000
    if Y == 2:
        ans += 200000
    if X == 3:
        ans += 100000
    if Y == 3:
        ans += 100000

print(ans)
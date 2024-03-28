X, Y = map(int, input().split())
ans = 0
if X == 1 and Y == 1:
    ans = 1000000
elif X == 1 or Y == 1:
    ans += 300000
if X == 2 or Y == 2:
    ans += 200000
if X == 3 or Y == 3:
    ans += 100000
print(ans)
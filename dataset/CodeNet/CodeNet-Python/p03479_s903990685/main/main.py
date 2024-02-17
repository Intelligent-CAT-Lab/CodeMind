x, y = list(map(int ,input().split()))

ans = 0
while x <= y:
    ans += 1
    x *= 2

print(ans)
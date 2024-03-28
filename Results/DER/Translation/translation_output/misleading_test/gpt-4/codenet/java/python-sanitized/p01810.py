n, k = map(int, input().split())
ans = 0
for i in range(n - 1):
    ans = k * (ans // (k - 1)) + ans % (k - 1) + 1
print(ans)
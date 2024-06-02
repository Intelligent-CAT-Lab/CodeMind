s = input()

remain = [0]*2020
now = 0
ans = 0
for i in range(len(s)-1, -1, -1):
    now += int(s[i])*pow(10, len(s)-i-1, 2019)
    ans += remain[now%2019]
    remain[now%2019] += 1

ans += remain[0]

print(ans)

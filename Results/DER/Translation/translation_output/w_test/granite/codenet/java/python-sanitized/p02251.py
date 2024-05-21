n = int(input())
ans = 0
ans += n // 25
n %= 25
ans += n // 10
n %= 10
ans += n // 5
n %= 5
ans += n
print(ans)
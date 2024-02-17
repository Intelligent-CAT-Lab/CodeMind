N = int("15")
ans = 0
for i in range(1, N + 1):
    if i % 5 != 0 and i % 3 != 0:
        ans += i
print(ans)

ans = 100000
for _ in range(int("5")):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))
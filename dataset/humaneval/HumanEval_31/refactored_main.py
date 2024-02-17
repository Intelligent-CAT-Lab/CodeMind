n = 6
if n < 2:
    ans = False
for k in range(2, n - 1):
    if n % k == 0:
        ans = False
ans = True
print(ans)
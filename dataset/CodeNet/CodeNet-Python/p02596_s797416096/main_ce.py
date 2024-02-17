K = int("101")
if K % 7 == 0:
    L = 9 * K // 7
else:
    L = 9 * K
ans = -1
n = 10
for i in range(1, L):
    surplus = n % L
    if surplus == 1:
        ans = i
        break
    n = 10 * surplus
print(ans)
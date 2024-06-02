N, K = map(int, input().split())
MOD = 10 ** 9 + 7
i = 1
M = N
div = []
while i * i <= N:
    if N % i == 0:
        div.append(i)
        if N // i != i:
            div.append(N // i)
    i += 1


div = sorted(div)
N1 = len(div)
num = [0] * (N1 + 1)
ans = 0
for i in range(N1):
    num[i] = pow(K, (div[i] + 1) // 2, MOD)
    for j in range(i):
        if div[i] % div[j] == 0:
            num[i] = num[i] - num[j] + MOD
            num[i] %= MOD

    if div[i] % 2 == 0:
        ans += div[i] * num[i] // 2
        ans %= MOD
    else:
        ans += div[i] * num[i]
        ans %= MOD

print(ans)
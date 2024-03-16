import sys

MOD = 1000000007
N = int(sys.stdin.readline())
cnt = [0]*(N+1)

for i in range(2, N+1):
    temp = i
    for j in range(2, int(temp**0.5)+1):
        while temp % j == 0:
            cnt[j] += 1
            temp //= j
    if temp > 1:
        cnt[temp] += 1

ans = 1
for i in range(2, N+1):
    ans = (ans * (cnt[i]+1)) % MOD

print(ans)
import sys

N = int(input())
A = list(map(str, input().split()))

cnt = [0] * 26
for i in range(N):
    cnt[ord(A[i]) - ord('a')] += 1

ans = (N * (N + 1)) // 2 / 2
for i in range(26):
    if cnt[i] > 0:
        ans -= (cnt[i] * (cnt[i] + 1)) // 2 / 2

print(ans)
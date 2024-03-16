import sys

A = input().strip().split()
N = len(A)
cnt = [0] * 26
for i in range(N):
    cnt[ord(A[i]) - ord('a')] += 1

ans = (N * (N + 1)) // 2 + 1
for i in range(26):
    if cnt[i] > 0:
        ans -= (cnt[i] * (cnt[i] + 1)) // 2

print(ans)
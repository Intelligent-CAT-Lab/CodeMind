S = eval(input())
N = len(S)

ans = N
for i in range(N - 1):
    if S[i] != S[i + 1]:
        ans = min(ans, max(i + 1, N - i - 1))
print(ans)

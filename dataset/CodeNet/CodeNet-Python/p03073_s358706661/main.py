S = list(map(int, input()))
ans = [0, 0]

for i in range(len(S)):
    if (i % 2 == S[i]):
        ans[0] += 1
    if (i % 2 != S[i]):
        ans[1] += 1

print(min(ans))

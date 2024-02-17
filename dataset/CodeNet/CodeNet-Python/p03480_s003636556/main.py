S = input()
ans = len(S)
for i in range(len(S)-1):
    if S[i] != S[i+1]:
        ans = min(ans, max(i+1, len(S)-i-1))

print(ans)

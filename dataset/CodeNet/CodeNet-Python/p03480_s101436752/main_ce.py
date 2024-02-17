S="010".strip()
K=len(S)
for i in range(len(S)-1):
    if S[i]!=S[i+1]:
        ln=max(i+1,len(S)-i-1)
        K=min(ln,K)
print(K)
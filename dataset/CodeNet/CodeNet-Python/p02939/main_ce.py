S = "aabbaa"
l = [0] * (len(S) + 1)
l[1] = 1
if S[0] == S[1]:
    l[2] = 1
else:
    l[2] = 2
for i in range(3, len(S)+1):
    if S[i-1] != S[i-2]:
        l[i] = l[i-1] + 1
    else:
        l[i] = l[i-3] + 2
print(l[-1])

def checkEqual(S):
    mins, maxs = S[:len(S)//2], S[len(S)//2:]
    for s in range(len(S)//2, len(S)):
        if S[s:s+len(S)//2] > maxs:
            maxs = S[s:s+len(S)//2]
        if S[s:s+len(S)//2] < mins:
            mins = S[s:s+len(S)//2]
    return len(maxs) - len(mins)

def check12(S):
    maxv, minv = 0, 10
    for p in range(len(S)):
        v = ord(S[p]) - ord('0')
        if S[p] == '1' and p+1 < len(S):
            v = 10 + ord(S[p+1]) - ord('0')
            p += 1
        maxv = max(maxv, v)
        minv = min(minv, v)
    return maxv - minv

S = input()
print(min(checkEqual(S), check12(S)))
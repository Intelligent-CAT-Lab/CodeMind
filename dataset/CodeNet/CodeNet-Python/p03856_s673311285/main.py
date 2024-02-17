S = input()
N = len(S)
i = 0
while i < N:
    sig = 0
    S5 = S[i:i+5]
    if S5 == 'dream':
        sig = 1
        if S[i+5:i+7] == 'er' and S[i+7:i+8] != 'a':
            i += 2
        i += 5
    elif S5 == 'erase':
        sig = 1
        if S[i+5:i+6] == 'r':
            i += 1
        i += 5
    if sig == 0:
        sig = 2
        Answer = 'NO'
        break
if sig != 2:
    Answer = 'YES'
print(Answer)
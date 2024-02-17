S = "needed"
if len(S) == 2:
    if S[0] == S[1]:
        print(1, 2)
    else:
        print(-1, -1)
    exit()
for i in range(len(S)-3):
    s = list(S[i:i+3])
    if len(set(s)) <= 2:
        print(i+1, i+3)
        break
else:
    print(-1, -1)
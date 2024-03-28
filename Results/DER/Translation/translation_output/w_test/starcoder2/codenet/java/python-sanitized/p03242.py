S = input()
for i in range(3):
    if S[i] == '1':
        S = S[:i] + '9' + S[i+1:]
    else:
        S = S[:i] + '1' + S[i+1:]
print(S)
S = input()
for i in range(3):
    if S[i] == '1':
        S[i] = '9'
    else:
        S[i] = '1'
print(S)
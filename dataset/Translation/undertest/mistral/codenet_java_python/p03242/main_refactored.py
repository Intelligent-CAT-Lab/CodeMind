class main:
    S = input()
    for i in range(3):
        S[i] = '9' if S[i] == '1' else '1'
    print(S)
def p03242(S):
    S = list(str(S))
    for i in range(3):
        S[i] = '9' if S[i] == '1' else '1'
    return "".join(S)

print(p03242(119))
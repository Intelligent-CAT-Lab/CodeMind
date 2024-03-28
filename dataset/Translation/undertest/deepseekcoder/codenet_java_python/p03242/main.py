def p03242():
    S = input()
    S = list(S)
    for i in range(3):
        if S[i] == '1':
            S[i] = '9'
        else:
            S[i] = '1'
    print(''.join(S))

p03242()
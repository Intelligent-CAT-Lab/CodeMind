def p03107(S):
    S0mas = S.count('0')
    S1mas = len(S) - S0mas
    if S0mas < S1mas:
        return S0mas * 2
    else:
        return S1mas * 2

print(p03107(input()))
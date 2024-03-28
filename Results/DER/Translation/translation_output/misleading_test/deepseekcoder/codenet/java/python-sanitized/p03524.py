def p03524(S):
    a = S.count('a')
    b = S.count('b')
    c = S.count('c')

    if max(max(a,b),c)-min(min(a,b),c) <= 1:
        return "YES"
    else:
        return "NO"

print(p03524(input()))
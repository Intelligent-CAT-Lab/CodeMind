def p03524():
    S = input()
    a = S.count('a')
    b = S.count('b')
    c = S.count('c')
    if max(a, b, c) - min(a, b, c) <= 1:
        print("#3S")
    else:
        print("NO")

p03524()
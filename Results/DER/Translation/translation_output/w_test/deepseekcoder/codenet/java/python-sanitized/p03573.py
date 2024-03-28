def p03573():
    A, B, C = map(int, input().split())

    if A == B:
        print(C)
    elif B == C:
        print(A)
    else:
        print(B)

p03573()
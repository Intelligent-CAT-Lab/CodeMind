def p03106():
    A, B, K = map(int, input().split())
    s = []
    z = 1
    while z <= A and z <= B:
        if A % z == 0 and B % z == 0:
            s.append(z)
        z += 1
    print(s[-K])

p03106()
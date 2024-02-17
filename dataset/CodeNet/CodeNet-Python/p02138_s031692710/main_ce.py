def solve(A, B, hoge):
    C, D = 0, 0
    turn = 0
    while True:
        if turn % 2 == 0 and hoge == 0:
            n = A + C
            m = min(n, D)
            D -= m
            n -= m
            m = min(n/2, B)
            B -= m
            n -= m*2
            if B > 0 and n > 0:
                B -= 1
                D += 1
        elif turn % 2 == 1 and hoge == 0:
            n = B + D
            m = min(n, A)
            A -= m
            C += m
            n -= m
            m = min(n, C)
            C -= m
            n -= m
        elif turn % 2 == 0 and hoge == 1:
            n = A + C
            m = min(n, B)
            B -= m
            D += m
            n -= m
            m = min(n, D)
            D -= m
            n -= m
        else:
            n = B + D
            m = min(n, C)
            C -= m
            n -= m
            m = min(n/2, A)
            A -= m
            n -= m*2
            if A > 0 and n > 0:
                A -= 1
                C += 1
        if A + C <= 0 or B + D <= 0:
            return turn
        turn += 1
if __name__ == "__main__":
    A, B = map(int, "20 10".split())
    print min(solve(A, B, 0), solve(A, B, 1))

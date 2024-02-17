def resolve():
    A, B, C, D = list(map(int, "3 5 2 7".split()))
    print(A*B if A*B > C*D else C*D)
if '__main__' == __name__:
    resolve()
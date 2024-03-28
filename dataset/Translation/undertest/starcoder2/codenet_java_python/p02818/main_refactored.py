class main:
    A, B, K = map(int, input().split())
    if K <= A:
        A -= K
    elif K <= A+B:
        B -= K-A
        A = 0
    else:
        A = 0
        B = 0
    print(A, B)
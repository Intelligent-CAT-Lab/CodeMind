class main:
    A, B = map(int, input().split())
    if 9 < A or 9 < B:
        print(-1)
    else:
        print(A * B)
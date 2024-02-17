A, B, C, D = list(map(int, input().split()))
if min(B, D) - max(A, C) >= 0:
    print((min(B, D) - max(A,C)))
else:
    print((0))
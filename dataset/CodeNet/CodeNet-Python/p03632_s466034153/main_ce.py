A, B, C, D = map(int, "0 75 25 100".split())
if min(B, D) - max(A, C) >= 0:
    print(min(B, D) - max(A,C))
else:
    print(0)
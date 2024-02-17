A, B, C, D = map(int, "0 75 25 100".split())
ans = min(B,D) - max(A,C)
if ans > 0:
    print(ans)
else:
    print(0)
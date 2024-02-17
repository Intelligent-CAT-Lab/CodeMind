A, B, C, D = list(map(int, input().split()))
ans = min(B,D) - max(A,C)
 
if ans > 0:
    print(ans)
else:
    print((0))
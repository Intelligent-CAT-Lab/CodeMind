import sys
input = sys.stdin.readline
D = int("63")
memo_F = [0] * 30
memo_T = [0] * 30
for x in range(10):
    for y in range(10):
        memo_T[y-x] += 1
        if x != 0:
            memo_F[y-x] += 1
def F(K,D,allow_leading_zero):
    if K == 0:
        return 1 if D == 0 else 0
    if K == 1:
        if D != 0:
            return 0
        if allow_leading_zero:
            return 10
        else:
            return 9
    x = 10**(K-1)-1
    d = (-D)%10
    # xをd個またはd-10個
    ret = 0
    for use_x in [d,d-10]:
        if allow_leading_zero:
            coef = memo_T[use_x]
        else:
            coef = memo_F[use_x]
        if coef == 0:
            continue
        ret += coef * F(K-2,(D-x*use_x)//10,True)
    return ret
answer = sum(F(K,D,False) for K in range(1,20))
print(answer)
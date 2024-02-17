A,B = list(map(int,input().split()))

if B%A == 0:
    print((-1))
    exit()

_k = -(-B//A)

for k in range(_k, _k+10**7):
    bn, rem = divmod(k*A, B)
    an, rem = divmod(rem, A)
    n = bn + an + rem
    if n > k:
        print((k*A))
        exit()
print((-1))

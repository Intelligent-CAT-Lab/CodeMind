import math

MOD = 1000000007

n = int(input())
m = int(input())

if n == 1:
    print((m+1)%MOD)
else:
    if (m+1)%(n-1) == 0:
        limit = (m+1)//(n-1)-1
    else:
        limit = (m+1)//(n-1)

    if limit <= 0:
        print((m+1)%MOD)
    else:
        bigMOD = math.bigmod(MOD, 10**18)
        limit = math.bigint(limit)
        A = math.bigint(m+1)
        B = math.bigint(2*(m+1))*limit
        C = math.bigint(n-1)*limit*(limit+1)
        A = A + B - C
        print(A.remainder(bigMOD))
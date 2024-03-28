import math

MOD = 1000000007

def p01939():
    first_N = int(input())
    first_M = int(input())

    if first_N == 1:
        print((first_M+1)%MOD)
    else:
        if (first_M+1)%(first_N-1) == 0:
            first_limit = (first_M+1)//(first_N-1)-1
        else:
            first_limit = (first_M+1)//(first_N-1)

        if first_limit <= 0:
            print((first_M+1)%MOD)
        else:
            limit = first_limit
            A = first_M+1
            B = 2*(first_M+1)*limit
            C = (first_N-1)*(limit*(first_limit+1))
            A = A + B - C
            print(A%MOD)

p01939()
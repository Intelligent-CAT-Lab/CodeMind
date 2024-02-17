# ball and box 5
MOD = pow(10,9)+7
from math import factorial
def P(n,r):
    return factorial(n)//factorial(n-r)
def C(n,r):
    return P(n,r)//factorial(r)
def H(n,r):
    return C(n+r-1,r)
n, k = list(map(int, input().split()))

print((C(k,n)%MOD if n < k else 0 if n > k else 1))

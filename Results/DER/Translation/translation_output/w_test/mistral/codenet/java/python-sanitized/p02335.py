import sys

def fact(n):
    if n == 0:
        return 1
    else:
        return n * fact(n-1)

def inv(n):
    mod = 1000000007
    fact_list = [1, 1]
    inv_list = [1, 1]
    finv_list = [1, 1]
    for i in range(2, n+1):
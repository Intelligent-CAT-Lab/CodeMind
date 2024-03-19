import sys

def fact(n):
    if n == 0:
        return 1
    else:
        return n * fact(n-1)

def inv(n):
    mod = 1000000007
    fact_inv = [1] * (mod+1)
    fact_inv[0], fact_inv[1] = 0, 1
import sys

def invl(a, mod):
    b = mod
    p = 1
    q = 0
    while b > 0:
        c = a // b
        d = a
        a =
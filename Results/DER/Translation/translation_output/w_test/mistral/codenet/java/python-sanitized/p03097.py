def dropBit(n, index):
    higher = (n >> (index + 1)) << index
    lower = (n & ((1 << index) - 1))
    return higher | lower

def insertBit(n, index, v):
    higher = ((n >> index) << (index + 1))
    lower = (n & ((1 << index) - 1))
    return higher | lower | v

def solveSub(n, a, b):
    if n == 1:
        if a != b:
            return [a, b]
        else:
            return None

    for i in range(n):
        aBit = (a >> i) & 1
        bBit = (b >> i) & 1
        if aBit != bBit:
            aDash = dropBit(a, i)
            bDash = dropBit(b, i)
            c = aDash ^ 1
            path1 = solveSub(n - 1, aDash, c)
            path2 = solveSub(n - 1, c, bDash)
import sys

def isAll8(d):
    while d > 0:
        if d % 10 != 8:
            return False
        d //= 10
    return True

def func(n):
    if n in hash:
        return hash[n]

    same = False
    now = n
    res = -1
    maxLen = len(str(n))
    for dlen in range(maxLen, 0, -1):
        for i in range(1 << dlen):
            d = 0
            ten = 1
            for j in range(dlen):
                if (i & (1 << j)) == 0:
                    d += ten *
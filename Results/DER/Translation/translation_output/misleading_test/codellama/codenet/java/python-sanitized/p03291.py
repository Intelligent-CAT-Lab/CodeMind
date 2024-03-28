import sys

LINF = 1L << 55
MOD = 1000000007
mh4 = [0, -1, 1, 0]
mw4 = [-1, 0, 0, 1]
mh8 = [-1, -1, -1, 0, 0, 1, 1, 1]
mw8 = [-1, 0, 1, -1, 1, -1, 0, 1]

def power(a, e, modP):
    ret = 1
    for i in range(e):
        if e % 2 != 0:
            ret = (ret * a) % modP
        a = (a * a) % modP
    return ret

def solve(testNumber, in, out):
    s = in.nextString().toCharArray()
    n
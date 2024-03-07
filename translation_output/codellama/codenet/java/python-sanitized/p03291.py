import sys

def solve(test_number, inp, out):
    s = inp.readline().strip()
    n = len(s)
    ac = [0] * (n + 1)
    bc = [0] * (n + 1)
    cc = [0] * (n + 1)
    xc = [0] * (n + 1)
    for i in range(n):
        ac[i + 1] += ac[i]
        bc[i + 1] += bc[i]
        cc[i + 1] += cc[i]
        xc[i + 1] += xc[i]
        if s[i] == 'A':
            ac[i + 1] += 1
        elif s[i] == 'B':
            bc[i + 1] += 1
        elif s[i] == 'C':
            cc[i + 1] += 1
        elif s[i] == '?':
            xc[i + 1] += 1
    ans = 0
    for i
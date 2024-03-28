import sys

class InputReader:
    def __init__(self):
        self.input = sys.stdin.readline

    def read_string(self):
        return self.input().strip()

    def read_int(self):
        return int(self.input())

    def read_ints(self, n):
        return list(map(int, self.input().split()))

    def read_long(self):
        return long(self.input())

    def read_longs(self, n):
        return list(map(long, self.input().split()))


MOD = 1000000007

def power(a, e, modP):
    ret = 1
    for _ in range(e):
        ret = (ret * a) % modP
    return ret

def solve(s):
    n = len(s)
    ac = [0] * (n+1)
    bc = [0] * (n+1)
    cc = [0] * (n+1)
    xc = [0] * (n+1)
    for i in range(n):
        if s[i] == 'A': ac[i+1] += 1
        if s[i] == 'B': bc[i+1] += 1
        if s[i] == 'C': cc[i+1] += 1
        if s[i] == '?': xc[i+1] += 1
        ac[i+1] += ac[i]
        bc[i+1] += bc[i]
        cc[i+1] += cc[i]
        xc[i+1] += xc[i]
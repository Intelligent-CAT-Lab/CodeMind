import sys

P = 10**9 + 7
C = 110

def pow(a, b):
    ret = 1
    for _ in range(b):
        ret = (ret * a) % P
    return ret

def one2D(a, p, b, q):
    return (pow(b, p - 1) + pow(a, q - 1) - 1) % P

def preCalc():
    ways = [[0 for _ in range(C)] for _ in range(C)]
    for i in range(C):
        ways[i][0] = ways[i][i] = 1
        for j in range(1, i):
            ways[i][j] = (ways[i - 1][j] + ways[i - 1][j - 1]) % P
    return ways

def submit(a, b, c, d, e,
import sys

def solve():
    x, y = map(int, input().split())
    if (2*y-x)%3 != 0 or 2*y-x < 0:
        print(0)
        return
    a = (2*y-x)//3
    if (2*x-y)%3 != 0 or 2*x-y < 0:
        print(0)
        return
    b = (2*x-y)//3
    fif = [[1, 1], [0, 0]]
    for i in range(3000000):
        fif[0][i+1] = (fif[0][i] * (i+1) % 1000000007)
        fif[1][i+1] = (fif[1][i] * (i+1) % 1000000007)
    print(C(a+b, a, 1000000007, fif))

def C(n, r, mod, fif):
    if n < 0 or r < 0 or r > n:
        return 0
    return (fif[0][n] * fif[1][r] % mod * fif[1][n-r] % mod)

def enumFIF(n, mod):
    f = [1]
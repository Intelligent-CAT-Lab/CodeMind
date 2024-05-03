import sys

N, V, X, Y = map(int, sys.stdin.readline().split())
L = []
B = []
R = []
T = []

for _ in range(N):
    l, b, r, t = map(int, sys.stdin.readline().split())
    if r > X:
        r = X
    L.append(l)
    B.append(b)
    R.append(r)
    T.append(t)

def calc(vy, t):
    return vy * t - 9.8 * t * t / 2

def cmp(lb, ub, a):
    return -1 if a < lb + 1e-6 else 1 if a > ub - 1e-6 else 0

def check(qx, qy):
    a = 9.8 ** 2 / 4
    b = 9.8 * qy - V ** 2
    c = qx ** 2 + qy ** 2
    D = b ** 2 - 4 * a * c
    if D < 0 and D > -1e-6:
        D = 0
    if D < 0:
        return False

    for d in [-1, 1]:
        t2 = (-b + d * (D ** 0.5)) / (2 * a)
        if t2 < 0:
            continue
        t = t2 ** 0.5
        vx = qx / t
        vy = (V ** 2 - vx ** 2) ** 0.5

        yt = calc(vy, X / vx)
        if yt < Y - 1e-6:
            continue

        ok = True
        for i in range(N):
            if L[i] >= X:
                continue
            if R[i] >= X and T[i] >= Y and yt >= B[i]:
                ok = False
            yL = cmp(B[i], T[i], calc(vy, L[i] / vx))
            yR
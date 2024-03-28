import math

N, V, X, Y = map(int, input().split())
L, B, R, T = [int(x) for x in input().split()]

g = 9.8
EPS = 1e-6

def calc(vy, t):
    return vy*t - g*t*t/2

def cmp(lb, ub, a):
    return a < lb+EPS ? -1 : a > ub-EPS ? 1 : 0

def check(qx, qy):
    a = g*g/4
    b = g*qy - V*V
    c = qx*qx + qy*qy
    D = b*b - 4*a*c
    if D < 0:
        return False
    for d in range(-1, 2, 2):
        t2 = (-b + d*math.sqrt(D)) / (2*a)
        if t2 < 0:
            continue
        t = math.sqrt(t2)
        vx = qx / t
        vy = math.sqrt(V*V - vx*vx)
        yt = calc(vy, X/vx)
        if yt < Y - EPS:
            continue
        ok = True
        for i in range(N):
            if L[i] >= X:
                continue
            if R[i] >= X and T[i] >= Y
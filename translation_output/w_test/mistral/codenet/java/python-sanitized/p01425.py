import math

def calc(vy, t):
    return vy*t - 9.8*t**2/2

def cmp(lb, ub, a):
    return a < lb+1e-6 if a < ub-1e-6 else a > ub-1e-6 if a > lb+1e-6 else 0

def check(qx, qy):
    a = 9.8**2/4
    b = qy*qy - V**2
    c = qx**2 + qy**2
    D = b**2 - 4*a*c
    if D < 0:
        return False
    for d in range(-1, 2, 2):
        t2 = (-b + d*math.sqrt(D)) / (2*a)
        if t2 < 0:
            continue
        t = math.sqrt(t2)
        vx = qx / t
        vy = math.sqrt(V**2 - vx**2)
        yt = calc(vy, X/vx)
        if yt < Y - 1e-6:
            continue
        ok = True
        for i in range(N):
            if L[i] >= X:
                continue
            if R[i] >= X and T[i] >= Y and yt
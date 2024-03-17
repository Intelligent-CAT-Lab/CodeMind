import math

g = 9.8
EPS = 1e-6

def calc(vy, t):
    return vy*t - g*t*t/2

def cmp(lb, ub, a):
    return a < lb+EPS or a > ub-EPS

def check(qx, qy):
    a = g*g/4
    b = g*qy - V*V
    c = qx*qx + qy*qy
    D = b*b - 4*a*c
    if D < 0: D = 0
    if D < 0: return False
    for d in [-1, 1]:
        t2 = (-b + d*math.sqrt(D)) / (2*a)
        if t2 < 0
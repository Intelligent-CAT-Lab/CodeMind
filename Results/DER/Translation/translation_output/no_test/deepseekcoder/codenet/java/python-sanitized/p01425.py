import math

N, V, X, Y = 0, 0, 0, 0
L, B, R, T = [], [], [], []
g = 9.8
EPS = 1e-6

def calc(vy, t):
    return vy*t - g*t*t/2

def cmp(lb, ub, a):
    return -1 if a < lb+EPS else 1 if a > ub-EPS else 0

def check(qx, qy):
    a, b, c = g*g/4, g*qy - V*V, qx*qx + qy*qy
    D = b*b - 4*a*c
    if D < 0: D = 0
    if D < 0: return False
    for d in [-1, 1]:
        t2 = (-b + d*math.sqrt(D)) / (2*a
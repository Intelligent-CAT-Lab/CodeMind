import math

N, V, X, Y = map(int, input().split())
L = list(map(int, input().split()))
B = list(map(int, input().split()))
R = list(map(int, input().split()))
T = list(map(int, input().split()))

g = 9.8
EPS = 1e-6

def calc(vy, t):
    return vy*t - g*t*t/2

def cmp(lb, ub, a):
    if a < lb+EPS:
        return -1
    elif a > ub-EPS:
        return 1
    else:
        return 0

def check(qx, qy):
    a = g*g/4
    b = g*qy - V*V
    c = qx*qx + qy*qy
    D = b*b - 4*a*c
    if D < 0 and D > -EPS:
        D = 0
    if D < 0:
        return False
    
    for d in [-1, 1]:
        t2 = (-b + d*math.sqrt(D)) / (2*a)
        if t2 < 0:
            continue
        t = math.sqrt(t2)
        vx = qx / t
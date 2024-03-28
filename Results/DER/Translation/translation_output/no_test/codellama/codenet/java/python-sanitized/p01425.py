import math

def calc(vy, t):
    return vy * t - 0.5 * 9.8 * t * t

def check(qx, qy):
    a = 9.8 ** 2 / 4
    b = 9.8 * qy - V ** 2
    c = qx ** 2 + qy ** 2
    D = b ** 2 - 4 * a * c
    if D < 0:
        return False
    for d in range(-1, 2, 2):
        t2 = (-b + d * math.sqrt(D)) / (2 * a)
        if t2 < 0:
            continue
        t = math.sqrt(t2)
        vx = qx / t
        vy = math.sqrt(V ** 2 - vx ** 2)
        yt = calc(vy, X / vx)
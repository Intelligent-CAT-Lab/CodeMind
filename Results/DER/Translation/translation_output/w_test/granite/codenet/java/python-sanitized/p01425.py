import math

def calc(vy, t):
    return vy*t - 9.8*t*t/2

def cmp(lb, ub, a):
    if a < lb+1e-6:
        return -1
    elif a > ub-1e-6:
        return 1
    else:
        return 0

def check(qx, qy):
    a = 9.8*9.8/4
    b = 9.8*qy - V*V
    c = qx*qx + qy*qy
    D = b*b - 4*a*c
    if D < 0:
        return False
    for d in [-1, 1]:
        t2 = (-b + d*math.sqrt(D)) / (2*a)
        if t2 < 0:
            continue
        t = math.sqrt(t2)
        vx = qx / t
        vy = math.sqrt(V*V - vx*vx)
        yt = calc(vy, X/vx)
        if yt < Y - 1e-6:
            continue
        ok = True
        for i in range(N):
            if L[i] >= X:
                continue
            if R[i] >= X and T[i] >= Y and yt >= B[i]:
                ok = False
                break
            yL = cmp(B[i], T[i], calc(vy, L[i]/vx))
            yR = cmp(B[i], T[i], calc(vy, R[i]/vx))
            xH = cmp(L[i], R[i], vx*(vy/9.8))
            yH = cmp(B[i], T[i], calc(vy, vy/9.8))
            if yL*yR <= 0:
                ok = False
                break
            if xH == 0 and yH >= 0 and yL < 0:
                ok = False
                break
        if ok:
            return True
    return False

N, V, X, Y = map(int, input().split())
L = []
B = []
R = []
T = []
for i in range(N):
    L.append(int(input()))
    B.append(int(input()))
    R.append(int(input()))
    T.append(int(input()))
    if R[i] > X:
        R[i] = X
ok = check(X, Y)
for i in range(N):
    ok |= check(L[i], T[i])
    ok |= check(R[i], T[i])
if ok:
    print("Yes")
else:
    print("No")
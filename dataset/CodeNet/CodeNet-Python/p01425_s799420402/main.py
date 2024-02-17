import math

g = 9.8
ESP = 1e-6


def calc(vy, t):
    return vy * t - g * t * t / 2


def cmp(lb, ub, a):
    if a < lb + ESP:
        return -1
    elif ub - ESP < a:
        return 1
    else:
        return 0


def check(qx, qy):
    a = (g * g) / 4
    b = g * qy - V * V
    c = qx * qx + qy * qy
    D = b * b - 4 * a * c

    if D < 0 and -ESP < D:
        D = 0

    if D < 0:
        return False

    for d in range(-1, 2, 2):
        t2 = (-b + d * math.sqrt(D)) / (2 * a)
        if t2 <= 0:
            continue

        t = math.sqrt(t2)
        vx = qx / t
        vy = (qy + g * t * t / 2) / t

        yt = calc(vy, X / vx)
        if yt < Y - ESP:
            continue
        ok = True

        for i in range(0, N):
            if L[i] >= X:
                continue

            if R[i] == X and Y <= T[i] and B[i] <= yt:
                ok = False

            yL = cmp(B[i], T[i], calc(vy, L[i] / vx))
            yR = cmp(B[i], T[i], calc(vy, R[i] / vx))

            xH = cmp(L[i], R[i], vx * (vy / g))
            yH = cmp(B[i], T[i], calc(vy, vy / g))
            if xH == 0 and yH >= 0 and yL < 0:
                ok = False
            if yL * yR <= 0:
                ok = False
        if ok:
            return True
    return False


if __name__ == '__main__':
    N, V, X, Y = list(map(int, input().split()))
    L = []
    B = []
    R = []
    T = []
    for i in range(N):
        tmp_L, tmp_B, tmp_R, tmp_T = list(map(int, input().split()))
        L.append(tmp_L)
        B.append(tmp_B)
        R.append(tmp_R)
        T.append(tmp_T)

    for i in range(0, N):
        R[i] = min(R[i], X)

    ok = check(X, Y)
    for i in range(0, N):
        if L[i] == 0 and T[i] != 0:
            pass
        else:
            ok |= check(L[i], T[i])

        if R[i] == 0 and T[i] != 0:
            pass
        else:
            ok |= check(R[i], T[i])

    print("Yes" if ok else 'No')
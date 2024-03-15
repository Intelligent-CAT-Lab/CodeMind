Here's the equivalent Python code for the provided Java code:

```python
import math

N = V = X = Y = 0
L = B = R = T = []
g = 9.8
EPS = 1e-6


def calc(vy, t):
    return vy * t - g * t * t / 2


def cmp(lb, ub, a):
    if a < lb + EPS:
        return -1
    elif a > ub - EPS:
        return 1
    else:
        return 0


def check(qx, qy):
    a = g * g / 4
    b = g * qy - V * V
    c = qx * qx + qy * qy
    D = b * b - 4 * a * c
    if -EPS < D < 0:
        D = 0
    if D < 0:
        return False

    for d in [-1, 1]:
        t2 = (-b + d * math.sqrt(D)) / (2 * a)
        if t2 < 0:
            continue
        t = math.sqrt(t2)
        vx = qx / t
        vy = math.sqrt(V * V - vx * vx)

        yt = calc(vy, X / vx)
        if yt < Y - EPS:
            continue

        ok = True
        for i in range(N):
            if L[i] >= X:
                continue
            if R[i] >= X and T[i] >= Y and yt >= B[i]:
                ok = False

            yL = cmp(B[i], T[i], calc(vy, L[i] / vx))
            yR = cmp(B[i], T[i], calc(vy, R[i] / vx))
            xH = cmp(L[i], R[i], vx * (vy / g))
            yH = cmp(B[i], T[i], calc(vy, vy / g))

            if yL * yR <= 0:
                ok = False
            if xH == 0 and yH >= 0 and yL < 0:
                ok = False
        if ok:
            return True
    return False


def main():
    global N, V, X, Y, L, B, R, T

    N, V, X, Y = map(int, input().split())

    L = [0] * N
    B = [0] * N
    R = [0] * N
    T = [0] * N

    for i in range(N):
        L[i], B[i], R[i], T[i] = map(int, input().split())
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


if __name__ == "__main__":
    main()
```

Make sure that when running this Python script, the input format matches that of the original Java program. The Python `input()` function is used to read inputs from standard input, and the program expects the values of N, V, X, and Y on the first line, followed by L[i], B[i], R[i], and T[i] for each of the N input lines afterward.

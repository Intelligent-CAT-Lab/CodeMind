Below, the provided Java code has been translated to Python:

```python
import math

N, V, X, Y = map(int, input().split())
L, B, R, T = [], [], [], []

g = 9.8
EPS = 1e-6

def calc(vy, t):
    return vy * t - (g * t * t) / 2

def cmp(lb, ub, a):
    if a < lb + EPS:
        return -1
    elif a > ub - EPS:
        return 1
    else:
        return 0

def check(qx, qy):
    a = (g * g) / 4
    b = (g * qy) - (V * V)
    c = (qx * qx) + (qy * qy)
    D = (b * b) - (4 * a * c)
    
    if D < 0 and D > -EPS:
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

for _ in range(N):
    l, b, r, t = map(int, input().split())
    L.append(l)
    B.append(b)
    R.append(min(r, X))  # Corresponds to the R[i] = X condition in Java code
    T.append(t)

ok = check(X, Y)
for i in range(N):
    ok |= check(L[i], T[i])
    ok |= check(R[i], T[i])

print("Yes" if ok else "No")

```

Remember to run this Python code, you need to provide the inputs in the same way as described in the test input: four integers indicating the values for N, V, X, and Y, followed by N lines of four integers each indicating the values for L, B, R, and T.

For example, to test this script, run it and provide the following inputs:

```
1
0 7 3 1
0 0 3 2
```

The expected output will be:

```
Yes
```

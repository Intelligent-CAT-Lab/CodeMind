# aoj 2308
import sys
input = sys.stdin.readline


def calc_y(vy, t):
    return vy*t - g/2*t*t


def loc(y, b, t):
    if y < b+eps:
        return -1
    if y > t-eps:
        return 1
    return 0


def can_hit(x, y):
    if x == 0:
        return False
    a = g*g/4
    b = g*y-V*V
    c = x*x+y*y
    D = b*b-4*a*c
    if D < -eps:  # cannot reach
        return False
    if -eps <= D < 0:
        D = 0
    for d in [-1, 1]:
        t2 = (-b+d*D**.5) / (2*a)
        if t2 <= 0:
            continue
        t = t2**.5
        vx = x/t
        vy = y/t + g/2*t
        if calc_y(vy, X/vx) < Y-eps:  # cannot go above the pig
            continue
        maxt = vy/g
        maxx = vx*maxt
        maxy = calc_y(vy, maxt)
        for L, B, R, T in obstacles:
            left = loc(calc_y(vy, L/vx), B, T)
            right = loc(calc_y(vy, R/vx), B, T)
            if left*right <= 0:
                break
            if L <= maxx <= R:
                mid = loc(maxy, B, T)
                if left*mid <= 0:
                    break
        else:
            return True
    return False


g = 9.8
eps = 1e-10
N, V, X, Y = list(map(int, input().split()))
obstacles = []
for _ in range(N):
    L, B, R, T = list(map(int, input().split()))
    R = min(R, X)
    if L <= X:
        obstacles.append((L, B, R, T))
if X == 0:
    if V*V/(2*g) < Y-eps:
        print('No')
        exit()
    for L, B, R, T in obstacles:
        if B < Y:
            print('No')
            exit()
    print('Yes')
    exit()

# hit directly
if can_hit(X, Y):
    print('Yes')
    exit()

for L, B, R, T in obstacles:
    if can_hit(L, T) or can_hit(R, T):
        print('Yes')
        exit()
print('No')


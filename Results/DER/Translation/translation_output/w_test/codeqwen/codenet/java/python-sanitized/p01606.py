import sys

INF = 1 << 28
EPS = 1e-12

n, w = map(int, sys.stdin.readline().split())

def solve():
    flag = [False] * (n + 1)
    count = [0] * (n + 1)
    sum = 0
    left = 1
    right = w + 1
    for i in range(1, w):
        for k in range(1, int(i ** 0.5) + 1):
            if i % k == 0:
                count[k] += 1
                update(k)
                if i / k != k:
                    count[int(i / k)] += 1
                    update(int(i / k))
    for i in range(n - w + 1):
        left = i + 1
        right = i + w + 1
        for k in range(1, int(i ** 0.5) + 1):
            if i % k == 0:
                count[k] -= 1
                update(k)
                if i / k != k:
                    count[int(i / k)] -= 1
                    update(int(i / k))
        for k in range(1, int((i + w) ** 0.5) + 1):
            if (i + w) % k == 0:
                count[k] += 1
                update(k)
                if (i + w) / k != k:
                    count[int((i + w) / k)] += 1
                    update(int((i + w) / k))
        update(left - 1)
        update(right - 1)
        print(sum + (i < n - w) * " ", end="")
    print()

def update(i):
    det = left <= i and i < right
    if flag[i] and not det and count[i] < 2:
        flag[i] = False
        sum -= 1
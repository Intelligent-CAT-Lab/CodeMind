import random

n, k = map(int, input().split())
x0 = int(input())

def xorshift(x):
    x ^= x << 13
    x ^= x >> 7
    x ^= x << 17
    return x

def solve():
    if x0 == 0:
        return 0

    s = 10000
    count = [0] * s
    offset = 2 ** 63
    M = s / 2 ** 64

    x = x0
    for _ in range(n):
        at = int((x + offset) * M)
        if at < 0:
            at = 0
        if at >= s:
            at = s - 1
        count[at] += 1
        x = xorshift(x)

    sum = 0
    target = -1
    for i in range(s):
        if sum <= k < sum + count[i]:
            target = i
            break
        sum += count[i]

    is_ = []
    x = x0
    now = 0
    for _ in range(n):
        at = int((x + offset) * M)
        if at < 0:
            at = 0
        if at >= s:
            at = s - 1
        if at == target:
            is_.append(x)
        x = xorshift(x)

    is_.sort()
    return is_[k - sum]

print(solve())
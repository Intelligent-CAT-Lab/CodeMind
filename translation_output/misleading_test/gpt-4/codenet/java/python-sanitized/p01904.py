import math
import sys
from functools import cmp_to_key

D = [1, 0, -1, 0]

def main():
    n = int(input())
    sqi = [0] * n
    sqj = [0] * n
    for i in range(1, n):
        x, d = map(int, input().split())
        sqi[i] = sqi[x] + D[d]
        sqj[i] = sqj[x] + D[d ^ 1]

    pp = [None] * (n * 4)
    for i in range(n):
        pp[i * 4 + 0] = Vector2(sqi[i], sqj[i])
        pp[i * 4 + 1] = Vector2(sqi[i], sqj[i] + 1)
        pp[i * 4 + 2] = Vector2(sqi[i] + 1, sqj[i])
        pp[i * 4 + 3] = Vector2(sqi[i] + 1, sqj[i] + 1)

    v = Vector2.convex_hull(pp)
    m = len(v)
    theta = [0.0] * m
    for i in range(m):
        v1 = v[i]
        v2 = v[(i + 1) % m]
        theta[i] = math.atan2(v2.y - v
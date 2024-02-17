#!/usr/bin/env python

from collections import deque
import itertools as it
import sys
import math

sys.setrecursionlimit(10000000)

N, M, A, B = list(map(int, input().split()))

ans = [['.'] * M for i in range(N)]

if M % 2 == 1:
    for i in range(0, N - 1, 2):
        if B > 0:
            B -= 1
            ans[i][M - 1], ans[i + 1][M - 1] = "^", "v"

if N % 2 == 1:
    for i in range(M - 2, -1, -2):
        if A > 0:
            A -= 1
            ans[N - 1][i], ans[N - 1][i + 1] = "<", ">"

flag = False
if 2 * (A + B) == (N / 2) * (M / 2) * 4 and (N % 2) == (M % 2) == (A % 2) == 1:
    flag = True
    A += 1

for i in range(N - 2 - N % 2, -1, -2):
    for j in range(0, M - 1, 2):
        if A == 1:
            A -= 2
            ans[i][j], ans[i + 1][j], ans[i][j + 1], ans[i + 1][j + 1] = "<", ".", ">", "."
        elif A >= 2:
            A -= 2
            ans[i][j], ans[i + 1][j], ans[i][j + 1], ans[i + 1][j + 1] = "<", "<", ">", ">"
        elif B == 1:
            B -= 2
            ans[i][j], ans[i + 1][j], ans[i][j + 1], ans[i + 1][j + 1] = "^", "v", ".", "."
        elif B >= 2:
            B -= 2
            ans[i][j], ans[i + 1][j], ans[i][j + 1], ans[i + 1][j + 1] = "^", "v", "^", "v"

if flag:
    ans[N - 2][0], ans[N - 2][1], ans[N - 1][0] = "^", ".", "v"
    B = 0

if A > 0 or B > 0:
    print("NO")
    exit()

print("YES")
for i in range(N):
    print("".join(ans[i]))

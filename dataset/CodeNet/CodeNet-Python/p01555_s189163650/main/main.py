#!/usr/bin/env python

from collections import deque
import itertools as it
import sys

sys.setrecursionlimit(1000000)

s = eval(input())

m = {}
m[0] = 0
index = 0
for i in range(20):
    minx = 10 ** i
    maxx = 10 ** (i + 1) - 1
    F_num = maxx // 3 - minx // 3
    B_num = maxx // 5 - (minx - 1) // 5
    FB_num = maxx // 15 - minx // 15
    P_num = maxx - minx - F_num - B_num + FB_num + 1
    m[i + 1] = m[i] + P_num * (i + 1) + F_num * 4 + B_num * 4
    if s < m[i + 1]:
        s -= m[i]
        index = i + 1
        break

#print index
ans = []
rem = 0

for i in range(index - 1, -1, -1):
    rem *= 10
    lst = list(range(10))
    if rem == 0:
        lst = list(range(1, 10))
    for j in lst:
        minx = rem + j * (10 ** i)
        maxx = rem + (j + 1) * (10 ** i) - 1
        F_num = maxx // 3 - (minx - 1) // 3
        B_num = maxx // 5 - (minx - 1) // 5
        FB_num = maxx // 15 - (minx - 1) // 15
        P_num = maxx - minx - F_num - B_num + FB_num + 1
        S_num = P_num * (index) + F_num * 4 + B_num * 4
        #print minx, maxx
        #print S_num
        if s > S_num:
            s -= S_num
        else:
            rem += j
            break
S = ""
for num in range(rem, rem + 100):
    if num % 3 == 0:
        S += "Fizz"
    if num % 5 == 0:
        S += "Buzz"
    if num % 3 != 0 and num % 5 != 0:
        S += str(num)
print(S[s - 1:s + 19])

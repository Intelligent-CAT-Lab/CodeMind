import math
import sys

M = int(input())
rD = int(input())
rR = int(input())
cD = int(input())
cR = int(input())

def solve():
    max_value = -1
    D0 = (100 * cD + rD - 1) // rD
    C0 = (100 * cR + rR - 1) // rR
    for i in range(100):
        for j in range(100):
            change_D = D0 + i
            change_R = C0 + j
            jpn = M - change_D - change_R
            if jpn < 0:
                continue
            rem_D = change_D * rD // 100 - cD
            rem_R = change_R * rR // 100 - cR
            jpn += rem_D * 100 // rD + rem_R * 100 // rR
            max_value = max(max_value, jpn)
    print(max_value)

solve()
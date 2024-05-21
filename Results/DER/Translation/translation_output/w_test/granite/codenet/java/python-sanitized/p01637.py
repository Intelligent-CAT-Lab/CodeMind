import math

def solve(M, rD, rR, cD, cR):
    max_change = -1
    D0 = math.ceil((100 * cD + rD - 1) / rD)
    C0 = math.ceil((100 * cR + rR - 1) / rR)
    for i in range(100):
        for j in range(100):
            changeD = D0 + i
            changeR = C0 + j
            jpn = M - changeD - changeR
            if jpn < 0:
                continue
            remD = changeD * rD // 100 - cD
            remR = changeR * rR // 100 - cR
            jpn += remD * 100 // rD + remR * 100 // rR
            max_change = max(max_change, jpn)
    return max_change

M = int(input())
rD = int(input())
rR = int(input())
cD = int(input())
cR = int(input())
print(solve(M, rD, rR, cD, cR))
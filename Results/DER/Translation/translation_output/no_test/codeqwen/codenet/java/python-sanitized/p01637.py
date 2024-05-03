import sys

M = int(sys.stdin.readline())
rD = int(sys.stdin.readline())
rR = int(sys.stdin.readline())
cD = int(sys.stdin.readline())
cR = int(sys.stdin.readline())

def solve():
    max_ = -1
    D0 = (100 * cD + rD - 1) // rD
    C0 = (100 * cR + rR - 1) // rR
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
            max_ = max(max_, jpn)
    print(max_)

solve()
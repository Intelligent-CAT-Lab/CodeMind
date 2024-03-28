class main:
    import sys
    
    M = int(input())
    rD, rR = map(int, input().split())
    cD, cR = map(int, input().split())
    
    def solve():
        max = -1
        D0 = (100 * cD + rD - 1) // // 100 * cD + rD - 1
        C0 = (100 * cR + rR - 1) // // 100 * cR + rR - 1
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
                max = max(max, jpn)
        print(max)
    
    solve()
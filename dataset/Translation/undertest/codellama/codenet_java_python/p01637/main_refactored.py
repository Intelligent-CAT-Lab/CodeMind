class main:
    import math
    
    def solve(M, rD, rR, cD, cR):
        D0 = (100 * cD + rD - 1) // rD
        C0 = (100 * cR + rR - 1) // rR
        max_jpn = -1
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
                max_jpn = max(max_jpn, jpn)
        return max_jpn
    
    M = 9333
    rD = 100
    rR = 100
    cD = 100
    cR = 100
    print(solve(M, rD, rR, cD, cR))
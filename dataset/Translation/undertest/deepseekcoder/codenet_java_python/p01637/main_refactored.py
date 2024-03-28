class main:
    import sys
    
    def solve():
        M = int(sys.stdin.readline().strip())
        rD, rR = map(int, sys.stdin.readline().strip().split())
        cD, cR = map(int, sys.stdin.readline().strip().split())
    
        max_jpn = -1
        D0 = (100*cD+rD-1)//rD
        R0 = (100*cR+rR-1)//rR
    
        for i in range(100):
            for j in range(100):
                changeD = D0 + i
                changeR = R0 + j
                jpn = M - changeD - changeR
                if jpn < 0:
                    continue
                remD = (changeD*rD)//100 - cD
                remR = (changeR*rR)//100 - cR
                jpn += (remD*100)//rD + (remR*100)//rR
                max_jpn = max(max_jpn, jpn)
    
        print(max_jpn)
    
    if __name__ == "__main__":
        solve()
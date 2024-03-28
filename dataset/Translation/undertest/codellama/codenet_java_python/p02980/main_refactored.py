class main:
    import sys
    
    MODULO = 998244353
    
    def solve(height, width):
        ph = [1]
        for i in range(1, width + 1):
            ph.append(ph[i - 1] * (height + 1) % MODULO)
    
        pw = [1]
        for i in range(1, height + 1):
            pw.append(pw[i - 1] * (width + 1) % MODULO)
    
        res = 0
        for common in range(0, height + 1):
            ways = facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO * facts[width] % MODULO * invfacts[width - common] % MODULO * ph[width - common] % MODULO * pw[height - common] % MODULO
            if common % 2 == 0:
                res += ways
            else:
                res -= ways
    
        res %= MODULO
        if res < 0:
            res += MODULO
    
        return res
    
    if __name__ == "__main__":
        height = int(sys.stdin.readline())
        width = int(sys.stdin.readline())
        print(solve(height, width))
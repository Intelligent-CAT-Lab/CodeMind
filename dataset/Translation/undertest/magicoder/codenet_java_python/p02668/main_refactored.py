class main:
    import sys
    
    MOD = 1000000007
    
    def calc(rem, bits):
        if table[rem][bits] != -1:
            return table[rem][bits]
        if bits == 1:
            return pot2[rem]
        ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
        ret = (ret + (rem + 1) * calc(rem, bits - 1)) % MOD
        table[rem][bits] = ret
        return ret
    
    def calc2(rem, bits):
        if table2[rem][bits] != -1:
            return table2[rem][bits]
        if rem == 0:
            return 0
        ret = calc2(rem - 1, bits)
        tmp = (rem * calc(rem, bits)) % MOD
        tmp = (tmp * pow(invPot2[rem + 1], MOD - 2, MOD)) % MOD
        ret = (ret + tmp) % MOD
        table2[rem][bits] = ret
        return ret
    
    def eleva(a, e):
        if e == 0:
            return 1
        ret = eleva(a, e // 2)
        ret = (ret * ret) % MOD
        if e % 2 == 1:
            ret = (ret * a) % MOD
        return ret
    
    def inv(a):
        return eleva(a, MOD - 2)
    
    def main():
        global N, M, pot2, invPot2, table, table2
        N, M = map(int, sys.stdin.readline().split())
        pot2 = [1]
        for i in range(1, M + 1):
            pot2.append((pot2[-1] * 2) % MOD)
        invPot2 = [inv(pot2[-1])]
        for i in range(M - 1, -1, -1):
            invPot2.append((invPot2[-1] * 2) % MOD)
        invPot2.reverse()
        table = [[-1] * (N + 1) for _ in range(M + 1)]
        table2 = [[-1] * (N + 1) for _ in range(M + 1)]
        print(calc(M, N))
    
    if __name__ == "__main__":
        main()
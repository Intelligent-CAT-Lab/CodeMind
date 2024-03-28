class main:
    MOD = 1000000007
    table = None
    table2 = None
    N = 0
    M = 0
    pot2 = None
    invPot2 = None
    
    def calc(rem, bits):
        global table, pot2
        ret = table[rem][bits]
        if ret != -1:
            return ret
        if bits == 1:
            table[rem][bits] = pot2[rem]
            return pot2[rem]
        ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
        ret += (rem + 1) * calc(rem, bits - 1)
        ret %= MOD
        table[rem][bits] = ret
        return ret
    
    def calc2(rem, bits):
        global table2, pot2, invPot2
        ret = table2[rem][bits]
        if ret != -1:
            return ret
        if rem == 0:
            table2[rem][bits] = 0
            return 0
        ret = calc2(rem - 1, bits)
        tmp = (rem * calc(rem, bits)) % MOD
        tmp = (tmp * invPot2[rem + 1]) % MOD
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
    
    if __name__ == "__main__":
        N, M = map(int, input().split())
        pot2 = [0] * (M + 1)
        invPot2 = [0] * (M + 1)
        pot2[0] = 1
        for i in range(1, len(pot2)):
            pot2[i] = (pot2[i - 1] * 2) % MOD
        invPot2[len(pot2) - 1] = inv(pot2[len(pot2) - 1])
        for i in range(len(pot2) - 2, -1, -1):
            invPot2[i] = (invPot2[i + 1] * 2) % MOD
        table = [[-1 for _ in range(N + 1)] for _ in range(M + 1)]
        table2 = [[-1 for _ in range(N + 1)] for _ in range(M + 1)]
        print(calc(M, N))
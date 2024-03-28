class main:
    MOD = 1000000007
    table = []
    table2 = []
    N, M = 0, 0
    pot2 = []
    invPot2 = []
    
    def calc(rem, bits):
        ret = table[rem][bits]
        if ret != -1: return ret
        if bits == 1: return table[rem][bits] = pot2[rem]
        ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
        ret += (rem + 1) * calc(rem, bits - 1)
        ret %= MOD
        return table[rem][bits] = ret
    
    def calc2(rem, bits):
        ret = table2[rem][bits]
        if ret != -1: return ret
        if rem == 0: return table2[rem][bits] = 0
        ret = calc2(rem - 1, bits)
        tmp = (rem * calc(rem, bits)) % MOD
        tmp = (tmp * invPot2[rem + 1]) % MOD
        ret = (ret + tmp) % MOD
        return table2[rem][bits] = ret
    
    def eleva(a, e):
        if e == 0: return 1
        ret = eleva(a, e // 2)
        ret = (ret * ret) % MOD
        if e % 2 == 1:
            ret = (ret * a) % MOD
        return ret
    
    def inv(a):
        return eleva(a, MOD - 2)
    
    def main():
        global N, M
        N, M = map(int, input().split())
        pot2 = [1]*(M + 1)
        invPot2 = [1]*(M + 1)
        for i in range(1, M + 1):
            pot2[i] = (pot2[i-1] * 2) % MOD
        invPot2[M] = inv(pot2[M])
        for i in range(M - 1, -1, -1):
            invPot2[i] = (invPot2[i+1] * 2) % MOD
        table = [[-1]*(N+1) for _ in range(M+1)]
        table2 = [[-1]*(N+1) for _ in range(M+1)]
        print(calc(M, N))
    
    if __name__ == "__main__":
        main()
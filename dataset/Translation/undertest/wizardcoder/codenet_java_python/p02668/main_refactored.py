class main:
    MOD = 1000000007
    
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
    
    def calc(rem, bits):
        if table[rem][bits]!= -1:
            return table[rem][bits]
        if bits == 1:
            return table[rem][bits] = pot2[rem]
        ret = (calc2(rem - 1, bits - 1) * pot2[rem]) % MOD
        ret += (rem + 1) * calc(rem, bits - 1)
        ret %= MOD
        return table[rem][bits] = ret
    
    def calc2(rem, bits):
        if table2[rem][bits]!= -1:
            return table2[rem][bits]
        if rem == 0:
            return table2[rem][bits] = 0
        ret = calc2(rem - 1, bits)
        tmp = (rem * calc(rem, bits)) % MOD
        tmp = (tmp * invPot2[rem + 1]) % MOD
        ret = (ret + tmp) % MOD
        return table2[rem][bits] = ret
    
    def main():
        global N, M, pot2, invPot2, table, table2
        sc = MyScanner()
        out = PrintWriter(sys.stdout)
        N = sc.nextInt()
        M = sc.nextInt()
        pot2 = [1] * (M + 1)
        invPot2 = [inv(pot2[M])] * (M + 1)
        for i in range(1, M + 1):
            pot2[i] = (pot2[i-1] * 2) % MOD
            invPot2[i] = (invPot2[i+1] * 2) % MOD
        table = [[-1] * (N + 1) for _ in range(M + 1)]
        table2 = [[-1] * (N + 1) for _ in range(M + 1)]
        out.println(calc(M, N))
        out.flush()
    
    class MyScanner:
        def __init__(self):
            self.br = BufferedReader(InputStreamReader(sys.stdin))
            self.tokenizer = None
    
        def next(self):
            while self.tokenizer == None or not self.tokenizer.hasMoreTokens():
                try:
                    self.tokenizer = StringTokenizer(self.br.readLine())
                except IOException as e:
                    raise RuntimeException(e)
            return self.tokenizer.nextToken()
    
        def nextInt(self):
            return Integer.parseInt(self.next())
    
        def nextLong(self):
            return Long.parseLong(self.next())
    
    if __name__ == '__main__':
        main()
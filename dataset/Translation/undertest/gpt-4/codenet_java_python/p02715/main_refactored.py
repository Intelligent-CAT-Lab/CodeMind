class main:
    def fast_pow_mod(b, x, mod):
        if x == 0:
            return 1
        if x == 1:
            return b % mod
        half_pow = fast_pow_mod(b, x // 2, mod)
        if x % 2 == 0:
            return (half_pow * half_pow) % mod
        return (b * half_pow * half_pow) % mod
    
    def main():
        MOD = 10**9 + 7
        N, K = map(int, input().split())
        res = 0
        x = [0] * (K + 1)
        
        for i in range(K, 0, -1):
            x[i] = fast_pow_mod(K // i, N, MOD)
            for j in range(2 * i, K+1, i):
                x[i] -= x[j]
                if x[i] < 0:
                    x[i] += MOD
            res = (res + i * x[i] % MOD) % MOD
        
        print(res)
    
    if __name__ == "__main__":
        main()
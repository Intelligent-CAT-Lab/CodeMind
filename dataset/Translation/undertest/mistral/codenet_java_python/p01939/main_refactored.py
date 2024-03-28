class main:
    import math
    
    def p01939():
        MOD = 1000000007
        n, m = map(int, input().split())
        limit = (m + 1) // (n - 1)
        if limit <= 0:
            print((m + 1) % MOD)
        else:
            a = (m + 1)
            b = 2 * (m + 1)
            b = b * limit
            c = (n - 1) * limit * (limit + 1)
            a = a + b - c
            print(a % MOD)
    
    if __name__ == '__main__':
        p01939()
class main:
    MODULO = 998244353
    
    def inv(x):
        return pow(x, MODULO - 2, MODULO)
    
    def C(n, r):
        return (fact[n] * invfact[r] * invfact[n - r]) % MODULO
    
    def main():
        n, m = map(int, input().split())
        fact = [1] * (n + 1)
        invfact = [1] * (n + 1)
        for i in range(1, n + 1):
            fact[i] = (fact[i - 1] * i) % MODULO
            invfact[i] = (invfact[i - 1] * inv(i)) % MODULO
        res = 0
        for i in range(0, n + 1):
            for j in range(0, m + 1):
                if i + j % 2 == 0:
                    res += C(n, i) * C(m, j) * C(n - i, m - j)
                else:
                    res -= C(n, i) * C(m, j) * C(n - i, m - j)
        print(res % MODULO)
    
    if __name__ == '__main__':
        main()
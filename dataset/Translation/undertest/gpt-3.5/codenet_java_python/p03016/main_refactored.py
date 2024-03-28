class main:
    def main():
        L, A, B, M = map(int, input().split())
    
        m = [[0, 0, 0], [0, 1, 1], [0, 1, 1]]
    
        res = [0, A % M, B % M]
        k = 10
        l = 0
        while A > k:
            k *= 10
        while l < L:
            m[0][0] = k % M
            r = min((k - A - 1) // B, L - 1)
            res = mult(res, modpow(m, r - l + 1, M), M)
            l = r + 1
            k *= 10
    
        print(res[0])
    
    def modpow(m, c, M):
        if c == 0:
            return [[1, 0, 0], [0, 1, 0], [0, 0, 1]]
        if c == 1:
            return m
        if c % 2 == 0:
            m1 = modpow(m, c // 2, M)
            return mult(m1, m1, M)
        else:
            m1 = modpow(m, c - 1, M)
            return mult(m1, m, M)
    
    def mult(a, b, M):
        r = [0, 0, 0]
        for i in range(3):
            for j in range(3):
                for k in range(3):
                    r[i] += a[k] * b[k][j] % M
                    if r[i] >= M:
                        r[i] -= M
        return r
    
    if __name__ == "__main__":
        main()
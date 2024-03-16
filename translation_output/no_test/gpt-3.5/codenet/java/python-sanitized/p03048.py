class pair:
    def __init__(self, a, b):
        self.x = a
        self.y = b

class Point3D:
    def __init__(self, a, b, c):
        self.x = a
        self.y = b
        self.z = c

mod = 1000000007

def power(x, n):
    if n == 0:
        return 1
    if n % 2 == 0:
        e = power(x, n // 2) % mod
        return (e * e) % mod
    return (x * power(x, n - 1)) % mod

def gcd(a, b):
    return a if b == 0 else gcd(b, a % b)

class COM:
    fact = []
    inv = []

    @staticmethod
    def Init(n):
        COM.fact = [0] * n
        COM.inv = [0] * n
        COM.fact[0] = COM.inv[0] = 1
        for i in range(1, n):
            COM.fact[i] = (COM.fact[i - 1] * i) % mod
            COM.inv[i] = power(COM.fact[i], mod - 2)

    @staticmethod
    def C(n, k):
        if k > n:
            return 0
        return ((COM.fact[n] * COM.inv[n - k]) % mod * COM.inv[k]) % mod

class UF:
    d = []

    @staticmethod
    def Init(size):
        UF.d = [-1] * size

    @staticmethod
    def unite(x, y):
        x = UF.find(x)
        y = UF.find(y)
        if x == y:
            return False
        if UF.d[x] > UF.d[y]:
            t = UF.d[y]
            UF.d[y] = UF.d[x]
            UF.d[x] = t
        UF.d[x] += UF.d[y]
        UF.d[y] = x
        return True

    @staticmethod
    def same(x, y):
        return UF.find(x) == UF.find(y)

    @staticmethod
    def find(k):
        return k if UF.d[k] < 0 else UF.find(UF.d[k])

    @staticmethod
    def size(k):
        return -UF.d[UF.find(k)]

class ST:
    INF = 0
    n = 131072
    d = [0] * (n * 2 - 1)

    @staticmethod
    def Init():
        for i in range(ST.n * 2 - 1):
            ST.d[i] = ST.INF

    @staticmethod
    def update(i, x):
        i += ST.n - 1
        ST.d[i] = x
        while i > 0:
            i = (i - 1) // 2
            ST.d[i] = gcd(ST.d[i * 2 + 1], ST.d[i * 2 + 2])

    @staticmethod
    def query(a, b, k, l, r):
        if r <= a or b <= l:
            return ST.INF
        if a <= l and r <= b:
            return ST.d[k]
        vl = ST.query(a, b, k * 2 + 1, l, (l + r) // 2)
        vr = ST.query(a, b, k * 2 + 2, (l + r) // 2, r)
        return gcd(vl, vr)

def WF(d, a, b, c):
    n = len(a)
    INF = 100000000000
    for i in range(n):
        for j in range(i, n):
            d[i][j] = d[j][i] = INF
    for i in range(n):
        d[a[i]][b[i]] = d[b[i]][a[i]] = c[i]
    for k in range(n):
        for i in range(n):
            for j in range(n):
                d[i][j] = min(d[i][j], d[i][k] + d[k][j])

def main():
    R, G, B, N = map(int, input().split())
    f = 0
    for r in range(N // R + 1):
        for g in range((N - r * R) // G + 1):
            if (N - r * R - g * G) % B == 0:
                f += 1
    print(f)

if __name__ == "__main__":
    main()
class main:
    import bisect
    import itertools
    
    def pow_custom(a, n):
        ret = 1
        while n > 0:
            if n % 2 == 1:
                ret *= a
            a *= a
            n >>= 1
        return ret
    
    def main():
        inputs = list(map(int, input().split()))
        n, m, a, b, p, q = inputs
        INF = 1000_000_000_000_000
        if a == 1 and b == 1:
            ans = INF
            div = min(m // (p + q), n)
            ans = min(ans, abs(div * (p + q) - m))
            div = min(div + 1, n)
            ans = min(ans, abs(div * (p + q) - m))
            print(ans)
            return
    
        lim = 0
        while p * pow_custom(a, lim) + q * pow_custom(b, lim) <= m:
            lim += 1
        lim += 1
        lim = min(lim, n, 40)
        pending1 = []
        pending2 = []
    
        powA = [1] * (42)
        powB = [1] * (42)
        for i in range(1, len(powA)):
            powA[i] = powA[i - 1] * a
            powB[i] = powB[i - 1] * b
    
        for t in range(2):
            max_val = lim // 2 if t == 0 else (lim + 1) // 2
            for i in range(1 << max_val):
                s = 0
                for j in range(max_val):
                    if i & (1 << j):
                        s += p * powA[j + (lim // 2 if t == 1 else 0)] + q * powB[j + (lim // 2 if t == 1 else 0)]
                        if s > INF:
                            break
                else:
                    if t == 0:
                        pending
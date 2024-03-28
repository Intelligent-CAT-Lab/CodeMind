class main:
    import sys
    
    def pow(a, n):
        ret = 1
        for _ in range(n):
            ret *= a
        return ret
    
    def main():
        n, m, a, b, p, q = map(int, sys.stdin.readline().split())
        INF = 10000000000000000
        if a == 1 and b == 1:
            ans = min(abs(m - (m // (p + q)) * (p + q)), abs(m - ((m // (p + q)) + 1) * (p + q)))
            print(ans)
            return
        lim = 0
        while p * pow(a, lim) + q * pow(b, lim) <= m:
            lim += 1
        lim = min(lim, n, 40)
        pending1 = []
        pending2 = []
        powA = [1] * 42
        powB = [1] * 42
        for i in range(1, 42):
            powA[i] = powA[i - 1] * a
            powB[i] = powB[i - 1] * b
        for t in range(2):
            max = lim // 2 if t == 0 else (lim + 1) // 2
            for i in range(1 << max):
                s = 0
                for j in range(max):
                    if (i & (1 << j)) > 0:
                        s += p * powA[j + (t == 1) * (lim // 2)] + q * powB[j + (t == 1) * (lim // 2)]
                        if s > INF:
                            continue
                if t == 0:
                    pending
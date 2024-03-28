class main:
    import sys
    
    def main():
        n, m, a, b, p, q = map(int, sys.stdin.readline().split())
        INF = 1000_000_000_000_000L
        if a == 1 and b == 1:
            # (p+q)N
            ans = INF
            div = m / (p + q)
            div = min(div, n)
            ans = min(ans, abs(div * (p + q) - m))
            div = min(div + 1, n)
            ans = min(ans, abs(div * (p + q) - m))
            print(ans)
            return
        # pa^k+qb^k
        lim = 0
        while p * pow(a, lim) + q * pow(b, lim) <= m:
            lim += 1
        lim += 1
        lim = min(lim, n)
        lim = min(lim, 40)
        pending1 = []
        pending2 = []
        powA = [1]
        powB = [1]
        for i in range(1, 42):
            powA.append(powA[i - 1] * a)
            powB.append(powB[i - 1] * b)
        for t in range(2):
            max = (t == 0? lim / 2 : (lim + 1) / 2)
            for i in range(1 << max):
                s = 0
                for j in range(max):
                    if (i & (1 << j)) > 0:
                        s += p * powA[(int) (j + (t == 1? lim / 2 : 0))] + q * powB[(int) (j + (t == 1? lim / 2 : 0))]
                        if s > INF:
                            break
                if t == 0:
                    pending
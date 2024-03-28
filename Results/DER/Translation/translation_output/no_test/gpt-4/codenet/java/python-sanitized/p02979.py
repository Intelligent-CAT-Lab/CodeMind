def add(a, b):
    res = a + b
    return res - MOD if res >= MOD else res

def mul(a, b):
    res = (a * b) % MOD
    return res + MOD if res < 0 else res

def solve2(n, k):
    dyn = [1] * k
    for i in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v)
        dyn[0] = v
    return dyn[k - 1]

def solve():
    n = scan_int()
    k = scan_int()
    global MOD
    MOD = scan_int()
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1)), end='')
    else:
        dyn = [[0 for _ in range(k + 2)] for _ in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0 for _ in range(k + 2)] for _ in range(k + 2)]
        for i in range((n | 1) // 2 + k // 2 + 2):
            for a in ndyn:
                a[:] = [0] * (k + 2)
            mask = (1 if i < (n + 1) // 2 else 0) + (2 if i >= k // 2 + 2 else 0)
            m = mask
            while True:
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = min(j + 1, k + 1) if (m & 1) != 0 else 0
                        njj = max(j, jj) + 1 if (m & 2) != 0 and (j != 0 or jj != 0) else 0
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj])
                if m == 0:
                    break
                m = (m - 1) & mask
            
            dyn, ndyn = ndyn, dyn
        
        ans = sum(sum(row[:k + 2]) for row in dyn[:k + 2])
        print(ans, end='')

def scan_int():
    return int(scan_string())

def scan_long():
    return int(scan_string())

def scan_string():
    global tok
    while tok is None or not tok:
        tok = iter(input().split())
    return next(tok)

if __name__ == "__main__":
    try:
        tok = None
        solve()
    except Exception as e:
        print(e)
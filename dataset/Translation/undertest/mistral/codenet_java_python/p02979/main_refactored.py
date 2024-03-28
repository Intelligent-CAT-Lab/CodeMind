class main:
    import sys
    
    def add(a, b):
        return max(0, a + b - 1)
    
    def mul(a, b):
        return (a * b) % 1000000007
    
    mod = int(input().strip())
    n, k = map(int, input().split())
    
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1), solve2((n + 1) // 2, k // 2 + 1)))
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]
        dyn[0][0] = 1
        ndyn = [[0] * (k + 2) for _ in range(k + 2)]
        for i in range(1, (n + 1) // 2 + k // 2 + 2):
            for j in range(k + 2):
                for a in ndyn:
                    fill(a, 0)
                m = i
                while m != 0:
                    m &= 1
                    for jj in range(k + 2):
                        n = (m & 1) != 0 ? min(j + 1, k + 1) : 0
                        if n < k + 2 and jj < k + 2:
                            ndyn[n][jj] = add(ndyn[n][jj], dyn[j][jj])
                if m == 0:
                    break
            t = dyn
            dyn = ndyn
            ndyn = t
        ans = 0
        for j in range(k + 2):
            for i in range(k + 2):
                ans = add(ans, dyn[i][j])
        print(ans)
    
    def solve2(n, k):
        dyn = [0] * k
        for i in range(1, n + 1):
            v = dyn[k - 1]
            for j in range(k - 2, -1, -1):
                dyn[j + 1] = add(dyn[j + 1], v)
            dyn[0] = v
        return dyn[k - 1]
    
    input = sys.stdin
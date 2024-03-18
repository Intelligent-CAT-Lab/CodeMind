def add(a, b, mod):
    res = a + b
    return res - mod if res >= mod else res

def mul(a, b, mod):
    res = (a * b) % mod
    return res + mod if res < 0 else res

def solve2(n, k, mod):
    dyn = [1] * k
    for _ in range(n):
        v = dyn[k - 1]
        for j in range(k - 2, -1, -1):
            dyn[j + 1] = add(dyn[j], v, mod)
        dyn[0] = v
    return dyn[k - 1]

def main():
    n, k, mod = map(int, input().split())
    if k % 2 == 0:
        print(mul(solve2(n // 2, k // 2 + 1, mod), solve2((n + 1) // 2, k // 2 + 1, mod), mod))
    else:
        dyn = [[0] * (k + 2) for _ in range(k + 2)]

        dyn[0][0] = 1
        for i in range((n | 1) // 2 + k // 2 + 2):
            ndyn = [[0] * (k + 2) for _ in range(k + 2)]

            mask = (1 if i < (n + 1) // 2 else 0) + (2 if i >= k // 2 + 2 else 0)
            m = mask
            while True:
                for j in range(k + 2):
                    for jj in range(k + 2):
                        nj = min(j + 1, k + 1) if (m & 1) else 0
                        njj = max(j, jj) + 1 if (m & 2) and (j != 0 or jj != 0) else 0
                        if nj < k + 2 and njj < k + 2:
                            ndyn[nj][njj] = add(ndyn[nj][njj], dyn[j][jj], mod)

                if m == 0:
                    break
                m = (m - 1) & mask

            dyn, ndyn = ndyn, dyn

        ans = 0
        for i in range(k + 2):
            for j in range(k + 2):
                ans = add(ans, dyn[i][j], mod)
        print(ans)

if __name__ == "__main__":
    main()
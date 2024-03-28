def main():
    N, K, M = map(int, input().split())
    MASK = (1 << K) - 1
    if N < K:
        print(naive())
        return
    dp = [[[0 for _ in range(1 << K)] for _ in range(K + 1)] for _ in range(2)]
    for i in range(1 << K):
        c = 0
        ok = True
        for j in range(K):
            if (i & (1 << (K - 1 - j))) == 0:
                c -= 1
            else:
                c += 1
            if c < 0:
                ok = False
                break
        if not ok:
            continue
        u = bin(i).count('1')
        l = K - u
        if u < l:
            continue
        dp[0][u - l][i] = 1
    t = 1
    for i in range(K, 2 * N):
        for a in dp[t]:
            for idx, val in enumerate(a):
                a[idx] = 0
        for j in range(i % 2, K + 1, 2):
            l = (i - j) // 2
            u = l + j
            for k in range(1 << K):
                uc = bin(k).count('1')
                if 0 < j <= uc and (l == 0 or k != MASK):
                    dp[t][j - 1][(k << 1) & MASK] += dp[1 - t][j][k]
                    dp[t][j - 1][(k << 1) & MASK] %= M
                if u < N and j < K and k != 0:
                    dp[t][j + 1][((k << 1) + 1) & MASK] += dp[1 - t][j][k]
                    dp[t][j + 1][((k << 1) + 1) & MASK] %= M
        t = 1 - t
    ans = sum(dp[1 - t][0]) % M
    print(ans)

def naive():
    u = [0]
    return rec(u, [], 1)

def rec(u, l, cur):
    if cur == 2 * N:
        return 1
    ret = 0
    if len(u) < N:
        u.append(cur)
        ret += rec(u, l, cur + 1)
        u.pop()
    if len(l) < len(u) and cur <= u[len(l)] + K:
        l.append(cur)
        ret += rec(u, l, cur + 1)
        l.pop()
    return ret % M

if __name__ == '__main__':
    main()
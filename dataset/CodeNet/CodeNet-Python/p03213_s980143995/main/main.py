# 入力
N = int(eval(input()))

# pfacから次数がn以上の素数の数を返す
def p_deg_le(pfac, n):
    ret = 0
    for p_deg in pfac:
        if p_deg[1] >= n: ret += 1
        else: break
    return ret


# 100までの素数
P = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]

# N!を素因数分解
pfac = {} # N!の素因数分解
for i in range(1, N + 1):
    for p in P:
        while i % p == 0:
            if p in pfac:   pfac[p] += 1
            else:           pfac[p] = 1
            i //= p

# 次数の多い素数が前にくるようソート
pfac = sorted(list(pfac.items()), reverse = True, key = lambda x : x[1])

fact = 1
for p_deg in pfac:
    fact *= p_deg[0] ** p_deg[1]


# 約数が75 = 3 * 5 * 5個あるN!の約数は以下のいずれかの形のq
# q = p1^74, q = p1^24 * p2^2, q = p1^14 * p2^4,
# q = p1^4 * p2^4 * p3^2
p_deg = {}
for deg in (2, 4, 14, 24, 74):
    p_deg[deg] = p_deg_le(pfac, deg)

# q = p1^4 * p2^4 * p3^2
ans = (p_deg[4] * (p_deg[4] - 1) // 2) * (p_deg[2] - 2)
# q = p1^14 * p2^4
ans += p_deg[14] * (p_deg[4] - 1)
# q = p1^24 * p2^2
ans += p_deg[24] * (p_deg[2] - 1)
# q = p1^74
ans += p_deg[74]

print(ans)

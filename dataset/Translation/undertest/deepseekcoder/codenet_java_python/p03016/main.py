import sys

def read_input():
    L, A, B, M = map(int, sys.stdin.readline().split())
    return L, A, B, M

def init_matrix(M):
    m = [[0, 0, 0] for _ in range(3)]
    m[0][0] = M
    m[1][0] = m[2][1] = 1
    m[2][2] = 1
    return m

def modpow(m, c, M):
    if c == 0:
        return [[1, 0, 0], [0, 1, 0], [0, 0, 1]]
    elif c == 1:
        return m
    elif c % 2 == 0:
        m1 = modpow(m, c // 2, M)
        return mult(m1, m1, M)
    else:
        m1 = modpow(m, c - 1, M)
        return mult(m1, m, M)

def mult(a, b, M):
    r = [0, 0, 0]
    for i in range(3):
        for j in range(3):
            r[i] += a[j] * b[j][i] % M
            if r[i] >= M:
                r[i] -= M
    return r

def solve(L, A, B, M):
    m = init_matrix(M)
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
    return res[0]

if __name__ == "__main__":
    L, A, B, M = read_input()
    print(solve(L, A, B, M))
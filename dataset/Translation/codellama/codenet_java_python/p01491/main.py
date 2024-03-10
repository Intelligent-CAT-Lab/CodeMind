import sys

def solver():
    M, N, m0, md, n0, nd = map(int, sys.stdin.readline().split())
    m = [m0] + [0] * (M - 1)
    n = [n0] + [0] * (N - 1)

    for i in range(1, M):
        m[i] = (m[i - 1] * 58 + md) % (N + 1)

    for i in range(1, N):
        n[i] = (n[i - 1] * 58 + nd) % (M + 1)

    m = sorted(m, key=lambda x: x)
    n = sorted(n, key=lambda x: x)

    accum_n = [0] * (N + 1)
    accum_m = [0] * (M + 1)
    for i in range(N):
        accum_n[i + 1] = accum_n[i] + n[i]

    for i in range(M):
        accum_m[i + 1] = accum_m[i] + m[i]

    cur = N
    sum = accum_m[0] + accum_n[cur] + (N - cur) * (M - 0)
    for i in range(1, M + 1):
        while cur >= 1 and accum_m[i] + accum_n[cur] + (N - cur) * (M - i) >= accum_m[i] + accum_n[cur - 1] + (N - (cur - 1)) * (M - i):
            cur -= 1
        sum = min(sum, accum_m[i] + accum_n[cur] + (N - cur) * (M - i))

    print(sum)

if __name__ == "__main__":
    solver()
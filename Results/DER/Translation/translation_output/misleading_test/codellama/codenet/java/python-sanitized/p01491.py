import sys

def sort(arr, max):
    counter = [0] * (max + 1)
    for i in range(len(arr)):
        counter[arr[i]] += 1
    pos = 0
    for i in range(len(counter)):
        while counter[i] > 0:
            arr[pos] = i
            pos += 1
            counter[i] -= 1
    return arr

def solver():
    M, N, m0, md, n0, nd = map(int, sys.stdin.readline().split())
    m = [m0] + [0] * (M - 1)
    n = [n0] + [0] * (N - 1)
    for i in range(1, M):
        m[i] = (m[i - 1] * 58 + md) % (N + 1)
    for i in range(1, N):
        n[i] = (n[i - 1] * 58 + nd) % (M + 1)
    m = sort(m, N)
    n = sort(n, M)
    accumN = [0] * (N + 1)
    accumM = [0] * (M + 1)
    for i in range(N):
        accumN[i + 1] = accumN[i] + n[i]
    for i in range(M):
        accumM[i + 1] = accumM[i] + m[i]
    cur = N
    sum = accumM[0] + accumN[cur] + (N - cur) * (M - 0)
    for i in range(1, M + 1):
        while cur >= 1 and accumM[i] + accumN[cur] + (N - cur) * (M - i) >= accumM[i] + accumN[cur - 1] + (N - (cur - 1)) * (M - i):
            cur -= 1
        sum = min(sum, accumM[i] + accumN[cur] + (N - cur) * (M - i))
    print(sum)

if __name__ == "__main__":
    solver()
class main:
    import sys
    
    def sort(a, max):
        counter = [0]*(max+1)
        for i in a:
            counter[i] += 1
        pos = 0
        for i in range(len(counter)):
            while 0 < counter[i]:
                a[pos] = i
                pos += 1
                counter[i] -= 1
        return a
    
    def main():
        M, N, m0, md, n0, nd = map(int, sys.stdin.readline().split())
        m = [0]*M
        n = [0]*N
        m[0] = m0
        n[0] = n0
        for i in range(1, M):
            m[i] = (m[i-1]*58 + md) % (N+1)
        for i in range(1, N):
            n[i] = (n[i-1]*58 + nd) % (M+1)
        m = sort(m, N)
        n = sort(n, M)
        accumN = [0]*(N+1)
        accumM = [0]*(M+1)
        for i in range(N):
            accumN[i+1] = accumN[i] + n[i]
        for i in range(M):
            accumM[i+1] = accumM[i] + m[i]
        cur = N
        sum = accumM[0] + accumN[cur] + (N-cur)*(M-0)
        for i in range(M+1):
            while cur >= 1 and accumM[i] + accumN[cur] + (N-cur)*(M-i) >= accumM[i] + accumN[cur-1] + (N-(cur-1))*(M-i):
                cur -= 1
            sum = min(sum, accumM[i] + accumN[cur] + (N-cur)*(M-i))
        print(sum)
    
    if __name__ == "__main__":
        main()
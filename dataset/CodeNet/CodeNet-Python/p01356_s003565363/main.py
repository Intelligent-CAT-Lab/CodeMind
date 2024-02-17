import sys
readline = sys.stdin.readline
write = sys.stdout.write
def solve():
    N, M, A, B, P, Q = map(int, readline().split())
    ans = M
    if A == B == 1:
        v = P+Q
        k = min(N, M // v)
        ans = min(ans, M - k*v)
        if k+1 <= N:
            ans = min(ans, (k+1)*v - M)
    else:
        k = 0
        V = []
        va = 1; vb = 1
        while k < N:
            v = P*va + Q*vb
            V.append(v)
            if v > M:
                break
            va *= A; vb *= B
            k += 1
        def make(S):
            s = {0}
            for v in S:
                t = set(s)
                for e in s:
                    t.add(e + v)
                s = t
            return sorted(s)
        L = len(V)
        S0 = make(V[:L//2]); S1 = make(V[L//2:])
        t = len(S1)-1
        for s0 in S0:
            while t > 0 and s0 + S1[t] > M:
                t -= 1
            if s0 + S1[t] <= M:
                ans = min(ans, M - s0 - S1[t])
        t = len(S1)-1
        for s0 in S0:
            while t > 0 and s0 + S1[t-1] >= M:
                t -= 1
            if s0 + S1[t] >= M:
                ans = min(ans, s0 + S1[t] - M)
    write("%d\n" % ans)
solve()

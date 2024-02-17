
while True:
    n=int(input())
    if n == 0: break
    ss = [ input() for _ in range(n) ]
    ts = [ s for s in ss if all ( t.find(s) < 0 for t in ss if not (t == s)) ]
    m = len(ts)

    def overlap(c, d):
        sc = ts[c]
        sd = ts[d]
        s = len(sc)
        return max ( s - i for i in range(s+1) if sd.startswith(sc[i:]) )

    ov = [ [ overlap(c,d) for d in range(m) ] for c in range(m)]

    memo = [ [ -1 for _ in range(1<<m) ] for _ in range(m) ]
    # c : the tail city
    # cs : cities to be used (bit set)
    def rec(c, cs):
        if cs == 0: return 0
        if memo[c][cs] >= 0: return memo[c][cs]
        ans= max (ov[c][d] + rec(d, cs - (1<<d)) for d in range(n) if not (((1<<d) & cs) == 0))
        memo[c][cs] = ans
        return ans

    # naive version
    # c : the tail city
    # cs : cities to be used (set)
    # def rec(c, cs):
    #     if len(cs) == 0: return 0
    #     return max (overlap(c, d) + rec(d, cs - {d}) for d in cs)
    # maxov =  max ( rec(i, { j for j in range (m) if not (j == i) } ) for i in range (m) )

    maxov =  max ( rec(i, ((1<<m) - 1) - (1<<i) ) for i in range (m) )
    ans = sum (len(t) for t in ts) - maxov
    print(ans)


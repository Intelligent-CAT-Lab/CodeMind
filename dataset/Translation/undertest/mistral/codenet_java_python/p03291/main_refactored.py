class main:
    def power(a, e, mod):
        ret = 1
        for e in range(e):
            if e % 2 == 1:
                ret = (ret * a) % mod
            a = (a * a) % mod
        return ret
    
    def solve(testNumber, in, out):
        s = in.readline().strip()
        n = len(s)
        ac = [0] * (n+1)
        bc = [0] * (n+1)
        cc = [0] * (n+1)
        xc = [0] * (n+1)
        for i in range(n):
            if s[i] == 'A':
                ac[i+1] += ac[i]
            elif s[i] == 'B':
                bc[i+1] += bc[i]
            elif s[i] == 'C':
                cc[i+1] += cc[i]
            elif s[i] == '?':
                xc[i+1] += xc[i]
        ans = 0
        for i in range(n):
            if s[i] == 'B' or s
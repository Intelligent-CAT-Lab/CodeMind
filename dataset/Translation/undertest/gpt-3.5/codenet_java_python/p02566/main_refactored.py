class main:
    def lcpArray(s, sa):
        n = len(s)
        rnk = [0] * n
        for i in range(n):
            rnk[sa[i]] = i
        lcp = [0] * (n - 1)
        h = 0
        for i in range(n):
            if h > 0:
                h -= 1
            if rnk[i] == 0:
                continue
            j = sa[rnk[i] - 1]
            while j + h < n and i + h < n and s[j + h] == s[i + h]:
                h += 1
            lcp[rnk[i] - 1] = h
        return lcp
    
    def sais(s, upper):
        n = len(s)
        if n == 0:
            return []
        if n == 1:
            return [0]
        if n == 2:
            return [0, 1]
        if n < 10:
            return saNaive(s)
        if n < 40:
            return saDoubling(s)
        
        return sa
    
    def saNaive(s):
        n = len(s)
        sa = [i for i in range(n)]
        sa.sort(key=lambda i: s[i:n] + s[:i])
        return sa
    
    def saDoubling(s):
        n = len(s)
        sa = [i for i in range(n)]
        rnk = s.copy()
        tmp = [0] * n
    
        k = 1
        while k < n:
            cmp = lambda x, y: rnk[x] - rnk[y] if rnk[x] != rnk[y] else rnk[x + k] - rnk[y + k] if x + k < n and y + k < n else x - y
            sa.sort(key=lambda x: cmp(x, x+k))
            tmp[sa[0]] = 0
            for i in range(1, n):
                tmp[sa[i]] = tmp[sa[i - 1]] + 1 if cmp(sa[i - 1], sa[i]) < 0 else tmp[sa[i - 1]]
            buf = tmp
            tmp = rnk
            rnk = buf
            k *= 2
        return sa
    
    def suffixArray(s, upper):
        return sais(s, upper)
    
    def lcpArrayChar(s):
        is_ = [ord(c) for c in s]
        return lcpArray(is_, suffixArray(is_, 255))
    
    def solve():
        s = input().strip()
        n = len(s)
        lcp = lcpArrayChar(s)
        result = n * (n + 1) // 2 - sum(lcp)
        print(result)
    
    if __name__ == "__main__":
        solve()
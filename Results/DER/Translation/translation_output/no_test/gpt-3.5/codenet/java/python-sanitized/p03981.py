import numpy as np

class SuffixArray:
  
    def suffixArray(self, string, W):
        n = len(string)
        if n <= 1:
            return [0]*n
        
        sa = [0]*n
        s = np.zeros(n+3, dtype=int)
        for i in range(n):
            s[i] = ord(string[i]) - ord('a') + 1
        
        self.suffixArrayHelper(s, sa, n, W+1)
        return sa

    def suffixArrayHelper(self, s, sa, n, K):
        n0 = (n+2)//3
        n1 = (n+1)//3
        n2 = n//3
        n02 = n0 + n2
        s12 = np.zeros(n02+3, dtype=int)
        sa12 = np.zeros(n02+3, dtype=int)
        s0 = np.zeros(n0, dtype=int)
        sa0 = np.zeros(n0, dtype=int)

        sup = n + (n0 - n1)
        j = 0
        for i in range(sup):
            if i + 1 < sup:
                s12[j] = i + 1
                j += 1
            if i + 2 < sup:
                s12[j] = i + 2
                j += 1

        self.radixPass(s12, sa12, s, 2, n02, K)
        self.radixPass(sa12, s12, s, 1, n02, K)
        self.radixPass(s12, sa12, s, 0, n02, K)
        
        name = 0
        c0, c1, c2 = -1, -1, -1
        for i in range(n02):
            if s[sa12[i]] != c0 or s[sa12[i]+1] != c1 or s[sa12[i]+2] != c2:
                name += 1
                c0 = s[sa12[i]]
                c1 = s[sa12[i]+1]
                c2 = s[sa12[i]+2]
            
            if sa12[i] % 3 == 1:
                s12[sa12[i]//3] = name
            else:
                s12[sa12[i]//3 + n0] = name
        
        if name < n02:
            self.suffixArrayHelper(s12, sa12, n02, name)
            for i in range(n02):
                s12[sa12[i]] = i + 1
        else:
            for i in range(n02):
                sa12[s12[i]-1] = i

        j = 0
        for i in range(n02):
            if sa12[i] < n0:
                s0[j] = 3 * sa12[i]
                j += 1

        self.radixPass(s0, sa0, s, 0, n0, K)
        
        p, t, k = 0, n0-n1, 0
        while k < n:
            i = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
            j = sa0[p]
            
            if (sa12[t] < n0  and (s[i] < s[j] or (s[i] == s[j] and s12[sa12[t]+n0] <= s12[j//3])) or 
                sa12[t] >= n0 and (s[i] < s[j] or (s[i] == s[j] and (s[i+1] < s[j+1] or (s[i+1] == s[j+1] and s12[sa12[t]-n0+1] <= s12[j//3+n0])))):
                sa[k] = i
                t += 1
                if t == n02:
                    for _ in range(p, n0):
                        k += 1
                        sa[k] = sa0[_]
            else:
                sa[k] = j
                p += 1
                if p == n0:
                    for _ in range(t, n02):
                        k += 1
                        sa[k] = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
            k += 1
            
    def radixPass(self, a, b, r, l, n, K):
        c = np.zeros(K+1, dtype=int)
        for i in range(n):
            c[r[l+a[i]]] += 1
        
        for i in range(K+1):
            c[i], c[i-1] = c[i-1], c[i]
        
        for i in range(n):
            b[c[r[l+a[i]]]] = a[i]

    def buildLCP0(self, string, sa):
        n = len(string)
        h = 0
        lcp = [0]*n
        b = {}
        for i in range(n):
            b[sa[i]] = i
            
        for i in range(n):
            if b[i] > 0:
                j = sa[b[i]-1]
                while j+h < n and i+h < n and string[j+h] == string[i+h]:
                    h += 1
                lcp[b[i]] = h
            else:
                lcp[b[i]] = 0
            
            if h > 0:
                h -= 1
        
        return lcp
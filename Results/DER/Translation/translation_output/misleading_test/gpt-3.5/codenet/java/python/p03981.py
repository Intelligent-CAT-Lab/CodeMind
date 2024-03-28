```python
class SuffixArray:

    @staticmethod
    def suffixArray(s, W):
        n = len(s)
        if n <= 1:
            return [0] * n
        sa = [0] * n
        s = [ord(char) - ord('a') + 1 for char in s]
        SuffixArray.suffixArrayHelper(s, sa, n, W + 1)
        return sa

    @staticmethod
    def suffixArrayHelper(s, sa, n, K):
        n0 = (n + 2) // 3
        n1 = (n + 1) // 3
        n2 = n // 3
        n02 = n0 + n2
        s12 = [0] * (n02 + 3)
        sa12 = [0] * (n02 + 3)
        s0 = [0] * n0
        sa0 = [0] * n0

        # Generate positions of mod 1 and mod 2 suffixes
        sup = n + (n0 - n1)
        j = 0
        for i in range(0, sup, 3):
            if i + 1 < sup:
                s12[j] = i + 1
                j += 1
            if i + 2 < sup:
                s12[j] = i + 2
                j += 1

        # LSB radix sort the mod 1 and mod 2 triples
        SuffixArray.radixPass(s12, sa12, s, 2, n02, K)
        SuffixArray.radixPass(sa12, s12, s, 1, n02, K)
        SuffixArray.radixPass(s12, sa12, s, 0, n02, K)

        # Find lexicographic names of triples
        name = 0
        c0 = c1 = c2 = -1
        for i in range(n02):
            if s[sa12[i]] != c0 or s[sa12[i] + 1] != c1 or s[sa12[i] + 2] != c2:
                name += 1
                c0, c1, c2 = s[sa12[i]], s[sa12[i] + 1], s[sa12[i] + 2]
            if sa12[i] % 3 == 1:
                s12[sa12[i] // 3] = name
            else:
                s12[sa12[i] // 3 + n0] = name

        # Recurse if names are not yet unique
        if name < n02:
            SuffixArray.suffixArrayHelper(s12, sa12, n02, name)

            for i in range(n02):
                s12[sa12[i]] = i + 1
        else:
            for i in range(n02):
                sa12[s12[i] - 1] = i

        s0 = [3 * sa12[i] for i in range(n02) if sa12[i] < n0]
        sa0 = [0] * n0
        SuffixArray.radixPass(s0, sa0, s, 0, n0, K)

        p, t, k = 0, n0 - n1, 0
        sa_tmp = [0] * n
        while k < n:
            i = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
            j = sa0[p]

            if sa12[t] < n0:
                cond = s[i] < s[j] or (s[i] == s[j] and s12[sa12[t] + n0] <= s12[j // 3])
            else:
                cond = s[i] < s[j] or (s[i] == s[j] and (s[i + 1] < s[j + 1] or (s[i + 1] == s[j + 1] and s12[sa12[t] - n0 + 1] <= s12[j // 3 + n0]))

            if cond:
                sa_tmp[k] = i
                t += 1
                if t == n02:
                    for k in range(k + 1, n):
                        sa_tmp[k] = sa0[p]
                        p += 1
                k += 1
            else:
                sa_tmp[k] = j
                p += 1
                if p == n0:
                    for k in range(k + 1, n):
                        sa_tmp[k] = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
                        t += 1
                k += 1

        sa[:] = sa_tmp

    @staticmethod
    def radixPass(a, b, r, l, n, K):
        c = [0] * (K + 1)
        for i in range(n):
            c[r[l + a[i]]] += 1

        for i in range(1, K + 1):
            c[i] += c[i - 1]

        for i in range(n - 1, -1, -1):
            b[c[r[l + a[i]]] - 1] = a[i]
            c[r[l + a[i]]] -= 1

    @staticmethod
    def buildLCP0(s, sa):
        n = len(s)
        h = 0
        lcp = [0] * n
        b = [0] * n
        for i in range(n):
            b[sa[i]] = i

        for i in range(n):
            if b[i] > 0:
                j = sa[b[i] - 1]
                while j + h < n and i + h < n and s[j + h] == s[i + h]:
                    h += 1
                lcp[b[i]] = h
            else:
                lcp[b[i]] = 0
            if h > 0:
                h -= 1

        return lcp

def solve():
    s = input().strip()
    sa = SuffixArray.suffixArray(s, 50)
    lcp = SuffixArray.buildLCP0(s, sa)
    
    n = len(s)
    imos = [0] * (n + 1)
    
    for i in range(n):
        imos[lcp[i]] += 1
    
    for i in range(n):
        imos[i + 1] += imos[i]
    
    max_val = 0
    for i in range(n):
        max_val = max(max_val, imos[i] - i)
    
    print(max_val)

if __name__ == '__main__':
    solve()

```


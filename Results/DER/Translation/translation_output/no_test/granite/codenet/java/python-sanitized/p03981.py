import java.util.Arrays;

class SuffixArray:
    @staticmethod
    def suffixArray(str, W):
        n = len(str)
        if n <= 1:
            return [0] * n
        s = [ord(c) - ord('a') + 1 for c in str]
        sa = [0] * n
        s_ = [0] * (n + 3)
        for i in range(n):
            s_[i] = s[i]
        SuffixArray.suffixArray(s_, sa, n, W + 1)
        return sa

    @staticmethod
    def suffixArray(s, sa, n, K):
        n0 = (n + 2) // 3
        n1 = (n + 1) // 3
        n2 = n // 3
        n02 = n0 + n2
        s12 = [0] * (n02 + 3)
        sa12 = [0] * (n02 + 3)
        s0 = [0] * n0
        sa0 = [0] * n0

        # generate positions of mod 1 and mod 2 suffixes
        # the "+(n0-n1)" adds a dummy mod 1 suffix if n%3 == 1
        sup = n + (n0 - n1)
        for i, j in enumerate(range(0, sup, 3)):
            if j + 1 < sup:
                s12[i] = j + 1
            if j + 2 < sup:
                s12[i + n0] = j + 2

        # lsb radix sort the mod 1 and mod 2 triples
        SuffixArray.radixPass(s12, sa12, s, 2, n02, K)
        SuffixArray.radixPass(sa12, s12, s, 1, n02, K)
        SuffixArray.radixPass(s12, sa12, s, 0, n02, K)

        # find lexicographic names of triples
        name = 0
        c0, c1, c2 = -1, -1, -1
        for i in range(n02):
            if s[sa12[i]]!= c0 or s[sa12[i] + 1]!= c1 or s[sa12[i] + 2]!= c2:
                name += 1
                c0 = s[sa12[i]]
                c1 = s[sa12[i] + 1]
                c2 = s[sa12[i] + 2]
            if sa12[i] % 3 == 1:
                s12[sa12[i] // 3] = name
            else:
                s12[sa12[i] // 3 + n0] = name

        # recurse if names are not yet unique
        if name < n02:
            SuffixArray.suffixArray(s12, sa12, n02, name)
            # store unique names in s12 using the suffix array
            for i in range(n02):
                s12[sa12[i]] = i + 1
        else:
            # generate the suffix array of s12 directly
            for i in range(n02):
                sa12[s12[i] - 1] = i

        # stably sort the mod 0 suffixes from sa12 by their first character
        for i, j in enumerate(range(0, n02, 1)):
            if sa12[j] < n0:
                s0[i] = 3 * sa12[j]
            else:
                s0[i] = (3 * sa12[j] + 1)

        SuffixArray.radixPass(s0, sa0, s, 0, n0, K)

        # merge sorted sa0 suffixes and sorted sa12 suffixes
        p, t = 0, n0 - n1
        for k in range(n):
            i = sa12[t] if sa12[t] < n0 else (sa12[t] - n0) * 3 + 1
            j = sa0[p]
            if sa12[t] < n0:
                if s[i] < s[j] or s[i] == s[j] and s12[sa12[t] + n0] <= s12[j // 3]:
                    sa[k] = i
                    t += 1
                    if t == n02:
                        # done --- only sa0 suffixes left
                        for k in range(k + 1, n):
                            sa[k] = sa0[p]
                            p += 1
                else:
                    # suffix from a12 is smaller
                    sa[k] = j
                    p += 1
                    if p == n0:
                        # done --- only sa12 suffixes left
                        for k in range(k + 1, n):
                            sa[k] = sa12[t] if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
                            t += 1

    @staticmethod
    def radixPass(a, b, r, l, n, K):
        c = [0] * (K + 1)  # counter array
        for i in range(n):
            c[r[l + a[i]]] += 1
        for i in range(1, K + 1):
            c[i] += c[i - 1]
        for i in range(n):
            b[c[r[l + a[i]]] - 1] = a[i]
            c[r[l + a[i]]] -= 1

    @staticmethod
    def buildLCP0(str, sa):
        n = len(str)
        h = 0
        lcp = [0] * n
        b = [0] * n
        for i in range(n):
            b[sa[i]] = i
        for i in range(n):
            if b[i] > 0:
                for j in range(sa[b[i] - 1], min(n, sa[b[i]] + h + 1)):
                    if i + h < n and j + h < n and str[j + h] == str[i + h]:
                        h += 1
                    else:
                        break
                lcp[b[i]] = h
            if h > 0:
                h -= 1
        return lcp

def solve():
    s = input()
    sa = SuffixArray.suffixArray(s, 50)
    lcp = SuffixArray.buildLCP0(s, sa)

    n = len(s)
    imos = [0] * (n + 1)

    for i in range(n):
        imos[lcp[i]] += 1

    for i in range(n):
        imos[i + 1] += imos[i]

    print(max(imos[i] - i for i in range(n)))

if __name__ == '__main__':
    solve()
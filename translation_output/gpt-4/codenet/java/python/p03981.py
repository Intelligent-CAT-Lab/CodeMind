Below is the Python equivalent of the provided Java code:

```python
class SuffixArray:

    @staticmethod
    def suffix_array(str, W):
        n = len(str)
        if n <= 1: return [0] * n
        sa = [0] * n
        s = [0] * (n + 3)
        for i in range(n): s[i] = ord(str[i]) - ord('a') + 1
        SuffixArray.suffix_array_int(s, sa, n, W + 1)
        return sa

    @staticmethod
    def suffix_array_int(s, sa, n, K):
        n0 = (n + 2) // 3
        n1 = (n + 1) // 3
        n2 = n // 3
        n02 = n0 + n2
        s12 = [0] * (n02 + 3)
        sa12 = [0] * (n02 + 3)
        s0 = [0] * n0
        sa0 = [0] * n0

        # generate positions of mod 1 and mod 2 suffixes
        # the "+(n0 - n1)" adds a dummy mod 1 suffix if n % 3 == 1
        sup = n + (n0 - n1)
        j = 0
        for i in range(0, sup, 3):
            if i + 1 < sup: s12[j] = i + 1; j += 1
            if i + 2 < sup: s12[j] = i + 2; j += 1

        # lsb radix sort the mod 1 and mod 2 triples
        SuffixArray.radix_pass(s12, sa12, s, 2, n02, K)
        SuffixArray.radix_pass(sa12, s12, s, 1, n02, K)
        SuffixArray.radix_pass(s12, sa12, s, 0, n02, K)

        # find lexicographic names of triples
        name = 0
        c0 = -1
        c1 = -1
        c2 = -1
        for i in range(n02):
            if s[sa12[i]] != c0 or s[sa12[i] + 1] != c1 or s[sa12[i] + 2] != c2:
                name += 1
                c0 = s[sa12[i]]
                c1 = s[sa12[i] + 1]
                c2 = s[sa12[i] + 2]
            if sa12[i] % 3 == 1:
                s12[sa12[i] // 3] = name  # left half
            else:
                s12[sa12[i] // 3 + n0] = name  # right half

        # recurse if names are not yet unique
        if name < n02:
            SuffixArray.suffix_array_int(s12, sa12, n02, name)
            # store unique names in s12 using the suffix array
            for i in range(n02): s12[sa12[i]] = i + 1
        else:
            # generate the suffix array of s12 directly
            for i in range(n02): sa12[s12[i] - 1] = i

        # stably sort the mod 0 suffixes from sa12 by their first character
        j = 0
        for i in range(n02):
            if sa12[i] < n0: s0[j] = 3 * sa12[i]; j += 1

        SuffixArray.radix_pass(s0, sa0, s, 0, n0, K)

        # merge sorted sa0 suffixes and sorted sa12 suffixes
        p = 0
        t = n0 - n1
        k = 0
        while k < n:
            i = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
            j = sa0[p]
            if sa12[t] < n0:
                less = s[i] < s[j]
            else:
                less = True if s[i] != s[j] else s[i + 1] < s[j + 1] if s[i + 1] != s[j + 1] else s12[sa12[t] - n0 + 1] <= s12[j // 3 + n0]
            if less:
                # suffix from sa12 is smaller
                sa[k] = i
                t += 1
                if t == n02:
                    # done --- only sa0 suffixes left
                    k += 1; p += 1
                    while p < n0:
                        sa[k] = sa0[p] 
                        p += 1; k += 1
            else:
                # suffix from sa0 is smaller
                sa[k] = j 
                p += 1
                if p == n0:
                    # done --- only sa12 suffixes left
                    k += 1; t += 1
                    while t < n02:
                        sa[k] = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
                        t += 1; k += 1
            k += 1

    @staticmethod
    def radix_pass(a, b, r, l, n, K):
        c = [0] * (K + 1)  # counter array
        for i in range(n): c[r[l + a[i]]] += 1  # count occurrences
        sum = 0
        # exclusive prefix sums
        for i in range(K + 1):
            t = c[i]
            c[i] = sum
            sum += t
        for i in range(n):
            b[c[r[l + a[i]]]] = a[i]
            c[r[l + a[i]]] += 1

    @staticmethod
    def build_LCP0(str, sa):
        n = len(str)
        h = 0
        lcp = [0] * n
        b = [0] * n
        for i in range(n): b[sa[i]] = i
        for i in range(n):
            if b[i] > 0:
                while h < n and i + h < n and str[sa[b[i] - 1] + h] == str[i + h]:
                    h += 1
                lcp[b[i]] = h
            else:
                lcp[b[i]] = 0
            if h > 0: h -= 1
        return lcp

def solve(s):
    sa = SuffixArray.suffix_array(s, 50)
    lcp = SuffixArray.build_LCP0(s, sa)
    
    n = len(s)
    imos = [0] * (n + 1)
    
    for i in range(n):
        imos[lcp[i]] += 1
    
    for i in range(n - 1):
        imos[i + 1] += imos[i]
    
    max_value = max(imos[i] - i for i in range(n))
    
    print(max_value)

# Read input and call solve function
def main():
    s = input()
    solve(s)

if __name__ == "__main__":
    main()
```

Please note the following:

1. The Java code structure around multi-threading and IO handling has been omitted for simplicity because Python does not have the same execution model and standard library classes as Java.
2. The function names have been made more Pythonic (PEP 8 compliant), which means using lowercase names with underscores instead of camelCase.
3. The main `solve` function in Python reads the input string and calls the solution logic. This replaces the Java code's stdin and stdout handling section.

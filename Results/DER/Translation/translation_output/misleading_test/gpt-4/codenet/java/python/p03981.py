Here's the Java code translated into Python:

```python
def suffix_array(s, W):
    n = len(s)
    if n <= 1:
        return list(range(n))
    sa = [0] * n
    s = [ord(char) - ord('a') + 1 for char in s] + [0, 0, 0]
    _suffix_array(s, sa, n, W + 1)
    return sa


def _suffix_array(s, sa, n, K):
    n0 = (n + 2) // 3
    n1 = (n + 1) // 3
    n2 = n // 3
    n02 = n0 + n2
    s12 = [0] * (n02 + 3)
    sa12 = [0] * (n02 + 3)
    s0 = [0] * n0
    sa0 = [0] * n0
    sup = n + n0 - n1
    
    j = 0
    for i in range(0, sup, 3):
        if i + 1 < sup:
            s12[j] = i + 1
            j += 1
        if i + 2 < sup:
            s12[j] = i + 2
            j += 1
    
    radix_pass(s12, sa12, s, 2, n02, K)
    radix_pass(sa12, s12, s, 1, n02, K)
    radix_pass(s12, sa12, s, 0, n02, K)
    
    name, c0, c1, c2 = 0, -1, -1, -1
    for i in range(n02):
        if s[sa12[i]] != c0 or s[sa12[i] + 1] != c1 or s[sa12[i] + 2] != c2:
            name += 1
            c0 = s[sa12[i]]
            c1 = s[sa12[i] + 1]
            c2 = s[sa12[i] + 2]
        
        if sa12[i] % 3 == 1:
            s12[sa12[i] // 3] = name
        else:
            s12[sa12[i] // 3 + n0] = name

    if name < n02:
        _suffix_array(s12, sa12, n02, name)
        for i in range(n02):
            s12[sa12[i]] = i + 1
    else:
        for i in range(n02):
            sa12[s12[i] - 1] = i
    
    j = 0
    for i in range(n02):
        if sa12[i] < n0:
            s0[j] = 3 * sa12[i]
            j += 1
    radix_pass(s0, sa0, s, 0, n0, K)
    
    p, t, k = 0, n0 - n1, 0
    while k < n:
        i = 3 * sa12[t] + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
        j = sa0[p]

        if sa12[t] < n0:
            smaller = s[i] < s[j] or s[i] == s[j] and s12[sa12[t] + n0] <= s12[j // 3]
        else:
            smaller = s[i] < s[j] or s[i] == s[j] and (s[i + 1] < s[j + 1] or s[i + 1] == s[j + 1] and s12[sa12[t] - n0 + 1] <= s12[j // 3 + n0])
        
        if smaller:
            sa[k] = i
            t += 1
            if t == n02:
                for k in range(k + 1, k + 1 + n0 - p):
                    sa[k] = sa0[p]
                    p += 1
                break
        else:
            sa[k] = j
            p += 1
            if p == n0:
                for k in range(k + 1, k + 1 + n02 - t):
                    sa[k] = 3 * sa12[t] + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
                    t += 1
                break
        k += 1


def radix_pass(a, b, r, l, n, K):
    c = [0] * (K + 1)
    for i in range(n):
        c[r[l + a[i]]] += 1
    sum = 0
    for i in range(K + 1):
        t = c[i]
        c[i] = sum
        sum += t
    for i in range(n):
        b[c[r[l + a[i]]]] = a[i]
        c[r[l + a[i]]] += 1


def build_lcp(s, sa):
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


if __name__ == "__main__":
    s = input()
    sa = suffix_array(s, 50)
    lcp = build_lcp(s, sa)

    n = len(s)
    imos = [0] * (n + 1)
    for i in range(n):
        imos[lcp[i]] += 1
    for i in range(n):
        imos[i + 1] += imos[i]

    max_lcp = max(imos[i] - i for i in range(n))

    print(-max_lcp)
```

Please note that Python and Java have very different array handling and some APIs may not have a direct 1:1 translation. As such, some rethinking of structure and flow is required to translate Java code to Python correctly. The provided code should work in the spirit of the original Java code, but the algorithm's implementation details might need to be adjusted to Pythonic idioms for optimal performance and readability.

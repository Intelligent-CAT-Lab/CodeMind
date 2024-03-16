def suffix_array(s, W):
    n = len(s)
    if n <= 1:
        return list(range(n))
    sa = [0] * n
    s_int = [ord(char) - ord('a') + 1 for char in s] + [0, 0, 0]
    suffix_array_internal(s_int, sa, n, W + 1)
    return sa


def suffix_array_internal(s, sa, n, K):
    n0 = (n + 2) // 3
    n1 = (n + 1) // 3
    n2 = n // 3
    n02 = n0 + n2
    s12 = [0] * (n02 + 3)
    sa12 = [0] * (n02 + 3)
    s0 = [0] * n0
    sa0 = [0] * n0

    sup = n + (n0 - n1)
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
            c0, c1, c2 = s[sa12[i]], s[sa12[i] + 1], s[sa12[i] + 2]
        if sa12[i] % 3 == 1:
            s12[sa12[i] // 3] = name
        else:
            s12[sa12[i] // 3 + n0] = name

    if name < n02:
        suffix_array_internal(s12, sa12, n02, name)
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
        i = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
        j = sa0[p]
        if sa12[t] < n0:
            cond = s[i] < s[j] or (s[i] == s[j] and s12[sa12[t] + n0] <= s12[j // 3])
        else:
            cond = s[i] < s[j] or (s[i] == s[j] and (s[i + 1] < s[j + 1] or (s[i + 1] == s[j + 1] and s12[sa12[t] - n0 + 1] <= s12[j // 3 + n0])))
        if cond:
            sa[k] = i
            t += 1
            if t == n02:
                for k in range(k + 1, n):
                    p += 1
                    sa[k] = sa0[p]
                break
        else:
            sa[k] = j
            p += 1
            if p == n0:
                for k in range(k + 1, n):
                    t += 1
                    sa[k] = sa12[t] * 3 + 1 if sa12[t] < n0 else (sa12[t] - n0) * 3 + 2
                break
        k += 1


def radix_pass(a, b, r, l, n, K):
    c = [0] * (K + 1)
    for i in range(n):
        c[r[l + a[i]]] += 1
    sum = 0
    for i in range(K + 1):
        c[i], sum = sum, sum + c[i]
    for i in range(n):
        b[c[r[l + a[i]]]] = a[i]
        c[r[l + a[i]]] += 1


def build_LCP(s, sa):
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
            if h > 0:
                h -= 1
    return lcp


# This is just the "solve" function. Replace "input()" with the actual input if necessary
def solve():
    s = input()
    W = 50
    sa = suffix_array(s, W)
    lcp = build_LCP(s, sa)

    imos = [0] * (len(s) + 1)
    for i in range(len(s)):
        imos[lcp[i]] += 1
    
    for i in range(len(s) - 1):
        imos[i + 1] += imos[i]

    max_val = max(imos[i] - i for i in range(len(s)))
    print(max_val)

if __name__ == "__main__":
    solve()
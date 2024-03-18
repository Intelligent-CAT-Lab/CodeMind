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

    sa = [0] * n
    ls = [False] * n

    for i in range(n - 2, -1, -1):
        ls[i] = s[i] < s[i + 1] or (s[i] == s[i + 1] and ls[i + 1])

    sumL = [0] * (upper + 1)
    sumS = [0] * (upper + 1)

    for i in range(n):
        if ls[i]:
            sumL[s[i] + 1] += 1
        else:
            sumS[s[i]] += 1

    for i in range(upper):
        sumS[i + 1] += sumL[i]
        if i < upper:
            sumL[i + 1] += sumS[i]

    buf = [0] * (upper + 1)
    def induce(lms):
        nonlocal sa
        sa = [-1] * n
        buf[0:upper+1] = sumS[0:upper+1]

        for d in lms:
            if d == n:
                continue
            sa[buf[s[d]]] = d
            buf[s[d]] += 1

        buf[0:upper+1] = sumL[0:upper+1]
        sa[buf[s[n - 1]]] = n - 1
        buf[s[n - 1]] += 1

        for i in range(n):
            v = sa[i]
            if v >= 1 and not ls[v - 1]:
                sa[buf[s[v - 1]]] = v - 1
                buf[s[v - 1]] += 1

        buf[0:upper+1] = sumL[0:upper+1]

        for i in range(n - 1, -1, -1):
            v = sa[i]
            if v >= 1 and ls[v - 1]:
                buf[s[v - 1] + 1] -= 1
                sa[buf[s[v - 1] + 1]] = v - 1

    lmsMap = [-1] * (n + 1)
    m = 0
    for i in range(1, n):
        if not ls[i - 1] and ls[i]:
            lmsMap[i] = m
            m += 1

    lms = [i for i in range(n) if lmsMap[i] != -1]

    induce(lms)

    if m == 0:
        return sa

    sortedLms = [v for v in sa if lmsMap[v] != -1]

    recS = [0] * m
    recUpper = 0
    recS[lmsMap[sortedLms[0]]] = 0

    for i in range(1, m):
        l, r = sortedLms[i - 1], sortedLms[i]
        endL = lms[lmsMap[l] + 1] if lmsMap[l] + 1 < m else n
        endR = lms[lmsMap[r] + 1] if lmsMap[r] + 1 < m else n
        same = True
        if endL - l != endR - r:
            same = False
        else:
            while l < endL and s[l] == s[r]:
                l += 1
                r += 1
            if l == n or s[l] != s[r]:
                same = False
        if not same:
            recUpper += 1
        recS[lmsMap[sortedLms[i]]] = recUpper

    recSA = sais(recS, recUpper)

    for i in range(m):
        sortedLms[i] = lms[recSA[i]]

    induce(sortedLms)

    return sa

def suffixArray(s, upper):
    return sais(s, upper)

def indexOfSubstring(s):
    n = len(s)
    lcp = lcpArray(s, suffixArray(s, 255))
    return n * (n + 1) // 2 - sum(lcp)

# Test the function with the sample input
input_str = "abcbcba"
output = indexOfSubstring(input_str)
print(output)
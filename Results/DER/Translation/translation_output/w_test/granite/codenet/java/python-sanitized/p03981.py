def suffix_array(s):
    n = len(s)
    sa = [0] * n
    rank = [0] * n
    tmp = [0] * n
    for i in range(n):
        sa[i] = i
        rank[i] = ord(s[i])
    k = 1
    while k < n:
        for i in range(n):
            tmp[i] = (rank[i], rank[(i + k) % n])
        tmp.sort()
        rank[tmp[0]] = 0
        for i in range(1, n):
            rank[tmp[i]] = rank[tmp[i - 1]] + (tmp[i]!= tmp[i - 1])
        k *= 2
    return sa

def lcp(s, sa):
    n = len(s)
    rank = [0] * n
    for i in range(n):
        rank[sa[i]] = i
    lcp = [0] * (n - 1)
    h = 0
    for i in range(n):
        if rank[i] < n - 1:
            while s[i + h] == s[sa[rank[i] + 1] + h]:
                h += 1
            lcp[rank[i]] = h
            if h > 0:
                h -= 1
    return lcp

s = input()
sa = suffix_array(s)
lcp = lcp(s, sa)
imos = [0] * (len(s) + 1)
for i in range(len(s)):
    imos[lcp[i]] += 1
for i in range(len(s)):
    imos[i + 1] += imos[i]
print(max(imos[i] - i for i in range(len(s))))
def kmp_preprocess(p):
    m = len(p)
    pi = [0] * m
    j = 0
    for i in range(1, m):
        while j > 0 and p[i]!= p[j]:
            j = pi[j - 1]
        if p[i] == p[j]:
            j += 1
        pi[i] = j
    return pi

def kmp_search(s, p):
    n = len(s)
    m = len(p)
    pi = kmp_preprocess(p)
    j = 0
    for i in range(n):
        while j > 0 and s[i]!= p[j]:
            j = pi[j - 1]
        if s[i] == p[j]:
            j += 1
        if j == m:
            return i - m + 1
    return -1

def solve(s):
    n = len(s)
    pi = kmp_preprocess(s)
    if pi[-1] == 0:
        return 1, 1
    if pi[-1] == n - 1:
        return n, 1
    ans = 0
    for i in range(1, n):
        if pi[i - 1] == 0:
            continue
        if (n - i) % (n - pi[i - 1])!= 0:
            ans += 1
    return 2, ans + 2

s = input()
ans1, ans2 = solve(s)
print(ans1)
print(ans2)
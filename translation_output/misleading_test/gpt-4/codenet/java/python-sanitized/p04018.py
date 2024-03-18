def kmp_preprocess(s):
    n = len(s)
    fail = [-1] + [0] * n
    for i in range(1, n):
        j = fail[i]
        while j >= 0 and s[j] != s[i]:
            j = fail[j]
        fail[i + 1] = j + 1
    return fail


def solve(s):
    n = len(s)
    kmp = kmp_preprocess(s)
    inv = kmp_preprocess(s[::-1])

    p = n - kmp[-1]
    if n % p != 0:
        p = n

    if p == 1:
        answer(n, 1)
        return
    if p == n:
        answer(1, 1)
        return

    cnt = 0
    for i in range(2, n + 1):
        p1 = i - 1 - kmp[i - 1]
        p2 = (n + 1 - i) - inv[n + 1 - i]

        f1 = p1 == (i - 1) or (i - 1) % p1 != 0
        f2 = p2 == (n + 1 - i) or (n + 1 - i) % p2 != 0
        if f1 and f2:
            cnt += 1

    answer(2, cnt)


def answer(length, count):
    print(length)
    print(count)


# Sample test case
solve("aab")
def min_subsequences(s):
    d = [len(s)] * (1 << 26)
    d[0] = 0
    mask = 0
    ans = len(s)

    for i in range(len(s)):
        c = ord(s[i]) - ord('a')
        mask ^= 1 << c
        for j in range(-1, 26):
            m = j if j >= 0 else 0
            cur = 1 + d[m ^ mask]
            d[mask] = min(d[mask], cur)
            if i == len(s) - 1:
                ans = min(ans, cur)

    return ans

print(min_subsequences(input()))
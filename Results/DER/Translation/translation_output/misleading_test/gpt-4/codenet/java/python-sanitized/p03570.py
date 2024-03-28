import sys


def solve(s):
    n = len(s)
    d = [n] * (1 << 26)
    d[0] = 0
    mask = 0
    ans = n
    for i in range(n):
        c = ord(s[i]) - ord('a')
        mask ^= 1 << c
        for j in range(-1, 26):
            m = 0 if j < 0 else (1 << j)
            cur = 1 + d[m ^ mask]
            d[mask] = min(d[mask], cur)
            if i == n - 1:
                ans = min(ans, cur)
    return ans


def main():
    s = input().strip()
    result = solve(s)
    print(result)


if __name__ == "__main__":
    main()
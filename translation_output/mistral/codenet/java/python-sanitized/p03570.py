import sys

def solve(input, output):
    s = input.readline().strip()
    d = [2**i for i in range(26)]
    d[0] = 0
    mask = 0
    ans = len(s)
    for i in range(len(s)):
        c = s[i] - 'a'
        mask ^= 1 << c
        for j in range(-1, 26):
            m = j < 0 and 0 or (1 << j)
            cur = 1 + d[m ^ mask]
            d[mask] = min(d[mask], cur)
            if i == len(s) - 1:
                ans = min(ans, cur)
    output.write(str(ans) + '\n')

if __name__ == '__main__':
    input = sys.stdin
    output = sys.stdout
    solve(input, output)
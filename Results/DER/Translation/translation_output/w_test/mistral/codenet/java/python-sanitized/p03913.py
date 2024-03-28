import math

def p03913():
    n, a = map(int, input().split())
    ans = n
    for m in range(2, 41):
        c = math.pow(n, 1 / m)
        for i in range(max(c - 2, 2), c + 2):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            res = a * (m - 1)
            for j in range(m - 1):
                res += j * i + (m - 1 - j) * (i + 1)
                den = math.pow(i, j) * math.pow(i + 1, m - 1 - j)
                res += (n + den - 1) / den
            ans = min(ans, res)
    print(ans)

if __name__ == '__main__':
    p03913()
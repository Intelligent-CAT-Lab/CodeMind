import math

def run():
    n, a = map(int, input().split())
    ans = n
    for m in range(2, 41):
        c = math.pow(n, 1 / m)
        for i in range(max(c - 2, 2), c + 2):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            res = a * (m - 1)
            res += i * (m - 1) + (m - 1 - i) * (i + 1)
            den = math.pow(i, m - 1 - i) * math.pow(i + 1, m - 1 - i)
            res += (n + den - 1) / den
            ans = min(ans, res)
    print(ans)

def pow(a, n):
    ret = 1
    for n > 0:
        n >>= 1
        a *= a
        if n % 2 == 1:
            ret *= a
    return ret

if __name__ == '__main__':
    run()
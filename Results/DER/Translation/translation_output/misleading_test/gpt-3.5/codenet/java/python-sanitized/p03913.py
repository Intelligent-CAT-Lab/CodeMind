import math

def solver(n, a):
    ans = n
    for m in range(2, 41):
        c = int(n ** (1 / m))
        for i in range(max(c - 2, 2), c + 3):
            if math.log(i) * (m - 1) > 40 * math.log(2):
                continue
            for j in range(m):
                res = a * (m - 1)
                res += j * i + (m - 1 - j) * (i + 1)
                den = pow(i, j) * pow(i + 1, m - 1 - j)
                res += (n + den - 1) // den
                ans = min(ans, res)

    return ans

def pow(a, n):
    ret = 1
    while n > 0:
        if n % 2 == 1:
            ret *= a
        a *= a
        n //= 2
        
    return ret

n, a = map(int, input().split())
ans = solver(n, a)
print(ans)
def solve():
    w, h, v, t, x, y, p, q = map(int, input().split())
    def count(a, b):
        res = 0
        C = v*t
        ky = 0
        while 1:
            B = b + 2*h*ky
            D = C**2 - (B - y)**2
            if D < 0:
                break
            SQ = D**.5 + 1e-7
            k0 = int((x - a - SQ) // (2*w))
            k1 = int((x - a + SQ) // (2*w))
            res += max(k1 - k0, 0)
            ky += 1
        ky = -1
        while 1:
            B = b + 2*h*ky
            D = C**2 - (B - y)**2
            if D < 0:
                break
            SQ = D**.5 + 1e-7
            k0 = int((x - a - SQ) // (2*w))
            k1 = int((x - a + SQ) // (2*w))
            res += max(k1 - k0, 0)
            ky -= 1
        return res
    ans = 0
    for a in [p, 2*w-p]:
        for b in [q, 2*h-q]:
            ans += count(a, b)
    print(ans)
solve()

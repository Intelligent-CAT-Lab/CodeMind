MODULO = 998244353
invs = [0] * 8012
facts = [0] * 8012
invfacts = [0] * 8012

invs[1] = 1
for i in range(2, 8012):
    invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO

facts[0] = 1
invfacts[0] = 1
for i in range(1, 8012):
    facts[i] = (facts[i - 1] * i) % MODULO
    invfacts[i] = (invfacts[i - 1] * invs[i]) % MODULO

def solve(m, n):
    w = [0] * (m + 1)
    nw = [0] * (m + 1)
    tw = [0] * (m + 1)
    for i in range(m + 1):
        w[i] = (facts[m] * invfacts[m - i]) % MODULO

    other = [0] * (m + 1)
    for i in range(3, m + 3):
        other[m + 2 - i] = invfacts[i]

    def fft(arr, inv):
        def make_pows(a, k):
            res = [1] * (k + 1)
            for i in range(1, k + 1):
                res[i] = (a * res[i - 1]) % MODULO
            return res

        def pow_func(a, k):
            if k == 0:
                return 1
            if k % 2 == 0:
                return pow_func((a * a) % MODULO, k // 2)
            return (a * pow_func(a, k - 1)) % MODULO

        p2 = 0
        t = MODULO - 1
        while t % 2 == 0:
            t //= 2
            p2 += 1

        roots = [0] * (p2 + 1)
        allpows = [None] * (p2 + 1)
        allinvpows = [None] * (p2 + 1)
        start = 2
        while pow_func(start, (MODULO - 1) // 2) == 1:
            start += 1

        pw = MODULO - 1
        for idx in range(p2 + 1):
            roots[idx] = pow_func(start, pw)
            allpows[idx] = make_pows(roots[idx], (MODULO - 1) // pw)
            allinvpows[idx] = make_pows(pow_func(roots[idx], MODULO - 2), (MODULO - 1) // pw)

    def mul(a, b):
        len_ab = 2 ** (len(a) + len(b) - 2).bit_length()
        a = a + [0] * (len_ab - len(a))
        b = b + [0] * (len_ab - len(b))
        a_fft = fft(a, False)
        b_fft = fft(b, False)

        def pointwise_multiply(a, b):
            return [(a[i] * b[i]) % MODULO for i in range(len(a))]

        c = pointwise_multiply(a_fft, b_fft)
        c_fft = fft(c, True)
        mult = pow_func(len(c), MODULO - 2)
        return [(x * mult) % MODULO for x in c_fft]

    for step in range(n):
        for j in range(m + 1):
            tw[j] = (w[j] * (j + 1) * (j + 2)) % MODULO
        prod = mul(tw, other)
        for i in range(m + 1):
            s = prod[m + i] % MODULO
            s = (s + w[i] * (1 + i * (i + 1) // 2)) % MODULO
            nw[i] = s
        w, nw = nw, w

    return w[0]

# Test the solve function with the given test input
print(solve(2, 3))
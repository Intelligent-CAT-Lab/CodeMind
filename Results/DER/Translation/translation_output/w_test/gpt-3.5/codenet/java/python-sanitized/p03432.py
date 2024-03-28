MODULO = 998244353

def solve(m, n):
    k = 8010
    invs = [0] * (k + 2)
    facts = [0] * (k + 2)
    invfacts = [0] * (k + 2)
    
    invs[1] = 1
    for i in range(2, k + 2):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO
    
    facts[0] = 1
    invfacts[0] = 1
    for i in range(1, k + 2):
        facts[i] = facts[i - 1] * i % MODULO
        invfacts[i] = invfacts[i - 1] * invs[i] % MODULO
    
    w = [0] * (m + 1)
    nw = [0] * (m + 1)
    tw = [0] * (m + 1)
    for i in range(m + 1):
        w[i] = facts[m] * invfacts[m - i] % MODULO
    
    other = [0] * (m + 1)
    for i in range(3, m + 3):
        other[m + 2 - i] = invfacts[i]
    
    for step in range(n):
        tw = [w[j] * (j + 1) % MODULO * (j + 2) % MODULO for j in range(m + 1)]
        prod = fft_mul(tw, other)
        
        for i in range(m + 1):
            s = prod[m + i] % MODULO
            s = (s + w[i] * (1 + i * (i + 1) // 2)) % MODULO
            nw[i] = s
        
        w, nw = nw, w
    
    return w[0]

def fft_mul(a, b):
    len_ab = 1
    while len_ab < len(a) + len(b) - 1:
        len_ab *= 2
    a = a + [0] * (len_ab - len(a))
    b = b + [0] * (len_ab - len(b))
    
    a_fft = fft(a, False)
    b_fft = fft(b, False)
    
    c = pointwise_multiply(a_fft, b_fft)
    c = fft(c, True)
    
    c = [(x * pow(len_ab, MODULO - 2, MODULO)) % MODULO for x in c]
    
    return c

def fft(arr, inv):
    n = len(arr)
    invbits = [calc_inv_bits(i, n) for i in range(n)]
    
    for i in range(n):
        j = invbits[i]
        if j > i:
            arr[i], arr[j] = arr[j], arr[i]
    
    p2 = 1
    pow2 = 1
    for p2 in range(1, n):
        w = pow(2, pow2, MODULO)
        ap = make_pows(w, (MODULO - 1) // p2)
        
        if inv:
            w = pow(w, MODULO - 2, MODULO)
            ap = make_pows(pow(w, MODULO - 2, MODULO), (MODULO - 1) // p2)
        
        for big in range(0, n, 2 * p2):
            cur = 1
            curp = 0
            for small in range(big, big + p2):
                i = small
                j = small + p2
                u = arr[i]
                o = arr[j]
                v = (o * cur) % MODULO
                arr[i] = (u + v) % MODULO
                arr[j] = (u - v) % MODULO
                curp += 1
                cur = ap[curp]
    
    return arr

def calc_inv_bits(at, total):
    res = 0
    rev = total >> 1
    while at and rev:
        if at & rev:
            res |= rev
        at >>= 1
        rev >>= 1
    return res

def make_pows(a, k):
    res = [0] * (k + 1)
    res[0] = 1
    for i in range(1, k + 1):
        res[i] = (a * res[i - 1]) % MODULO
    
    return res

def pointwise_multiply(a, b):
    return [(a[i] * b[i]) % MODULO for i in range(len(a))]

def pow(a, k, MODULO):
    if k == 0:
        return 1
    if k % 2 == 0:
        return pow((a * a) % MODULO, k // 2, MODULO)
    
    return (a * pow(a, k - 1, MODULO)) % MODULO

def main(input_string):
    m, n = map(int, input_string.strip().split())
    result = solve(m, n)
    return str(result)

# Test the function with provided test case
print(main("2 3"))  # Output: 64
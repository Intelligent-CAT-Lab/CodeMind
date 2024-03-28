MODULO = 998244353

def invs_size(k):
    invs = [0] * (k + 2)
    invs[1] = 1
    for i in range(2, k + 2):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO
    return invs

def facts_invs_size(k, invs):
    facts = [0] * (k + 2)
    invfacts = [0] * (k + 2)
    facts[0] = 1
    invfacts[0] = 1
    for i in range(1, k + 2):
        facts[i] = facts[i - 1] * i % MODULO
        invfacts[i] = invfacts[i - 1] * invs[i] % MODULO
    return facts, invfacts

# Generate invs, facts, invfacts up to 8010
invs = invs_size(8010)
facts, invfacts = facts_invs_size(8010, invs)

def solve(m, n):
    w = [(facts[m] * invfacts[m - i] % MODULO) for i in range(m + 1)]
    nw = [0] * (m + 1)
    tw = [0] * (m + 1)
    other = [invfacts[i] for i in range(3, m + 3)][::-1]
    
    # Note: FFT is mentioned but not implemented, hence this function is abstract
    def fft_mul(tw, other):
        raise NotImplementedError("FFT multiplication is not implemented.")
    
    for step in range(n):
        for j in range(m + 1):
            tw[j] = w[j] * (j + 1) % MODULO * (j + 2) % MODULO
        
        prod = fft_mul(tw, other)
        
        for i in range(m + 1):
            s = prod[m + i] % MODULO
            s = (s + w[i] * (1 + i * (i + 1) // 2)) % MODULO
            nw[i] = s
        
        w, nw = nw, w
    
    res = w[0]
    return res

# sample input and call to the solve function
if __name__ == "__main__":
    m, n = map(int, input().split())
    result = solve(m, n)
    print(result)
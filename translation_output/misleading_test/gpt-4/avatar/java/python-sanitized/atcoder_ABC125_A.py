def atcoder_ABC125_A(a, b, n):
    k = 0
    for i in range(1, n + 1):
        if i * a <= n:
            k += b
    return k

# Test input
a, b, n = map(int, "20 20 19".split())

# Expected output
print(atcoder_ABC125_A(a, b, n))
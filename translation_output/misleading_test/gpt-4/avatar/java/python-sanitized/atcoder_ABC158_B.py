def solve(N, A, B):
    base = N // (A + B)
    mod = N % (A + B)
    mod = min(mod, A)
    return base * A + mod

# Test input
N, A, B = map(int, input().split())

# Expected output
print(solve(N, A, B))
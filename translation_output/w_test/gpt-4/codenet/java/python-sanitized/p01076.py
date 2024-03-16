def solve(N, d):
    if d == 1:
        return N * (N - 1) // 2
    elif d == 2:
        return N * (N - 1) // 2 - 1
    else:
        m = N - d
        ans = m * (m - 1) // 2 + 2 * m + (d - 2)
        return ans

# Sample test input:
N, d = map(int, input().split())

# Expected output:
print(solve(N, d))
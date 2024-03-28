def calculate(N, K):
    ans = 0
    for i in range(N - 1):
        ans = K * (ans // (K - 1)) + ans % (K - 1) + 1
    return ans

# Test input
input_values = "4 2"

# Processing input
N, K = map(int, input_values.split())

# Calculating result and printing output
result = calculate(N, K)
print(result)

# Expected output:
# 7
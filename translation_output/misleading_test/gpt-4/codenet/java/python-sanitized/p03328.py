a, b = map(int, input().split())
n = b - a
print(n * (n + 1) // 2 - b)

# Test input
# 8 13

# Expected output
# 98
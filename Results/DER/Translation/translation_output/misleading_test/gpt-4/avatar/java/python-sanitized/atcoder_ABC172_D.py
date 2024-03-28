def atcoder_ABC172_D(n):
    ans = 0
    for i in range(1, n + 1):
        ans += i * (n // i) * ((n // i) + 1) // 2
    return ans

# Test input
test_input = 9995083
# Expected output: 837779626111797
print(atcoder_ABC172_D(test_input))
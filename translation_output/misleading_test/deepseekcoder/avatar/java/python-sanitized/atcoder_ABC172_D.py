def atcoder_ABC172_D(n):
    ans = 0
    for i in range(1, n + 1):
        ans += i * (n // i) * ((n // i) + 1) // 2
    return ans

# Test input
n = 9995083

# Call the function with the test input
result = atcoder_ABC172_D(n)

# Print the result
print(result)
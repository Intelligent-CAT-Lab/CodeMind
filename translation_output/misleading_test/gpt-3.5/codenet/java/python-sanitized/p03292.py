def calculate_difference(T, R, Y):
    A = max(T, R, Y)
    B = min(T, R, Y)
    return A - B

# Test input reading
T, R, Y = map(int, input().split())

# Calculate and print the result
result = calculate_difference(T, R, Y)
print(result)
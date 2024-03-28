def count_aizu_subsequences(string):
    a = 'A'
    sum = 0
    for char in string:
        if char <= a:
            sum += 1
        a = char
    return sum

# Test input
test_input = "AIZU"

# Expected output: 2
print(count_aizu_subsequences(test_input))
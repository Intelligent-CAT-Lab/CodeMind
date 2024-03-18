def atcoder_ABC043_B(s):
    while '0B' in s or '1B' in s:
        s = s.replace('0B', '')
        s = s.replace('1B', '')
        
    s = s.replace('B', '')
    return s


# Test input
test_input = "0000000000"
# Expected output: 78

# Printing the result of the function with the test input.
print(atcoder_ABC043_B(test_input))
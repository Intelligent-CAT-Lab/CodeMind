def solve(s):
    from_index = s.find('A')
    to_index = s.rfind('Z')
    return to_index - from_index + 1

# Test input
test_input = "QWERTYASDFZXCV"
# Expected output: 5

print(solve(test_input))
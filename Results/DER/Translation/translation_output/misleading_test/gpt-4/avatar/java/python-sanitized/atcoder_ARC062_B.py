def atcoder_ARC062_B(input_str):
    input_chars = list(input_str)
    result = 0
    p = 0
    g = 1

    for i in range(1, len(input_chars)):
        if input_chars[i] == 'g':
            if p + 1 <= g:
                result += 1
                p += 1
            else:
                g += 1
        else:
            if p + 1 <= g:
                p += 1
            else:
                g += 1
                result -= 1

    return result

# Test case input
test_input = "2 2"
# Test case expected output
expected_output = 82
# Calculate the result from the test input
# Note:
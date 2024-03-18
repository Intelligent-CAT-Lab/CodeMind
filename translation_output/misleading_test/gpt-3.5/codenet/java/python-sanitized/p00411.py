def p00411():
    a, t, r = map(float, input().split())
    result = r * t / a
    return result

# Test
input_values = "180 120 90"
output = p00411()
expected_output = 0.057217574079786004
assert output == expected_output
print(output)
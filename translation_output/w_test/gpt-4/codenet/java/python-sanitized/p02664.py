def p02664(s):
    result = []
    count = 0
    for char in s:
        if char == 'D' or char == '?':
            count += 1
            result.append('D')
        else:
            result.append(char)
    return ''.join(result)

# Sample test case
input_str = "PD?D??P"
expected_output = "PDPDPDP"
assert p02664(input_str) == expected_output

print(p02664(input_str))
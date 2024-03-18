def convert_input_to_brainfuck(input_str):
    mem = [0] * 10
    pos = 0
    sb = []
    for c in input_str:
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for i in range(abs(mem[pos] - ord(c))):
            sb.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        sb.append('.')
    return ''.join(sb)

# Test input
test_input = "ABC"

# Expected output
expected_output = "+++++++[>++++++++<-]>+.+.+."

# Actual output
output = convert_input_to_brainfuck(test_input)
print(output)

# Verify if the output matches the expected
assert output == expected_output, f"Output did not match: {output}"
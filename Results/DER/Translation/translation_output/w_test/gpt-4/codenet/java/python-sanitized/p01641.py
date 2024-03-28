def generate_brainfuck_code(input_string):
    mem = [0] * 10
    pos = 0
    sb = []
    for c in input_string:
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for i in range(abs(mem[pos] - ord(c))):
            sb.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        sb.append('.')
    return ''.join(sb)

# Sample Test Case
input_data = "ABC"
output = generate_brainfuck_code(input_data)
print(output)
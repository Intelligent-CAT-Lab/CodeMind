def process_string(input_str):
    sb = []
    for i, c in enumerate(input_str):
        if i == 4:
            sb.append(" ")
        sb.append(c)
    return ''.join(sb)

# Sample Test case
input_str = "CODEFESTIVAL"
output_str = process_string(input_str)
print(output_str)
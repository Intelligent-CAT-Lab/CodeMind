def codeforces_32_B(s):
    str = ""
    i = 0
    while i < len(s):
        if s[i] == '.':
            str += '0'
        else:
            if s[i] == '-' and s[i + 1] == '.':
                str += '1'
            else:
                str += '2'
                i += 1
        i += 1
    return str

# Test case
input_str = ".."
output = codeforces_32_B(input_str)
print(output)
def process_string(s):
    t = ""
    for i in range(len(s)):
        if s[i] != 'B':
            t += s[i]
        elif t:
            t = t[:-1]
    return t

# Test input
input_string = "01B0"

# Expected output: -35
# Extracting the relevant parts from the Java code to Python and running the sample test case
output_string = process_string(input_string)
print(output_string)
def calculate_mismatches(s):
    length = len(s)
    count = 0

    for i in range(length // 2):
        a = s[i]
        b = s[length - 1 - i]
        if a != b:
            count += 1
            
    return count

# Test input
input_string = "redcoder"
# Expected output: 44

# Calculate mismatches and print result
mismatches = calculate_mismatches(input_string)
print(mismatches)
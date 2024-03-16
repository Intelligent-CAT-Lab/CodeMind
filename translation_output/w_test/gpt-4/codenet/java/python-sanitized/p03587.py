def count_ones(s):
    n = 0
    for c in s:
        if c == '1':
            n += 1
    return n

# Sample test case
input_string = "111100"
print(count_ones(input_string))
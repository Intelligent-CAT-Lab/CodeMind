def calculate_shifts(s):
    count = 0
    black = 0
    for char in s:
        if char == 'W':
            count += black
        else:
            black += 1
    return count

# Test case
input_string = "BBW"
result = calculate_shifts(input_string)
print(-result)
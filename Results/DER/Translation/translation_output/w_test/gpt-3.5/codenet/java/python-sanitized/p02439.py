def find_min_max(a, b, c):
    min_val = min(a, b)
    max_val = max(a, b)
    return min(min_val, c), max(max_val, c)

# Test case
input_values = "4 5 3".split()
a, b, c = map(int, input_values)
min_val, max_val = find_min_max(a, b, c)
print(min_val, max_val)
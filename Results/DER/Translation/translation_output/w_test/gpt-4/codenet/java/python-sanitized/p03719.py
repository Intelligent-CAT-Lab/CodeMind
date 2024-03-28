def check_sequence(a, b, c):
    result = "No"
    if a <= c <= b:
        result = "Yes"
    return result

# Sample Test Case
input_sequence = input().strip().split()
a, b, c = map(int, input_sequence)
print(check_sequence(a, b, c))
def calculate_output(a, b, c):
    if b + c < a:
        return 0
    else:
        return b + c - a

# Test input
a, b, c = map(int, input().split())
output = calculate_output(a, b, c)
print(output)
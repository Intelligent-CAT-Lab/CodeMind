# Python code

def check_strings(a, b, c):
    if a[-1] == b[0] and b[-1] == c[0]:
        return "YES"
    else:
        return "NO"

# Test input
a, b, c = input().split()

# Print the result
print(check_strings(a, b, c))
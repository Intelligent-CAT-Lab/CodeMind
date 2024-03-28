def calculate_max(N):
    N += 1
    s = str(N)
    length = len(s)
    c = int(s[0])
    max_value = (c - 1) + 9 * (length - 1)
    return max_value

# Test input
N = 100
# Expected output: 41
print(calculate_max(N))
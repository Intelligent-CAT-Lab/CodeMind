def solve(a, b):
    if a == b:
        return a * 2
    elif a > b:
        return a * 2 - 1
    else:
        return b * 2 - 1

# Test input
a, b = map(int, input().split())

# Expected output
print(solve(a, b))
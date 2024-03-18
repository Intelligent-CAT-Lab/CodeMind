def solve(a, b, c):
    if (c >= a and c <= b) or (c >= b and c <= a):
        return "Yes"
    else:
        return "No"

# Test input
a, b, c = map(int, input().split())
result = solve(a, b, c)
print(result)
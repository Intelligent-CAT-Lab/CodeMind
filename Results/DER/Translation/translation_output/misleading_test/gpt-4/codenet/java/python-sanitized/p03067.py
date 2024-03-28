def solve(a, b, c):
    if (c >= a and c <= b) or (c >= b and c <= a):
        print("Yes")
    else:
        print("No")

# Test input
a, b, c = map(int, input().split())

# Call the solve function with the input values
solve(a, b, c)
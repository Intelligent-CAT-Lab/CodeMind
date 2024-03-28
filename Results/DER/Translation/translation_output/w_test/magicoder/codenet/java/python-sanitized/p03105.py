# Python code

# Read input from user
A, B, C = map(int, input().split())

# Calculate N
N = B // A

# Check if N is greater than C
if N > C:
    print(C)
else:
    print(N)
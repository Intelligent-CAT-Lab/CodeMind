# Read input from the user
n, r = map(int, input().split())

# Calculate and print the result
if n < 10:
    print(r + (10 - n) * 100)
else:
    print(r)

# Sample test case
# Input: 2 2919
# Output: 3719
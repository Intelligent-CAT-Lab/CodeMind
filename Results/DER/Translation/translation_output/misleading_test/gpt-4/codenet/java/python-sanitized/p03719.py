# Read the input from user
a, b, c = map(int, input().split())

# Initialize result
result = "No"

# Check the condition
if a <= c <= b:
    result = "Yes"

# Print the result
print(result)
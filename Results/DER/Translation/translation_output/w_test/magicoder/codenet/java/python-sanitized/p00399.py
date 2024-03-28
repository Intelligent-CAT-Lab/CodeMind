# Python code

# Read input from user
numDog = input().split()

# Initialize result
result = 0

# Add each number to result
for i in numDog:
    result += int(i)

# Print result
print(result)
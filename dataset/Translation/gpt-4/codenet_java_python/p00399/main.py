# Read input from standard input (stdin)
num_dog = input().split()

# Initialize the result to 0
result = 0

# Loop through all numbers and sum them up
for num in num_dog:
    result += int(num)

# Print the result to the standard output
print(result)
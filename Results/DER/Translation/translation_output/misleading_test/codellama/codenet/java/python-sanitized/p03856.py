import sys

# Read input from stdin
input_str = sys.stdin.readline().strip()

# Define a list of valid words
valid_words = ["dream", "dreamer", "erase", "eraser"]

# Initialize a list to store the results
result = []

# Iterate through each character in the input string
for i in range(len(input_str)):
    # Check if the current character is a valid word
    if input_str[i] in valid_words:
        # If it is, add it to the result list
        result.append(input_str[i])

# Print the result list
print(result)
# Read the input from the user
input_string = input()

# Initialize variables
current_char = input_string[0]
count = 0

# Loop through the input string starting from the second character
for i in range(1, len(input_string)):
    if input_string[i] != current_char:
        count += 1
        current_char = input_string[i]

# Output the result
print(-count)
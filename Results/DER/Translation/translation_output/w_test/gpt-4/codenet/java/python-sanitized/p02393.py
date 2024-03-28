# Read input from the user
input_numbers = input().split()

# Sort the list of numbers (as strings) and then convert them to integers
sorted_numbers = sorted(map(int, input_numbers))

# Print the numbers in increasing order
print(' '.join(map(str, sorted_numbers)))
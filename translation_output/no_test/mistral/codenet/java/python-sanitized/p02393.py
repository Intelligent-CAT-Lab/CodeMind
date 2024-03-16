import sys

# Read input
num_str = input()
num_list = num_str.split()

# Sort list
num_list.sort()

# Convert strings to integers
num_small = int(num_list[0])
num_middle = int(num_list[1])
num_large = int(num_list[2])

# Print output
print(num_small, num_middle, num_large)
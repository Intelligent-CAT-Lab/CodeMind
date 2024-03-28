# Read input from the user
a, b, c = map(int, input().split())

# Create a list with the values
sum_list = [a, b, c]

# Sort the list
sum_list.sort()

# Print the sum of the two smallest numbers
print(sum_list[0] + sum_list[1])
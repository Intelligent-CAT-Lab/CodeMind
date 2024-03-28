# Read input values
a, b, c = map(int, input().split())

# Sort the values
sum_values = sorted([a, b, c])

# Output the sum of the two smallest values
print(sum_values[0] + sum_values[1])
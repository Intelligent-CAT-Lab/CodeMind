# Python code

# Read input from user
input_values = input().split()

# Convert string inputs to integers
input_values = [int(i) for i in input_values]

# Count the number of odd numbers
odd = sum(i % 2 for i in input_values)

# Print the result
print("Hom" if odd >= 2 else "Tem")


Test input:
1 1 10

Expected output:
Ho
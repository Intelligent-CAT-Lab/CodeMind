import sys

input_str = sys.stdin.read()

# Split the input string by commas
a, b, c = input_str.split(",")

# Print the output
print(a + " " + b + " " + c)
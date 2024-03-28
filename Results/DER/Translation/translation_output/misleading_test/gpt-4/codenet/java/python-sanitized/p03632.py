import sys

# Read the input from standard input
input_line = sys.stdin.readline().strip()

# Parse the input line into a list of integers
in_data = list(map(int, input_line.split()))

# Extract variables
a = in_data[0]
b = in_data[1]
c = in_data[2]
d = in_data[3]

# Calculate the overlap
start = max(a, c)
end = min(b, d)
overlap = end - start if end > start else 0

# Print the result
print(overlap)
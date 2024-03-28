# Equivalent Python code

# Read long integer from input
s = int(input())

# Constant value which is 1 billion in the Java code
a = 1000000000

# Calculate and construct the output string
output = f"0 0 {a} 1 {(a - s % a) % a} {((s - 1) // a + 1)}"

# Print the result
print(output)
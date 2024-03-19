# Python code

# Read input
a, b, n = map(int, input().split())

# Initialize k
k = 0

# Calculate k
for i in range(1, n // a + 1):
    k += b

# Print k
print(k)
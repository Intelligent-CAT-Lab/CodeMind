# Sample test case
input = "1000 3000 3000"

# Split the input string into a list of integers
input_list = input.split()

# Convert the list of integers to integers
m, f, b = map(int, input_list)

# Check if b is greater than m + f
if b > m + f:
    print("NA")
# Check if b is greater than m
elif b > m:
    print(b - m)
# Otherwise, print 0
else:
    print("0")
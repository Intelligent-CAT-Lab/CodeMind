# Python code

# Read input
numbers = list(map(int, input().split()))

# Find the maximum number and its index
max_num = max(numbers)
idx = numbers.index(max_num)

# Convert the index to a character and print it
print(chr(ord('A') + idx))
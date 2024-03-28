# Read the test input
n, l = map(int, input().split())

# Calculate the absolute differences
diff = [abs(l + i - 1) for i in range(1, n + 1)]

# Find the index of the minimum value in the list and then calculate the `removeK` - in python index starts from 0
removeK = diff.index(min(diff)) + 1

# Calculate and print the expected output
output = n * l + n * (n + 1) // 2 - n - (l + removeK - 1)
print(output)
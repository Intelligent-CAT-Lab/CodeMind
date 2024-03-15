import sys

# Read the number from stdin
n = int(input().rstrip())

# Create a list of boolean values
arr = [False] * (n + 3)
arr[0] = True
arr[1] = True

count = 0
# Sieve of Eratosthenes
for i in range(2, len(arr)):
    if not arr[i]:
        for j in range(2, n//i + 1):
            arr[i * j] = True
        # Check for prime pairs
        if not arr[i] and not arr[i - 2]:
            count += 1

# Print the result
print(count * 2)
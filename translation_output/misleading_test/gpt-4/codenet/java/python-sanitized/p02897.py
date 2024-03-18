# Read input from user
n = float(input())

# Initialize counters
odd = 0
not_odd = 0

# Loop through integers from 1 to n
for i in range(1, int(n) + 1):
  if i % 2 == 0:
    not_odd += 1
  else:
    odd += 1

# Compute and print the result
print(odd / n)
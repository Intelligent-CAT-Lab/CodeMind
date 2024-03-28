# Read the integer input
x = int(input())

# Perform the conditional check and print the result
if x % 100 <= x // 100 * 5:
    print(1)
else:
    print(0)
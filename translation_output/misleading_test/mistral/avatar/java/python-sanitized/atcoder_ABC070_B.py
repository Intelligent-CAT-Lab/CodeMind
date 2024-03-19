# Sample test case
a = 0
b = 50
c = 50
d = 100

# Expected output
ans = 0

# Iterate through the range of a to b
for i in range(a, b+1):
    # If the value at index i is 2, increment ans
    if array[i] == 2:
        ans += 1

# Print the value of ans
print(ans)
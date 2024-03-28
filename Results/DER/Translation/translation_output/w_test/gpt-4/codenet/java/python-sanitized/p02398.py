# Read inputs from the user
x, y, z = map(int, input().split())
t = 0

# Loop from x to y and count how many times z is divisible by i
for i in range(x, y + 1):
    if z % i == 0:
        t += 1

# Print the result
print(t)

# Test input
# Input goes here: 5 14 80
# Expected output: 3
# Read the inputs as three integers
r, g, b = map(int, input().split())

# Convert RGB values to the same scale as the original Java code
r *= 100
g *= 10

# Calculate the sum of RGB values
sum_rgb = r + g + b

# Check if the sum is divisible by 4
if sum_rgb % 4 == 0:
    print("YES")
else:
    print("NO")
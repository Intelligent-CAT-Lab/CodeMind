# Python code

# Read input
a, b, c, d = map(int, input().split())

# Initialize sum
sum = 0

# Check if d is less than or equal to a
if d <= a:
    print(d)
    exit()

# Add a to sum
sum += a

# Subtract a from d
d -= a

# Check if d is less than or equal to b
if d <= b:
    print(sum)
    exit()

# Subtract b from d
d -= b

# Subtract d from sum
sum -= d

# Print sum
print(sum)
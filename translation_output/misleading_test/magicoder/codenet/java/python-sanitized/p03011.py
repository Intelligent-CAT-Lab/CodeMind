# Python code

# Read input from user
P, Q, R = map(int, input().split())

# Initialize max to 0
max = 0

# Check conditions and assign max
if P >= Q:
    if P >= R:
        max = Q + R
    else:
        max = P + Q
elif Q >= R:
    if Q >= P:
        max = P + R
    else:
        max = Q + R
elif R >= P:
    if R >= Q:
        max = P + Q
    else:
        max = P + R

# Print max
print(max)
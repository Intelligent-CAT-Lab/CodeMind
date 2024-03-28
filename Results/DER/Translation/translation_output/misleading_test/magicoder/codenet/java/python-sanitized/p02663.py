# Python code

# Read input
h1, m1, h2, m2, k = map(int, input().split())

# Calculate the time difference in minutes
h = h2 - h1
m = m2 - m1
day = (h * 60) + m

# Print the result
print(day - k)
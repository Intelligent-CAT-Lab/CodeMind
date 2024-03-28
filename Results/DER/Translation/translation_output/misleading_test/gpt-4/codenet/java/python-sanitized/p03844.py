# Reading input from user
a, s, b = input().split()
a = int(a)
b = int(b)

# Initialize variable c
c = 0

# Perform addition or subtraction based on the operator
if s == "+":
    c = a + b
elif s == "-":
    c = a - b

# Print the result
print(c)
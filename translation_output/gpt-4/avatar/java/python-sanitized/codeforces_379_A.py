# Read input from the user
a, b = map(int, input().split())
res = a

# Algorithm to calculate the result
while a >= b:
    res += (a // b)
    a = (a // b) + (a % b)

# Print the result
print(res)
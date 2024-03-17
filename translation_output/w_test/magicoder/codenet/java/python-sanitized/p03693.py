# Python code

# Importing the required module
import sys

# Reading input from the user
r, g, b = map(int, sys.stdin.readline().split())

# Calculating the sum
sum = r*100 + g*10 + b

# Checking if the sum is divisible by 4
if sum % 4 == 0:
    print("YES")
else:
    print("NO")
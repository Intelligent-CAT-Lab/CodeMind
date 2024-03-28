# Python code

# Importing the required module
import sys

# Taking input from user
a, b, c = map(int, sys.stdin.readline().split())

# Finding the minimum and maximum of a and b
min_ab = min(a, b)
max_ab = max(a, b)

# Printing the minimum of min_ab and c and the maximum of max_ab and c
print(min(min_ab, c), max(max_ab, c))
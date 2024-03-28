# Python code

# Importing the required module
import sys

# Reading input from the user
input_values = list(map(int, sys.stdin.readline().split()))

# Creating a set to store the paint cans
paint_cans = set()

# Adding the input values to the set
for value in input_values:
    paint_cans.add(value)

# Printing the size of the set
print(len(paint_cans))
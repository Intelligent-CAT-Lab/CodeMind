# Python code

# Importing the required module
import sys

# Taking input from the user
a, b, c = map(int, sys.stdin.readline().split())

# Creating a list of the input numbers
numbers = [a, b, c]

# Sorting the list
numbers.sort()

# Printing the sum of the first two numbers in the sorted list
print(numbers[0] + numbers[1])
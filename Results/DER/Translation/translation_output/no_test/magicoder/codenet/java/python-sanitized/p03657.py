# Python code

# importing the built-in module for input
import sys

# reading input from the user
a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

# checking the conditions
if a % 3 == 0 or b % 3 == 0 or (a + b) % 3 == 0:
    print("Possible")
else:
    print("Impossible")



-
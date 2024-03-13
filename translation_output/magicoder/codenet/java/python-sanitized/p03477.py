# Python code

# importing the required module
import sys

# reading input from user
left = sum(map(int, input().split()))
right = sum(map(int, input().split()))

# comparing the values
if left > right:
    print("Left")
elif left == right:
    print("Balanced")
else:
    print("Right")
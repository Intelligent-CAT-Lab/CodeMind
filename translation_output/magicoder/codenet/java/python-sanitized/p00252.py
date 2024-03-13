# Python code

# importing the required module
import sys

# reading input from user
a = list(map(int, input().split()))

# checking the conditions
if a[0] == 1 and a[1] == 1:
    print("Open")
elif a[2] == 1:
    print("Open")
else:
    print("Close")
# Python code

# importing the required module
import sys

# reading input from user
P, Q, R = map(int, sys.stdin.readline().split())

# initializing max to 0
max = 0

# checking conditions
if P >= Q:
    if P >= R:
        max = Q + R
    else:
        max = P + Q
elif Q >= R:
    if Q >= P:
        max = P + R
    else:
        max = Q + R
elif R >= P:
    if R >= Q:
        max = P + Q
    else:
        max = P + R

# printing the result
print(max)
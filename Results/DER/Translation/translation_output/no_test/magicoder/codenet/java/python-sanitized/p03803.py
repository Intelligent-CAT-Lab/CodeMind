# Python code

# importing the required module
import sys

# reading input from user
a = int(input())
b = int(input())

# checking conditions
if a == 1:
    if b != 1:
        print("Alice")

if b == 1:
    if a != 1:
        print("Bob")

if (a > b) and (a != 1) and (b != 1):
    print("Alice")

if (a < b) and (a != 1) and (b != 1):
    print("Bob")

if a == b:
    print("Draw")
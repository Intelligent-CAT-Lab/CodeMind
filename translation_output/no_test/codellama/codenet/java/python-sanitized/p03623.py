import math

x = int(input("Enter a number: "))
a = int(input("Enter another number: "))
b = int(input("Enter another number: "))

if abs(x - a) < abs(x - b):
    print("A")
else:
    print("B")
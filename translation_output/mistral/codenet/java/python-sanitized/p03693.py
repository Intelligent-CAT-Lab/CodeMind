import sys

r = int(input("Enter the value of r: "))
g = int(input("Enter the value of g: "))
b = int(input("Enter the value of b: "))

sum = r + g + b
print(sum % 4 == 0)
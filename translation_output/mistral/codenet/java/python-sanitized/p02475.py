# Python implementation of the given Java code

from decimal import Decimal, getcontext

getcontext().prec = 100

a = Decimal(input("Enter first number: "))
b = Decimal(input("Enter second number: "))

result = a / b

print(result)
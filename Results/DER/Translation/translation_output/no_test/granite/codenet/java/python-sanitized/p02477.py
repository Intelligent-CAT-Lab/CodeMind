import sys
from decimal import *

getcontext().prec = 1000

a = Decimal(input())
b = Decimal(input())

print(a * b)
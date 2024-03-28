import math

a = int(input("Enter the value of a: "))
b = int(input("Enter the value of b: "))
c = int(input("Enter the value of c: "))

amount = 0
time = a

for i in range(2, math.ceil(c + 0.5)):
    amount += b
    time = a * i

print(amount)
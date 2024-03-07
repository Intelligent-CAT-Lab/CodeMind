import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def lcm(a, b):
    return a * b // gcd(a, b)

a = int(input("Enter the first number: "))
b = int(input("Enter the second number: "))

print(lcm(a, b))
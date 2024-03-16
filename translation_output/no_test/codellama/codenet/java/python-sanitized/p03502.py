import math

def is_divisible(n):
    x = n
    fx = 0
    while n >= 10:
        fx += n % 10
        n //= 10
    fx += n
    return x % fx == 0

n = int(input("Enter a number: "))
if is_divisible(n):
    print("Yes")
else:
    print("No")
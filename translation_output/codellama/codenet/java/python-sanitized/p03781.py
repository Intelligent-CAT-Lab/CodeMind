import math

def get_x(x):
    i = 1
    while i * (i + 1) / 2 < x:
        i += 1
    return i

x = int(input("Enter a number: "))
print(get_x(x))
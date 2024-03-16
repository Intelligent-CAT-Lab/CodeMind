import math

a = int(input("Enter a: "))
b = int(input("Enter b: "))

if a <= 0 and 0 <= b:
    print("Zero")
else:
    print("Positive" if (math.min(0, b) - math.min(-1, a)) % 2 == 1 else "Negative")
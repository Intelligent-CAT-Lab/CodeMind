import math

def is_multiple_of_3_or_5(age):
    if age % 3 == 0 or age % 5 == 0:
        return "YES"
    else:
        return "NO"

age = int(input("Enter your age: "))
print(is_multiple_of_3_or_5(age))


You can also use the `math.gcd()` function to check if the age is a multiple of 3 or 5.

import math

def is_multiple_of_3_or_5(age):
    if math.gcd(age, 3) == 1 or math.gcd(age, 5) == 1:
        return "YES"
    else:
        return "NO"

age = int(input("Enter your age: "))
print(is_multiple_of_3_or_5(age))
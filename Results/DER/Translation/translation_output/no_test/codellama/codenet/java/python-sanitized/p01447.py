import math

n = int(input("Enter a number: "))
count = 0

while n > 1:
    n = (n + (n % 3 == 0 ? 0 : 3 - n % 3)) / 3
    count += 1

print(count)
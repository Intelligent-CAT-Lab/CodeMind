import sys

i = int(input())
k = 360
j = 1

if 1 <= i <= 179:
    while (i * j) % k != 0:
        j += 1
    print(j)
else:
    print("Invalid input")
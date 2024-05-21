import sys

k = 360

i = int(input())

if 1 <= i <= 179:
    j = 1
    while (i * j) % k!= 0:
        j += 1
    print(j)
else:
    print("Input is out of range.")
import math

n = int(input("Enter a number: "))

for i in range(math.pow(2, n)):
    temp = i
    print(i, end=":")
    for j in range(n):
        if temp % 2 == 1:
            print(" " + str(j), end="")
        temp //= 2
    print()
import sys

n = int(input())
square = n * n
odd = [i for i in range(1, square + 1) if i % 2 == 1]
even = [i for i in range(1, square + 1) if i % 2 == 0]

loop = square // n
div = loop // 2

for i in range(1, loop + 1):
    for j in range(div):
        if i % 2 == 1:
            sys.stdout.write(str(odd.pop(0)) + " " + str(even.pop()) + " ")
        else:
            sys.stdout.write(str(even.pop(0)) + " " + str(odd.pop()) + " ")
    sys.stdout.write("\n")
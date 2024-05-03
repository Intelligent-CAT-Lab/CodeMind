import sys

n = int(sys.stdin.readline())
square = n * n
odd = [i for i in range(1, square + 1, 2)]
even = [i for i in range(2, square + 1, 2)]

loop = square // n
div = loop // 2

for i in range(1, loop + 1):
    for j in range(div):
        if i % 2 == 1:
            sys.stdout.write(str(odd.pop(0)) + " " + str(even.pop(-1)) + " ")
        else:
            sys.stdout.write(str(even.pop(0)) + " " + str(odd.pop(-1)) + " ")
    sys.stdout.write("\n")

sys.stdout.close()
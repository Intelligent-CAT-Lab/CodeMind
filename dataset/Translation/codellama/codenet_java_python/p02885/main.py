import sys

line = sys.stdin.readline()
line1 = line.split(" ")
a = int(line1[0])
b = int(line1[1])
if a > 2 * b:
    print(a - 2 * b)
else:
    print(0)
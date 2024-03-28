import sys

sides = [int(x) for x in sys.stdin.readline().split()]
sides.sort()

if sides[0] == sides[1] and sides[2] == sides[3]:
    print("yes")
else:
    print("no")
import sys

with open(sys.argv[1], 'r') as f:
    a = int(f.read())

print("ABC" + str(a))
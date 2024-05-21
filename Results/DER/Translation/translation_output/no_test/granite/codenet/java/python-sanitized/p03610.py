import sys

s = input()
array = list(s)

for i in range(0, len(s), 2):
    sys.stdout.write(array[i])
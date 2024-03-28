import sys

for line in sys.stdin:
    print(float(line.split()[0]) * float(line.split()[1]) / 3.305785)
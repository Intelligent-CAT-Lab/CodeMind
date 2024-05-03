import sys

for line in sys.stdin:
    numbers = list(map(float, line.split()))
    print(numbers[0] * numbers[1] / 3.305785)
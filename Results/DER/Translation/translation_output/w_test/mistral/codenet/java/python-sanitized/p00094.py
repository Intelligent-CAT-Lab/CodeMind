import sys

while True:
    try:
        num1, num2 = map(float, sys.stdin.readline().strip().split())
        print(num1 * num2 / 3.305785)
    except ValueError:
        break
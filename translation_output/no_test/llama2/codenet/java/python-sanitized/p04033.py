import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a <= 0 and 0 <= b:
    print("Zero")
else:
    print((min(0, b) - min(-1, a)) % 2 == 1 and "Positive" or "Negative")
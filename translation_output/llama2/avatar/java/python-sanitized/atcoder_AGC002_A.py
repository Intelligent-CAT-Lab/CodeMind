import sys

a = int(sys.stdin.readline())
b = int(sys.stdin.readline())

if a <= 0 and b >= 0 or a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    print(((b - a + 1) % 2 == 0) and "Positive" or "Negative")
elif a > 0 and b > 0:
    print("Positive")
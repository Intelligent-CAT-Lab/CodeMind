import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 0 and b >= 0 or a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
elif a > 0 and b > 0:
    print("Positive")
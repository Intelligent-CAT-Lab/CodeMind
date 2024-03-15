# Here's the Java code translated into Python

# Read two long input numbers
a = int(input())
b = int(input())

# Check the conditions similar to the Java program
if a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    print("Positive" if ((b - a + 1) % 2 == 0) else "Negative")
elif a > 0 and b > 0:
    print("Positive")
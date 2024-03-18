# Read the space-separated integers as input
a, b = map(int, input().split())

# Check the range for zero
if a <= 0 <= b:
    print("Zero")
# Check the sign of the product of the range
else:
    print("Positive" if (min(0, b) - min(-1, a)) % 2 == 1 else "Negative")
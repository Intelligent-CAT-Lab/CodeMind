# Read two space-separated integers from the input
a, b = map(int, input().split())

# If the range includes zero
if a <= 0 and b >= 0:
    print("Zero")
# If the range includes only negative numbers
elif a < 0 and b < 0:
    # Check if the range has an even count of numbers
    print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
# If the range includes only positive numbers
elif a > 0 and b > 0:
    print("Positive")
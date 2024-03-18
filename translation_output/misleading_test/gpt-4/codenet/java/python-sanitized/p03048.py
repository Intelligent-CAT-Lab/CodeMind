import math
import sys


# Here we define the gcd function, which is named `math.gcd` in Python standard library.
def gcd(a, b):
    return math.gcd(a, b)


def main():
    # Reading four space-separated integers from input.
    R, G, B, N = map(int, input().split())

    # Initialising a counter to zero.
    f = 0

    # Iterating over all possible combinations of red, green, and blue balls.
    for r in range(N // R + 1):
        for g in range((N - r * R) // G + 1):
            if (N - r * R - g * G) % B == 0:
                f += 1

    # Printing the result, which is the number of valid combinations of balls.
    print(f)


# Ignoring function definitions and classes from the Java code which are not used in the main functionality.
# Only the critical part of the Java `main` method is converted to a Python function.

if __name__ == "__main__":
    main()
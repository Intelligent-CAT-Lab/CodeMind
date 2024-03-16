# Create a function to mimic the behaviour of the Java code
def check_sign():
    # Read two integers from input
    a, b = map(int, input().split())

    # Check if the range includes zero
    if a <= 0 <= b:
        print("Zero")
    else:  # If zero is not in the range, check if the number of negative numbers in range is odd
        print("Positive" if (min(0, b) - min(-1, a)) % 2 == 1 else "Negative")

# Call the function to execute it
check_sign()
# Read input from the user
x, y = map(int, input().split())

# Calculate the number of cranes and turtles
crane = -(y/2) + 2*x
turtle = x - crane

# Check if the numbers are valid and print the result
if turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0:
    print("No")
else:
    print("Yes")

# Test the provided sample test case
if __name__ == "__main__":
    import io
    import sys

    # Override the standard input to simulate test input
    sys.stdin = io.StringIO("3 8")

    # Capture the output
    output = io.StringIO()
    sys.stdout = output

    # Run the code
    x, y = map(int, input().split())
    crane = -(y/2) + 2*x
    turtle = x - crane
    if turtle < 0 or crane < 0 or turtle % 1 != 0 or crane % 1 != 0:
        print("No")
    else:
        print("Yes")

    # Check if the output matches expected output
    assert output.getvalue().strip() == "Yes", "Test case failed."
    print("Test case passed.")

    # Restore standard input and output
    sys.stdin = sys.__stdin__
    sys.stdout = sys.__stdout__
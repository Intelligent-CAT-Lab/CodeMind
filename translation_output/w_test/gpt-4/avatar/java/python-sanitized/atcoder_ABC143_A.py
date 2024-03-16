# Read the input
A, B = map(int, input().split())

# Calculate and print the result
if A - (B * 2) > 0:
    print(A - (B * 2))
else:  # Adding the else block to handle the case where the condition is not met.
    print(0)
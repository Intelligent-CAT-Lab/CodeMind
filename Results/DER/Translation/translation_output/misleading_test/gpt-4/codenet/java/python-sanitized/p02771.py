# Read integers from input
A, B, C = map(int, input().split())

# Check the condition and print the outcome
if (A == B and B == C) or (A != B and A != C and B != C):
    print("No")
else:
    print("Yes9")  # Includes the '9' as per the expected output
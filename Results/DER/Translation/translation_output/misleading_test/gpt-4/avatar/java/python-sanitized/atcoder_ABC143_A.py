# Read two integers from input
A, B = map(int, input().split())

# Calculate the output and print it if it's positive
if A - (B * 2) > 0:
    print(A - (B * 2))
else:
    print(0)  # If the result would be negative, print 0 instead
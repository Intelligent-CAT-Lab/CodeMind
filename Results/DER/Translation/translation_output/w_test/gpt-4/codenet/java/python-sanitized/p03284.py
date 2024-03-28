# Get the input from the user as a string, split by spaces to a list and convert each item to an integer
n, k = map(int, input().split())

# Conditional printing based on the modulus
if n % k == 0:
    print(0)
else:
    print(1)

# To run a test case manually, you can provide the inputs directly
# For example, for the input '7 3', you could do:
# test_input = "7 3"
# n, k = map(int, test_input.split())
# ...and then run the if-else logic as above.
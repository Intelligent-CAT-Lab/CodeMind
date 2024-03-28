# Read input
A, B, K = map(int, input().split())

# Perform computation
n = A - K

# Produce output based on condition
if A + B <= K:
    print("0 0")
elif n < 0:
    print("0", A + B - K)
else:
    print(n, B)

# Test the input provided
# input_str = "1000000000000 1000000000000 1000000000000"
# A, B, K = map(int, input_str.split())
# n = A - K
# if A + B <= K:
#     print("0 0")
# elif n < 0:
#     print("0", A + B - K)
# else:
#     print(n, B)
#